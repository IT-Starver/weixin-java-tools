package me.chanjar.weixin.mp.api;

import com.google.inject.Inject;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.test.ApiTestModule;
import org.testng.*;
import org.testng.annotations.*;

/**
 * 测试短连接
 *
 * @author chanjarster
 */
@Test(groups = "shortURLAPI")
@Guice(modules = ApiTestModule.class)
public class WxMpShortUrlAPITest {

  @Inject
  protected WxMpService wxService;

  public void testShortUrl() throws WxErrorException {
    String shortUrl = this.wxService.shortUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxa1b7724d974ee24d&redirect_uri=http%3A%2F%2Fwx.bjmantis.net&response_type=code&scope=snsapi_base&state=123#wechat_redirect");
    Assert.assertNotNull(shortUrl);
  }

}
