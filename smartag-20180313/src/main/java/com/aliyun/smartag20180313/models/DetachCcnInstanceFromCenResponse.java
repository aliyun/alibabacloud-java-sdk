// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DetachCcnInstanceFromCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachCcnInstanceFromCenResponseBody body;

    public static DetachCcnInstanceFromCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachCcnInstanceFromCenResponse self = new DetachCcnInstanceFromCenResponse();
        return TeaModel.build(map, self);
    }

    public DetachCcnInstanceFromCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachCcnInstanceFromCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachCcnInstanceFromCenResponse setBody(DetachCcnInstanceFromCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachCcnInstanceFromCenResponseBody getBody() {
        return this.body;
    }

}
