// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecureSuggestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecureSuggestionResponseBody body;

    public static DescribeSecureSuggestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecureSuggestionResponse self = new DescribeSecureSuggestionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecureSuggestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecureSuggestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecureSuggestionResponse setBody(DescribeSecureSuggestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecureSuggestionResponseBody getBody() {
        return this.body;
    }

}
