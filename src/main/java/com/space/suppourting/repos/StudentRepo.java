package com.space.suppourting.repos;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import com.space.suppourting.etity.*;
import org.springframework.stereotype.Repository;

//jparepo has 2 Param , the EntityType and the type of the PrimaryKey
@Repository
public interface StudentRepo extends JpaRepository<Student, Long>
{



}
