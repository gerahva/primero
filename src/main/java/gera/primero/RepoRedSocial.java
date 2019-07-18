package gera.primero;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RepoRedSocial extends MongoRepository<RedSocial,String> {

    List<RedSocial> findByNickname(String nickname);
}
