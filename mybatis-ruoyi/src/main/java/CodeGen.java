import com.anj.AnjApplication;
import com.anj.common.support.Convert;
import com.anj.generator.service.IGenService;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileOutputStream;

@RunWith(SpringRunner.class)
//SpringBootTest 是springboot 用于测试的注解，可指定启动类或者测试环境等，这里直接默认。
@SpringBootTest(classes = {AnjApplication.class})
public class CodeGen {

    @Autowired
    private IGenService genService;

    @Value("${gen.tables}")
    String tables;
    @Value("${gen.outpath}")
    String outpath = "c:/code.zip";

    @Test
    public void test() throws Exception {
        String[] tableNames = Convert.toStrArray(tables);
        byte[]   data       = genService.generatorCode(tableNames);
        IOUtils.write(data, new FileOutputStream(outpath));
        System.out.println("=====文件输出到 : " + outpath);
    }
}