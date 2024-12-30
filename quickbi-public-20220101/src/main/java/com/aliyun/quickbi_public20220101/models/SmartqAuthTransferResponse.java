// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SmartqAuthTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SmartqAuthTransferResponseBody body;

    public static SmartqAuthTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        SmartqAuthTransferResponse self = new SmartqAuthTransferResponse();
        return TeaModel.build(map, self);
    }

    public SmartqAuthTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmartqAuthTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SmartqAuthTransferResponse setBody(SmartqAuthTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public SmartqAuthTransferResponseBody getBody() {
        return this.body;
    }

}
