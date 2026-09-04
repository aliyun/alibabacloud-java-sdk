// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageLanguageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadMessageLanguageResponseBody body;

    public static ReadMessageLanguageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageLanguageResponse self = new ReadMessageLanguageResponse();
        return TeaModel.build(map, self);
    }

    public ReadMessageLanguageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMessageLanguageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadMessageLanguageResponse setBody(ReadMessageLanguageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMessageLanguageResponseBody getBody() {
        return this.body;
    }

}
