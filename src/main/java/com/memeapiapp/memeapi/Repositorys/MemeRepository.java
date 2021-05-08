package com.memeapiapp.memeapi.Repositorys;

import com.memeapiapp.memeapi.Models.MemeModel;
import org.springframework.data.repository.CrudRepository;

public interface MemeRepository extends CrudRepository<MemeModel,Long> {

}
