// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserEventTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFreeUserEventTypesResponseBody body;

    public static DescribeFreeUserEventTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserEventTypesResponse self = new DescribeFreeUserEventTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserEventTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFreeUserEventTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFreeUserEventTypesResponse setBody(DescribeFreeUserEventTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFreeUserEventTypesResponseBody getBody() {
        return this.body;
    }

}
