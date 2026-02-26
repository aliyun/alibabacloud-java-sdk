// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterDynamoDBResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDBClusterDynamoDBResponseBody body;

    public static DisableDBClusterDynamoDBResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterDynamoDBResponse self = new DisableDBClusterDynamoDBResponse();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterDynamoDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDBClusterDynamoDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDBClusterDynamoDBResponse setBody(DisableDBClusterDynamoDBResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDBClusterDynamoDBResponseBody getBody() {
        return this.body;
    }

}
