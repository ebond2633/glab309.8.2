package com._982.studentLogin.repository;

import org.springframework.context.annotation.Role;
import org.springframework.context.support.BeanDefinitionDsl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{

    BeanDefinitionDsl.Role findByName(String name);
}


