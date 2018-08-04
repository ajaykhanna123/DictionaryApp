package com.example.ajaykhanna.mydictionary;


import java.io.Serializable;

public class DictObjectModel implements Serializable {

        String word, meaning;

        public DictObjectModel(String word, String meaning){

            this.word=word;
            this.meaning = meaning;


        }
        public  String getWord()
        {
            return word;
        }

        public  String getMeaning()
        {
            return meaning;
        }

}
