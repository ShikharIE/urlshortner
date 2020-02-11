package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UrlMapperRepo;

@Service
public class UrlMapperService {
    @Autowired
    private UrlMapperRepo urlMapperRepo;
    @Autowired
    private RandomGen randomGen;

    public String createUrl(String url)
    {
        String s=null;
        return s;
    }
}
