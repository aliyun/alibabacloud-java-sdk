// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopViewResponseBody body;

    public static StopViewResponse build(java.util.Map<String, ?> map) throws Exception {
        StopViewResponse self = new StopViewResponse();
        return TeaModel.build(map, self);
    }

    public StopViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopViewResponse setBody(StopViewResponseBody body) {
        this.body = body;
        return this;
    }
    public StopViewResponseBody getBody() {
        return this.body;
    }

}
