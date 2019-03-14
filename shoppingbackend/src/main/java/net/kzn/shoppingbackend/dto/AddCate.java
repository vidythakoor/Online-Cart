package net.kzn.shoppingbackend.dto;

public class AddCate {

	private String categoryName;
	
	private String categoryDescription;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "AddCate [categoryName=" + categoryName + ", categoryDescription=" + categoryDescription + "]";
	}

 
	
}
