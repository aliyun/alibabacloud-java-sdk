// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class NotifyResourceAddressFamilyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public NotifyResourceAddressFamilyResponseBody body;

    public static NotifyResourceAddressFamilyResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyResourceAddressFamilyResponse self = new NotifyResourceAddressFamilyResponse();
        return TeaModel.build(map, self);
    }

    public NotifyResourceAddressFamilyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyResourceAddressFamilyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NotifyResourceAddressFamilyResponse setBody(NotifyResourceAddressFamilyResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyResourceAddressFamilyResponseBody getBody() {
        return this.body;
    }

}
