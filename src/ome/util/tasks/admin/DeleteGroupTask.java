/*
 * ome.util.tasks.admin.AddGroupTask
 *
 *   Copyright 2006 University of Dundee. All rights reserved.
 *   Use is subject to license terms supplied in LICENSE.txt
 */

package ome.util.tasks.admin;

// Java imports
import java.util.Properties;

// Third-party libraries

// Application-internal dependencies
import ome.annotations.RevisionDate;
import ome.annotations.RevisionNumber;
import ome.api.IAdmin;
import ome.api.IUpdate;
import ome.model.meta.Experimenter;
import ome.model.meta.ExperimenterGroup;
import ome.system.ServiceFactory;
import ome.util.tasks.Configuration;
import ome.util.tasks.SimpleTask;

import static ome.util.tasks.admin.DeleteGroupTask.Keys.*;

/**
 * {@link SimpleTask} which deletes an {@link ExperimenterGroup} if possible.
 * 
 * Understands the parameters:
 * <ul>
 * <li>group</li>
 * </ul>
 * 
 * Must be logged in as an administrator. See {@link Configuration} on how to do
 * this.
 * 
 * @author Josh Moore, josh.moore at gmx.de
 * @see SimpleTask
 * @since 3.0-Beta2
 */
@RevisionDate("$Date: 2007-01-24 17:23:09 +0100 (Wed, 24 Jan 2007) $")
@RevisionNumber("$Revision: 1208 $")
public class DeleteGroupTask extends SimpleTask {

    /**
     * Enumeration of the string values which will be used directly by
     * {@link DeleteGroupTask}.
     */
    public enum Keys {
        group
    }

    /** Delegates to super */
    public DeleteGroupTask(ServiceFactory sf, Properties p) {
        super(sf, p);
    }

    /**
     * Performs the actual {@link ExperimenterGroup} deletion.
     */
    @Override
    public void doTask() {
        super.doTask(); // logs
        final IAdmin admin = getServiceFactory().getAdminService();
        ExperimenterGroup g = admin.lookupGroup(enumValue(group));
        g.unload();
        getServiceFactory().getUpdateService().deleteObject(g);
        getLogger().info(
                String.format("Deleted group %s with id %d", enumValue(group),
                        g.getId()));
    }
}