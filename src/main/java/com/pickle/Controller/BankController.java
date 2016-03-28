package com.pickle.Controller;

import com.pickle.Domain.BanksampahEntity;
import com.pickle.Domain.TransaksiEntity;
import com.pickle.Domain.Wrapper;
import com.pickle.Service.BankService;
import com.pickle.Service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andrikurniawan.id@gmail.com on 3/17/2016.
 */
@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @Autowired
    private TransaksiService transaksiService;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Wrapper login(@RequestParam("phoneNumber")String phoneNumber, @RequestParam("password")String password){
        BanksampahEntity bankResult = bankService.validation(phoneNumber,password);
        if (bankResult != null){
            TransaksiEntity hasil = transaksiService.hitungTotalSampah(bankResult.getId());
            return new Wrapper(200,"Login", hasil);
        }else{
            return new Wrapper(200,"Gagal", null);
        }
    }
}
