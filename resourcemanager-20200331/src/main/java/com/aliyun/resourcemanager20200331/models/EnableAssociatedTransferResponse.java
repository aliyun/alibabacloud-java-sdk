// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class EnableAssociatedTransferResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableAssociatedTransferResponseBody body;

    public static EnableAssociatedTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableAssociatedTransferResponse self = new EnableAssociatedTransferResponse();
        return TeaModel.build(map, self);
    }

    public EnableAssociatedTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableAssociatedTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableAssociatedTransferResponse setBody(EnableAssociatedTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableAssociatedTransferResponseBody getBody() {
        return this.body;
    }

}
