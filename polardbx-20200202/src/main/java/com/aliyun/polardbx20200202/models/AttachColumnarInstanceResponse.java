// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AttachColumnarInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachColumnarInstanceResponseBody body;

    public static AttachColumnarInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachColumnarInstanceResponse self = new AttachColumnarInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AttachColumnarInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachColumnarInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachColumnarInstanceResponse setBody(AttachColumnarInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachColumnarInstanceResponseBody getBody() {
        return this.body;
    }

}
