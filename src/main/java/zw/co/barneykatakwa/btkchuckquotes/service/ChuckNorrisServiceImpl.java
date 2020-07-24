package zw.co.barneykatakwa.btkchuckquotes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Project Name btk-chuck-quotes
 * Developed by bkatakwa
 * Date         24/7/2020
 */
@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomQuote(){
       return chuckNorrisQuotes.getRandomQuote();
    }
}
