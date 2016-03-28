package com.pickle.Repository;

import com.pickle.Domain.TransaksiEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by andrikurniawan.id@gmail.com on 3/28/2016.
 */
@Repository
public interface TransaksiRepository extends CrudRepository<TransaksiEntity, Integer> {

    public TransaksiEntity countByIdBank(int idBank);

}
