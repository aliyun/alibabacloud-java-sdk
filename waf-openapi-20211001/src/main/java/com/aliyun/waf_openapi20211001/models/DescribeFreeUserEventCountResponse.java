// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFreeUserEventCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFreeUserEventCountResponseBody body;

    public static DescribeFreeUserEventCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFreeUserEventCountResponse self = new DescribeFreeUserEventCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFreeUserEventCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFreeUserEventCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFreeUserEventCountResponse setBody(DescribeFreeUserEventCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFreeUserEventCountResponseBody getBody() {
        return this.body;
    }

}
