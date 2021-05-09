package com.memeapiapp.memeapi.Repositorys;

import com.memeapiapp.memeapi.Models.MemeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<MemeModel,String> {

}
