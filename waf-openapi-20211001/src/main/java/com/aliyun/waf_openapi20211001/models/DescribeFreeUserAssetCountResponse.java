// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserAssetCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFreeUserAssetCountResponseBody body;

    public static DescribeFreeUserAssetCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserAssetCountResponse self = new DescribeFreeUserAssetCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserAssetCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFreeUserAssetCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFreeUserAssetCountResponse setBody(DescribeFreeUserAssetCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFreeUserAssetCountResponseBody getBody() {
        return this.body;
    }

}
