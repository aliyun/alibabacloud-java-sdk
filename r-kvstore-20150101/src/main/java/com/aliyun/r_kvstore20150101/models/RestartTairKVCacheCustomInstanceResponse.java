// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RestartTairKVCacheCustomInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartTairKVCacheCustomInstanceResponseBody body;

    public static RestartTairKVCacheCustomInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartTairKVCacheCustomInstanceResponse self = new RestartTairKVCacheCustomInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartTairKVCacheCustomInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartTairKVCacheCustomInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartTairKVCacheCustomInstanceResponse setBody(RestartTairKVCacheCustomInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartTairKVCacheCustomInstanceResponseBody getBody() {
        return this.body;
    }

}
