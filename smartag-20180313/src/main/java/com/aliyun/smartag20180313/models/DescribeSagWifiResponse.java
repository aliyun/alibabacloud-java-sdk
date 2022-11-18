// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWifiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagWifiResponseBody body;

    public static DescribeSagWifiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWifiResponse self = new DescribeSagWifiResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagWifiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagWifiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagWifiResponse setBody(DescribeSagWifiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagWifiResponseBody getBody() {
        return this.body;
    }

}
