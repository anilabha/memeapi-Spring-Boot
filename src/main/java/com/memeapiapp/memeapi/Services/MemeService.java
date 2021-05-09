package com.memeapiapp.memeapi.Services;

import com.memeapiapp.memeapi.Models.MemeModel;
import com.memeapiapp.memeapi.Repositorys.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MemeService {
    private MemeRepository memeRepository;

    @Autowired
    public MemeService(MemeRepository memeRepository) {
        this.memeRepository = memeRepository;
    }

    public void save(MultipartFile file) throws IOException {
        MemeModel memeModel = new MemeModel();
        memeModel.setName(StringUtils.cleanPath(file.getOriginalFilename()));
        memeModel.setContentType(file.getContentType());
        memeModel.setData(file.getBytes());
        memeModel.setSize(file.getSize());

        memeRepository.save(memeModel);
    }

    public Optional<MemeModel> getFile(String id) {
        return memeRepository.findById(id);
    }

    public List<MemeModel> getAllFiles() {
        return memeRepository.findAll();
    }
    public void deleteFile(String id){
        memeRepository.deleteById(id);
    }
}
