package br.com.guiareze.school.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import br.com.guiareze.school.model.*;

@Repository
public interface StudentsRepository extends MongoRepository<Students,String>{

}
