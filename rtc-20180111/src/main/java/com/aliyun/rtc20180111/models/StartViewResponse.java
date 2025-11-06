// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartViewResponseBody body;

    public static StartViewResponse build(java.util.Map<String, ?> map) throws Exception {
        StartViewResponse self = new StartViewResponse();
        return TeaModel.build(map, self);
    }

    public StartViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartViewResponse setBody(StartViewResponseBody body) {
        this.body = body;
        return this;
    }
    public StartViewResponseBody getBody() {
        return this.body;
    }

}
