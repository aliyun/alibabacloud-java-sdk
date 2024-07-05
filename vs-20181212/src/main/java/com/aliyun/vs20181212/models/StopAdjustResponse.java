// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopAdjustResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAdjustResponseBody body;

    public static StopAdjustResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAdjustResponse self = new StopAdjustResponse();
        return TeaModel.build(map, self);
    }

    public StopAdjustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAdjustResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAdjustResponse setBody(StopAdjustResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAdjustResponseBody getBody() {
        return this.body;
    }

}
