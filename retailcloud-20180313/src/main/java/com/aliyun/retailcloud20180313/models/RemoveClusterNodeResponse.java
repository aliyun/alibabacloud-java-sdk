// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class RemoveClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveClusterNodeResponseBody body;

    public static RemoveClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveClusterNodeResponse self = new RemoveClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public RemoveClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveClusterNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveClusterNodeResponse setBody(RemoveClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveClusterNodeResponseBody getBody() {
        return this.body;
    }

}
