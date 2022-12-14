package ShopTicket.repository;

import ShopTicket.model.Ruolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo,Long>{
    Ruolo findByNome(String nome);
}