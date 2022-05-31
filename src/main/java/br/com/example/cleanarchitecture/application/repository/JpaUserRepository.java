package br.com.example.cleanarchitecture.application.repository;

import br.com.example.cleanarchitecture.application.data.UserDataMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<UserDataMapper, String> {
}
