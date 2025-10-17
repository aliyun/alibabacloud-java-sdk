// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetAccountZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAccountZonalResponseBody body;

    public static ResetAccountZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountZonalResponse self = new ResetAccountZonalResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAccountZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAccountZonalResponse setBody(ResetAccountZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAccountZonalResponseBody getBody() {
        return this.body;
    }

}
