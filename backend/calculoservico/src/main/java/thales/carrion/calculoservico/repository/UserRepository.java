package thales.carrion.calculoservico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thales.carrion.calculoservico.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
