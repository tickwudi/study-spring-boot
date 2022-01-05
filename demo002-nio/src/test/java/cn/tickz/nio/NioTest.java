package cn.tickz.nio;

import org.junit.Test;

import java.io.*;

public class NioTest {
    @Test
    public void fileStreamTest() throws IOException {
        System.out.println(new File(".").getAbsolutePath());
        InputStream inputStream=null;

        try {
            inputStream=new BufferedInputStream(new FileInputStream("src/main/resources/abc.txt"));
            byte[] buf=new byte[1024];
            int read = inputStream.read(buf);
            while (read!=-1){
                for (int i=0;i<read;i++){
                    System.out.println(buf[i]);
                }
                read=inputStream.read(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            if(inputStream!=null){
                inputStream.close();
            }
        }

    }
    @Test
    public void fileChannelTest(){

    }
}
