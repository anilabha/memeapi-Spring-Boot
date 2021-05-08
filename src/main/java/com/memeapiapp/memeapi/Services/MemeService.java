package com.memeapiapp.memeapi.Services;

import com.memeapiapp.memeapi.Models.MemeModel;
import com.memeapiapp.memeapi.Repositorys.MemeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemeService {
    private MemeRepository memeRepository;

    public MemeService(MemeRepository memeRepository) {
        this.memeRepository = memeRepository;
    }

    public List<MemeModel> getalldata() {
        return (List<MemeModel>) memeRepository.findAll();
    }

    public void insurtdata(MemeModel memeModel) {

        memeRepository.save(memeModel);
    }

    public Optional<MemeModel> findonedata(Long id) {
        return memeRepository.findById(id);
    }

    public void deletedata(Long id) {

        memeRepository.deleteById(id);
    }


}
