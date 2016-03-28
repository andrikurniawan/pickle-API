package com.pickle.Service;

import com.pickle.Domain.TransaksiEntity;
import com.pickle.Repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andrikurniawan.id@gmail.com on 3/28/2016.
 */
@Service
public class TransaksiService {
    @Autowired
    private TransaksiRepository transaksiRepository;

    public TransaksiEntity hitungTotalSampah(int idBank){
        TransaksiEntity hasil = transaksiRepository.countByIdBank(idBank);
        return hasil;
    }
}
