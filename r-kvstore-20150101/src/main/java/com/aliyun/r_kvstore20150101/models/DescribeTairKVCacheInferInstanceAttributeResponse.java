// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheInferInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairKVCacheInferInstanceAttributeResponseBody body;

    public static DescribeTairKVCacheInferInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheInferInstanceAttributeResponse self = new DescribeTairKVCacheInferInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheInferInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairKVCacheInferInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairKVCacheInferInstanceAttributeResponse setBody(DescribeTairKVCacheInferInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairKVCacheInferInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
