// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePauseProtectionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePauseProtectionStatusResponseBody body;

    public static DescribePauseProtectionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePauseProtectionStatusResponse self = new DescribePauseProtectionStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribePauseProtectionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePauseProtectionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePauseProtectionStatusResponse setBody(DescribePauseProtectionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePauseProtectionStatusResponseBody getBody() {
        return this.body;
    }

}
