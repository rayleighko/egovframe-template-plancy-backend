package egovframework.com;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * fileName       : ProfileTestProd
 * author         : crlee
 * date           : 2023/04/28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/28        crlee       최초 생성
 */
@SpringBootTest
@ActiveProfiles("prod")
public class ProfileTestProd {

    @Value("${Globals.DbType}")
    String dbType;

    @Value("${Globals.OsType}")
    String osType;

    @Value("${logging.rollingpolicy.maxHistory}")
    String maxHistory;
    @Test
    void propertyTest() {
        Assertions.assertThat(dbType).isEqualTo("hsql");
        Assertions.assertThat(osType).isEqualTo("LINUX");
        Assertions.assertThat(maxHistory).isEqualTo("90");
    }
}
