// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSuggestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecSuggestionsResponseBody body;

    public static DescribeApisecSuggestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSuggestionsResponse self = new DescribeApisecSuggestionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSuggestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecSuggestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecSuggestionsResponse setBody(DescribeApisecSuggestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecSuggestionsResponseBody getBody() {
        return this.body;
    }

}
