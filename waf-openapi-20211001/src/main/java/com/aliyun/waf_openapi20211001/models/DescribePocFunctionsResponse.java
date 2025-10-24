// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePocFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePocFunctionsResponseBody body;

    public static DescribePocFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePocFunctionsResponse self = new DescribePocFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePocFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePocFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePocFunctionsResponse setBody(DescribePocFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePocFunctionsResponseBody getBody() {
        return this.body;
    }

}
