// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBinarySecurityPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBinarySecurityPoliciesResponseBody body;

    public static DescribeBinarySecurityPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinarySecurityPoliciesResponse self = new DescribeBinarySecurityPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBinarySecurityPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBinarySecurityPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBinarySecurityPoliciesResponse setBody(DescribeBinarySecurityPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBinarySecurityPoliciesResponseBody getBody() {
        return this.body;
    }

}
