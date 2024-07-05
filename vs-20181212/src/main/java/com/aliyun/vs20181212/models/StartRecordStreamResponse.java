// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartRecordStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRecordStreamResponseBody body;

    public static StartRecordStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRecordStreamResponse self = new StartRecordStreamResponse();
        return TeaModel.build(map, self);
    }

    public StartRecordStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRecordStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRecordStreamResponse setBody(StartRecordStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRecordStreamResponseBody getBody() {
        return this.body;
    }

}
