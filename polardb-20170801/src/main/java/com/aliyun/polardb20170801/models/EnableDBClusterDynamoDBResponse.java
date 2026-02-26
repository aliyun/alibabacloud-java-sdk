// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterDynamoDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDBClusterDynamoDBResponseBody body;

    public static EnableDBClusterDynamoDBResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterDynamoDBResponse self = new EnableDBClusterDynamoDBResponse();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterDynamoDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDBClusterDynamoDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDBClusterDynamoDBResponse setBody(EnableDBClusterDynamoDBResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDBClusterDynamoDBResponseBody getBody() {
        return this.body;
    }

}
