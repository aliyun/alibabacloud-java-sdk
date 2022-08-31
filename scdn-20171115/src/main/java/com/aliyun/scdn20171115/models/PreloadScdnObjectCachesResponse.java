// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class PreloadScdnObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PreloadScdnObjectCachesResponseBody body;

    public static PreloadScdnObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        PreloadScdnObjectCachesResponse self = new PreloadScdnObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public PreloadScdnObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreloadScdnObjectCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreloadScdnObjectCachesResponse setBody(PreloadScdnObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public PreloadScdnObjectCachesResponseBody getBody() {
        return this.body;
    }

}
