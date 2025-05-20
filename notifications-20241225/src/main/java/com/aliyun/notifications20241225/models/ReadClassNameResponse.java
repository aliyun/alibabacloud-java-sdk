// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadClassNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadClassNameResponseBody body;

    public static ReadClassNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadClassNameResponse self = new ReadClassNameResponse();
        return TeaModel.build(map, self);
    }

    public ReadClassNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadClassNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadClassNameResponse setBody(ReadClassNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadClassNameResponseBody getBody() {
        return this.body;
    }

}
