package org.openmicroscopy.omero.model;

import org.openmicroscopy.omero.BaseModelUtils;
import ome.util.Filterable;
import ome.util.Filter;


import java.util.*;




/**
 * SemanticTypeOutput generated by hbm2java
 */
public class
SemanticTypeOutput 
implements java.io.Serializable ,
org.openmicroscopy.omero.OMEModel,
ome.util.Filterable {

    // Fields    

     private Integer semanticTypeOutputId;
     private SemanticType semanticType;
     private ModuleExecution moduleExecution;


    // Constructors

    /** default constructor */
    public SemanticTypeOutput() {
    }
    
    /** constructor with id */
    public SemanticTypeOutput(Integer semanticTypeOutputId) {
        this.semanticTypeOutputId = semanticTypeOutputId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getSemanticTypeOutputId() {
        return this.semanticTypeOutputId;
    }
    
    public void setSemanticTypeOutputId(Integer semanticTypeOutputId) {
        this.semanticTypeOutputId = semanticTypeOutputId;
    }

    /**
     * 
     */
    public SemanticType getSemanticType() {
        return this.semanticType;
    }
    
    public void setSemanticType(SemanticType semanticType) {
        this.semanticType = semanticType;
    }

    /**
     * 
     */
    public ModuleExecution getModuleExecution() {
        return this.moduleExecution;
    }
    
    public void setModuleExecution(ModuleExecution moduleExecution) {
        this.moduleExecution = moduleExecution;
    }





	/** utility methods. Container may re-assign this. */	
	protected static org.openmicroscopy.omero.BaseModelUtils _utils = 
		new org.openmicroscopy.omero.BaseModelUtils();
	public BaseModelUtils getUtils(){
		return _utils;
	}
	public void setUtils(BaseModelUtils utils){
		_utils = utils;
	}

  public boolean acceptFilter(Filter filter){


	  // Visiting: SemanticTypeOutputId ------------------------------------------
	  Integer _SemanticTypeOutputId = null;
	  try {
	     _SemanticTypeOutputId = getSemanticTypeOutputId();
	  } catch (Exception e) {
		 setSemanticTypeOutputId(null);
	  }
// TODO catch class cast?
	  setSemanticTypeOutputId((Integer) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.SemanticTypeOutput):SemanticTypeOutputId",_SemanticTypeOutputId)); 

	  // Visiting: SemanticType ------------------------------------------
	  SemanticType _SemanticType = null;
	  try {
	     _SemanticType = getSemanticType();
	  } catch (Exception e) {
		 setSemanticType(null);
	  }
// TODO catch class cast?
	  setSemanticType((SemanticType) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.SemanticTypeOutput):SemanticType",_SemanticType)); 

	  // Visiting: ModuleExecution ------------------------------------------
	  ModuleExecution _ModuleExecution = null;
	  try {
	     _ModuleExecution = getModuleExecution();
	  } catch (Exception e) {
		 setModuleExecution(null);
	  }
// TODO catch class cast?
	  setModuleExecution((ModuleExecution) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.SemanticTypeOutput):ModuleExecution",_ModuleExecution)); 
   	 return true;
  }
  
  public String toString(){
	return "SemanticTypeOutput"+(semanticTypeOutputId==null ? ":Hash"+this.hashCode() : ":"+semanticTypeOutputId);
  }
  


}
