// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class InitiateBucketWormResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    public static InitiateBucketWormResponse build(java.util.Map<String, ?> map) throws Exception {
        InitiateBucketWormResponse self = new InitiateBucketWormResponse();
        return TeaModel.build(map, self);
    }

    public InitiateBucketWormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitiateBucketWormResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
