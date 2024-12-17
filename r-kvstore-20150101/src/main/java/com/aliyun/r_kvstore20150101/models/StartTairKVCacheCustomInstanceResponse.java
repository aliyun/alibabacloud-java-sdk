// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class StartTairKVCacheCustomInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartTairKVCacheCustomInstanceResponseBody body;

    public static StartTairKVCacheCustomInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartTairKVCacheCustomInstanceResponse self = new StartTairKVCacheCustomInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartTairKVCacheCustomInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartTairKVCacheCustomInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartTairKVCacheCustomInstanceResponse setBody(StartTairKVCacheCustomInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartTairKVCacheCustomInstanceResponseBody getBody() {
        return this.body;
    }

}
