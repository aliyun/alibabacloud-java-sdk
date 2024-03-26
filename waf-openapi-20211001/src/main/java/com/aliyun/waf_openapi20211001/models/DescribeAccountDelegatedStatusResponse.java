// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAccountDelegatedStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccountDelegatedStatusResponseBody body;

    public static DescribeAccountDelegatedStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountDelegatedStatusResponse self = new DescribeAccountDelegatedStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccountDelegatedStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccountDelegatedStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccountDelegatedStatusResponse setBody(DescribeAccountDelegatedStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccountDelegatedStatusResponseBody getBody() {
        return this.body;
    }

}
