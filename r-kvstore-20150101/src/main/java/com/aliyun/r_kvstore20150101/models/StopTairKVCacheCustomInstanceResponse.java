// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class StopTairKVCacheCustomInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopTairKVCacheCustomInstanceResponseBody body;

    public static StopTairKVCacheCustomInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopTairKVCacheCustomInstanceResponse self = new StopTairKVCacheCustomInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopTairKVCacheCustomInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopTairKVCacheCustomInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopTairKVCacheCustomInstanceResponse setBody(StopTairKVCacheCustomInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopTairKVCacheCustomInstanceResponseBody getBody() {
        return this.body;
    }

}
