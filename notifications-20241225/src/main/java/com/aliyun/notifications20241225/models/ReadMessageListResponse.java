// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadMessageListResponseBody body;

    public static ReadMessageListResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageListResponse self = new ReadMessageListResponse();
        return TeaModel.build(map, self);
    }

    public ReadMessageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMessageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadMessageListResponse setBody(ReadMessageListResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMessageListResponseBody getBody() {
        return this.body;
    }

}
