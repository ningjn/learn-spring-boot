package org.lambda.gsrestservice;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }
}
