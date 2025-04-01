// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheInferInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairKVCacheInferInstancesResponseBody body;

    public static DescribeTairKVCacheInferInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheInferInstancesResponse self = new DescribeTairKVCacheInferInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheInferInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairKVCacheInferInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairKVCacheInferInstancesResponse setBody(DescribeTairKVCacheInferInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairKVCacheInferInstancesResponseBody getBody() {
        return this.body;
    }

}
