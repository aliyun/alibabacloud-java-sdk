// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecureSuggestionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSecureSuggestionResponse setBody(DescribeSecureSuggestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecureSuggestionResponseBody getBody() {
        return this.body;
    }

}
