package qianfeng.a3_5resolver_application;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private ContentResolver resolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resolver = getContentResolver();
    }


    public void onclick1(View view) { // 向USER表中添加数据
        ContentValues values = new ContentValues();
        values.put("username","zhangsan");
        values.put("password","121212");
        values.put("nickname","张三");
        values.put("username","lisi");
        values.put("password","23233323");
        values.put("nickname","李四");
        resolver.insert(Uri.parse("content://qianfeng.a3_5contentproviderapplication.mycontentprovider/user"),values);

    }

    public void onclick2(View view) { // 向FOOD表中添加数据

        ContentValues values = new ContentValues();
        values.put("foodname","苹果");
        values.put("foodcolor","red");
        values.put("foodprice","9");
        resolver.insert(Uri.parse("content://qianfeng.a3_5contentproviderapplication.mycontentprovider/food"),values);
    }


    public void deleteAllUser(View view) {
        int delete = resolver.delete(Uri.parse("content://qianfeng.a3_5contentproviderapplication.mycontentprovider/user"), null, null);
        Log.d("google-my:", "deleteAllUser: " + delete);
    }

    public void deleteAllFood(View view) {
        int delete = resolver.delete(Uri.parse("content://qianfeng.a3_5contentproviderapplication.mycontentprovider/food"), null, null);
        Log.d("google-my:", "deleteAllFood: " + delete);

    }

    public void deleteUserById(View view) {
        int delete = resolver.delete(Uri.parse("content://qianfeng.a3_5contentproviderapplication.mycontentprovider/user/3"), null, null);
        Log.d("google-my:", "deleteUserById: " + delete);
    }

    public void deleteUserByKeywords(View view) {
        int delete = resolver.delete(Uri.parse("content://qianfeng.a3_5contentproviderapplication.mycontentprovider/user/zh"), null, null);
        Log.d("google-my:", "deleteUserByKeywords: " + delete);
    }

    public void queryAllUser(View view) {

    }

    public void queryUser(View view) {

    }

    public void updateUser(View view) {

    }

    public void updateUserById(View view) {
        
    }
}
