package com.laioffer.jupiter.entity;

//{
//        "id": "12924",
//        "name": "Warcraft III",
//        "box_art_url": "https://static-cdn.jtvnw.net/ttv-boxart/Warcraft%20III-{width}x{height}.jpg"
//}
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//if the data is null, do not convert
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(builder = Game.Builder.class)

public class Game {

    private final String id;


    private final String name;


    private final String boxArtUrl;

    private Game(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.boxArtUrl = builder.boxArtUrl;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("box_art_url")
    public String getBoxArtUrl() {
        return boxArtUrl;
    }




    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)

    public static class Builder {
        @JsonProperty("id")
        private String id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("box_art_url")
        private String boxArtUrl;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder boxArtUrl(String boxArtUrl) {
            this.boxArtUrl = boxArtUrl;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }

}




