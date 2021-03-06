package cn.zhang.qiang.hellgate.net;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * <p>
 * Created by mrZQ on 2017/4/5.
 */

public interface HellGate {

    @GET("/")
    Call<String> host();
//    Set-Cookie:JSESSIONID=DEF2DD9692EDCE8B1D7AA75927241FA2
//    Cookie:JSESSIONID=DEF2DD9692EDCE8B1D7AA75927241FA2
    
    //    http://haowanba.com/cardh.php?name=28741114&pwd=123455&url=0&exuid=&action=passport&_do=&time=20170408113808
    @GET("cardh.php")
    Call<String> login(@Query("name") String username, @Query("pwd") String password,
                       @Query("url") String url, @Query("exuid") String exuid,
                       @Query("action") String action, @Query("_do") String _do,
                       @Query("time") String time);

    //    http://haowanba.com/cardh.php?action=passport&book=0&name=28741114&pwd=123455&url=&_do=
    @GET("cardh.php")
    Call<String> register(@Query("action") String action, @Query("book") String book,
                          @Query("name") String name, @Query("pwd") String pwd,
                          @Query("url") String url, @Query("_do") String _do);

}
