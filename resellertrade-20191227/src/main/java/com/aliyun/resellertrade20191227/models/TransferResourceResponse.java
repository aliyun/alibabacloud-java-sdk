// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class TransferResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferResourceResponseBody body;

    public static TransferResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferResourceResponse self = new TransferResourceResponse();
        return TeaModel.build(map, self);
    }

    public TransferResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferResourceResponse setBody(TransferResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferResourceResponseBody getBody() {
        return this.body;
    }

}
