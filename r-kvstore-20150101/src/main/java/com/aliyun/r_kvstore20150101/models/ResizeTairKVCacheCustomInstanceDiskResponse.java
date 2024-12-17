// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ResizeTairKVCacheCustomInstanceDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResizeTairKVCacheCustomInstanceDiskResponseBody body;

    public static ResizeTairKVCacheCustomInstanceDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeTairKVCacheCustomInstanceDiskResponse self = new ResizeTairKVCacheCustomInstanceDiskResponse();
        return TeaModel.build(map, self);
    }

    public ResizeTairKVCacheCustomInstanceDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeTairKVCacheCustomInstanceDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeTairKVCacheCustomInstanceDiskResponse setBody(ResizeTairKVCacheCustomInstanceDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeTairKVCacheCustomInstanceDiskResponseBody getBody() {
        return this.body;
    }

}
