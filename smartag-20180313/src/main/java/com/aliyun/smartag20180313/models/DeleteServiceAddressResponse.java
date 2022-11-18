// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteServiceAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceAddressResponseBody body;

    public static DeleteServiceAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceAddressResponse self = new DeleteServiceAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceAddressResponse setBody(DeleteServiceAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceAddressResponseBody getBody() {
        return this.body;
    }

}
