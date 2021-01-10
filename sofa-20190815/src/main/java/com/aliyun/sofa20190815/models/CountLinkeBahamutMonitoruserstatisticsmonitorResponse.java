// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutMonitoruserstatisticsmonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountLinkeBahamutMonitoruserstatisticsmonitorResponseBody body;

    public static CountLinkeBahamutMonitoruserstatisticsmonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutMonitoruserstatisticsmonitorResponse self = new CountLinkeBahamutMonitoruserstatisticsmonitorResponse();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutMonitoruserstatisticsmonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountLinkeBahamutMonitoruserstatisticsmonitorResponse setBody(CountLinkeBahamutMonitoruserstatisticsmonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public CountLinkeBahamutMonitoruserstatisticsmonitorResponseBody getBody() {
        return this.body;
    }

}
