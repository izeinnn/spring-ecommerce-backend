package com.Shop.Project.Eccormerce.service.interf;

import com.Shop.Project.Eccormerce.dto.CategoryDto;
import com.Shop.Project.Eccormerce.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
