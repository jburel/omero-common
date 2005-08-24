package org.openmicroscopy.omero.model;

import org.openmicroscopy.omero.BaseModelUtils;
import ome.util.Filterable;
import ome.util.Filter;


import java.util.*;




/**
 * Category generated by hbm2java
 */
public class
Category 
implements java.io.Serializable ,
org.openmicroscopy.omero.OMEModel,
ome.util.Filterable {

    // Fields    

     private Integer attributeId;
     private String name;
     private String description;
     private Set classifications;
     private CategoryGroup categoryGroup;
     private ModuleExecution moduleExecution;


    // Constructors

    /** default constructor */
    public Category() {
    }
    
    /** constructor with id */
    public Category(Integer attributeId) {
        this.attributeId = attributeId;
    }
   
    
    

    // Property accessors

    /**
     * 
     */
    public Integer getAttributeId() {
        return this.attributeId;
    }
    
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * 
     */
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     */
    public Set getClassifications() {
        return this.classifications;
    }
    
    public void setClassifications(Set classifications) {
        this.classifications = classifications;
    }

    /**
     * 
     */
    public CategoryGroup getCategoryGroup() {
        return this.categoryGroup;
    }
    
    public void setCategoryGroup(CategoryGroup categoryGroup) {
        this.categoryGroup = categoryGroup;
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


	  // Visiting: AttributeId ------------------------------------------
	  Integer _AttributeId = null;
	  try {
	     _AttributeId = getAttributeId();
	  } catch (Exception e) {
		 setAttributeId(null);
	  }
// TODO catch class cast?
	  setAttributeId((Integer) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.Category):AttributeId",_AttributeId)); 

	  // Visiting: Name ------------------------------------------
	  String _Name = null;
	  try {
	     _Name = getName();
	  } catch (Exception e) {
		 setName(null);
	  }
// TODO catch class cast?
	  setName((String) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.Category):Name",_Name)); 

	  // Visiting: Description ------------------------------------------
	  String _Description = null;
	  try {
	     _Description = getDescription();
	  } catch (Exception e) {
		 setDescription(null);
	  }
// TODO catch class cast?
	  setDescription((String) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.Category):Description",_Description)); 

	  // Visiting: Classifications ------------------------------------------
	  Set _Classifications = null;
	  try {
	     _Classifications = getClassifications();
	  } catch (Exception e) {
		 setClassifications(null);
	  }
// TODO catch class cast?
	  setClassifications((Set) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.Category):Classifications",_Classifications)); 

	  // Visiting: CategoryGroup ------------------------------------------
	  CategoryGroup _CategoryGroup = null;
	  try {
	     _CategoryGroup = getCategoryGroup();
	  } catch (Exception e) {
		 setCategoryGroup(null);
	  }
// TODO catch class cast?
	  setCategoryGroup((CategoryGroup) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.Category):CategoryGroup",_CategoryGroup)); 

	  // Visiting: ModuleExecution ------------------------------------------
	  ModuleExecution _ModuleExecution = null;
	  try {
	     _ModuleExecution = getModuleExecution();
	  } catch (Exception e) {
		 setModuleExecution(null);
	  }
// TODO catch class cast?
	  setModuleExecution((ModuleExecution) filter.filter("org.hibernate.mapping.RootClass(org.openmicroscopy.omero.model.Category):ModuleExecution",_ModuleExecution)); 
   	 return true;
  }
  
  public String toString(){
	return "Category"+(attributeId==null ? ":Hash"+this.hashCode() : ":"+attributeId);
  }
  


}
