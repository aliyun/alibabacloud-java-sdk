// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class StartBEClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartBEClusterResponseBody body;

    public static StartBEClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartBEClusterResponse self = new StartBEClusterResponse();
        return TeaModel.build(map, self);
    }

    public StartBEClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartBEClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartBEClusterResponse setBody(StartBEClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartBEClusterResponseBody getBody() {
        return this.body;
    }

}
