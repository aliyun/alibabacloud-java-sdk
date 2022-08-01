// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeMaskingRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMaskingRulesResponseBody body;

    public static DescribeMaskingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaskingRulesResponse self = new DescribeMaskingRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMaskingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMaskingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMaskingRulesResponse setBody(DescribeMaskingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMaskingRulesResponseBody getBody() {
        return this.body;
    }

}
