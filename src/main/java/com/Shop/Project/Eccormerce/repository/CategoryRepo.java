package com.Shop.Project.Eccormerce.repository;

import com.Shop.Project.Eccormerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
