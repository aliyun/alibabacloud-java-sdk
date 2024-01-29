// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DisableAssociatedTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableAssociatedTransferResponseBody body;

    public static DisableAssociatedTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableAssociatedTransferResponse self = new DisableAssociatedTransferResponse();
        return TeaModel.build(map, self);
    }

    public DisableAssociatedTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableAssociatedTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableAssociatedTransferResponse setBody(DisableAssociatedTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableAssociatedTransferResponseBody getBody() {
        return this.body;
    }

}
