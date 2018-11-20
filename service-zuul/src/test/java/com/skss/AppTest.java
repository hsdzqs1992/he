package com.skss;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import java.net.URI;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //测试公司的API接口，将json当做一个字符串传入httppost的请求体
               String result = null;
               HttpClient client = HttpClients.createDefault();
               URIBuilder builder = new URIBuilder();
               URI uri = null;
               try {
                   // http://localhost:8881/actuator/bus-refresh
                   uri = builder.setScheme("http")
                             .setHost("localhost").setPort(8881)
                              .setPath("/actuator/bus-refresh")
                              .build();

                    HttpPost post = new HttpPost(uri);
                    //设置请求头
                    post.setHeader("Content-Type", "application/json");
                    String body = "{\"Key\": \"\",\"Secret\": \"\"}";
                    //设置请求体
                    post.setEntity(new StringEntity(body));
                    //获取返回信息
                    HttpResponse response = client.execute(post);
                    result = response.toString();
                } catch (Exception e) {
                    System.out.println("接口请求失败"+e.getStackTrace());
                }
                System.out.println(result);

    }
}
