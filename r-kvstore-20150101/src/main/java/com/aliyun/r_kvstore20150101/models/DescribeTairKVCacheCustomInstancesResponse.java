// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairKVCacheCustomInstancesResponseBody body;

    public static DescribeTairKVCacheCustomInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheCustomInstancesResponse self = new DescribeTairKVCacheCustomInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheCustomInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairKVCacheCustomInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairKVCacheCustomInstancesResponse setBody(DescribeTairKVCacheCustomInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairKVCacheCustomInstancesResponseBody getBody() {
        return this.body;
    }

}
