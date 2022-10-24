
package com.backendportfolio.gda.Security.Repository;


import com.backendportfolio.gda.Security.Entity.Rol;
import com.backendportfolio.gda.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}