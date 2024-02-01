// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RecoverPhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoverPhysicalConnectionResponseBody body;

    public static RecoverPhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverPhysicalConnectionResponse self = new RecoverPhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public RecoverPhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverPhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverPhysicalConnectionResponse setBody(RecoverPhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
