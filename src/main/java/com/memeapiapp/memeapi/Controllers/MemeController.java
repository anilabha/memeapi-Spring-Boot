package com.memeapiapp.memeapi.Controllers;

import com.memeapiapp.memeapi.Models.MemeModel;
import com.memeapiapp.memeapi.Services.MemeService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/memeapi/v1")
public class MemeController {
    private MemeService memeService;

    public MemeController(MemeService memeService) {
        this.memeService = memeService;
    }

    @RequestMapping(method= RequestMethod.GET,value = "/getmeme")
    public List<MemeModel> getallmeme() {
        return memeService.getalldata();
    }
    @RequestMapping(method = RequestMethod.POST,value = "/addmeme")
    public void insertmeme(@RequestBody MemeModel memeModel){
        memeService.insurtdata(memeModel);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/getmeme/{id}")
    public Optional<MemeModel> getonememe(@PathVariable Long id){
        return memeService.findonedata(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void deletememe(@PathVariable Long id){
        memeService.deletedata(id);
    }


}
