// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumeTimespanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumeTimespanResponseBody body;

    public static GetConsumeTimespanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumeTimespanResponse self = new GetConsumeTimespanResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumeTimespanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumeTimespanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumeTimespanResponse setBody(GetConsumeTimespanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumeTimespanResponseBody getBody() {
        return this.body;
    }

}
