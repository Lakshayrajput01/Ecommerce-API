package com.geekster.Ecommerce.API.repositories;

import com.geekster.Ecommerce.API.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users,Integer> {
}
