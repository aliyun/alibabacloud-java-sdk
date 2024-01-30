// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelStackOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelStackOperationResponseBody body;

    public static CancelStackOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelStackOperationResponse self = new CancelStackOperationResponse();
        return TeaModel.build(map, self);
    }

    public CancelStackOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelStackOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelStackOperationResponse setBody(CancelStackOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelStackOperationResponseBody getBody() {
        return this.body;
    }

}
