package com.space.suppourting.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.space.suppourting.etity.*;

//jparepo has 2 Param , the EntityType and the type of the PrimaryKey
public interface StudentRepo extends JpaRepository<Student, Long>
{



}
