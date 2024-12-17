// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ResetTairKVCacheCustomInstancePasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetTairKVCacheCustomInstancePasswordResponseBody body;

    public static ResetTairKVCacheCustomInstancePasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetTairKVCacheCustomInstancePasswordResponse self = new ResetTairKVCacheCustomInstancePasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetTairKVCacheCustomInstancePasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetTairKVCacheCustomInstancePasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetTairKVCacheCustomInstancePasswordResponse setBody(ResetTairKVCacheCustomInstancePasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetTairKVCacheCustomInstancePasswordResponseBody getBody() {
        return this.body;
    }

}
