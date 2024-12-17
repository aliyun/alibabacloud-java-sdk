// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairKVCacheCustomInstanceAttributeResponseBody body;

    public static DescribeTairKVCacheCustomInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheCustomInstanceAttributeResponse self = new DescribeTairKVCacheCustomInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponse setBody(DescribeTairKVCacheCustomInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairKVCacheCustomInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
