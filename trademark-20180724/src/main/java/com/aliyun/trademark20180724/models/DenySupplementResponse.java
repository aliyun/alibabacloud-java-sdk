// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DenySupplementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DenySupplementResponseBody body;

    public static DenySupplementResponse build(java.util.Map<String, ?> map) throws Exception {
        DenySupplementResponse self = new DenySupplementResponse();
        return TeaModel.build(map, self);
    }

    public DenySupplementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DenySupplementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DenySupplementResponse setBody(DenySupplementResponseBody body) {
        this.body = body;
        return this;
    }
    public DenySupplementResponseBody getBody() {
        return this.body;
    }

}
