// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AttachCcnInstanceToCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachCcnInstanceToCenResponseBody body;

    public static AttachCcnInstanceToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachCcnInstanceToCenResponse self = new AttachCcnInstanceToCenResponse();
        return TeaModel.build(map, self);
    }

    public AttachCcnInstanceToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachCcnInstanceToCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachCcnInstanceToCenResponse setBody(AttachCcnInstanceToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachCcnInstanceToCenResponseBody getBody() {
        return this.body;
    }

}
