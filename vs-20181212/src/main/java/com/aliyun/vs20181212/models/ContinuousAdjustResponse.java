// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ContinuousAdjustResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContinuousAdjustResponseBody body;

    public static ContinuousAdjustResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuousAdjustResponse self = new ContinuousAdjustResponse();
        return TeaModel.build(map, self);
    }

    public ContinuousAdjustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinuousAdjustResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContinuousAdjustResponse setBody(ContinuousAdjustResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinuousAdjustResponseBody getBody() {
        return this.body;
    }

}
