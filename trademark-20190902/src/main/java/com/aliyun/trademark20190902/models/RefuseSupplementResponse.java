// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class RefuseSupplementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefuseSupplementResponseBody body;

    public static RefuseSupplementResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseSupplementResponse self = new RefuseSupplementResponse();
        return TeaModel.build(map, self);
    }

    public RefuseSupplementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefuseSupplementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefuseSupplementResponse setBody(RefuseSupplementResponseBody body) {
        this.body = body;
        return this;
    }
    public RefuseSupplementResponseBody getBody() {
        return this.body;
    }

}
