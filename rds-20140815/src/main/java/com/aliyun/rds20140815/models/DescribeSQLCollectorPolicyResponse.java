// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLCollectorPolicyResponseBody body;

    public static DescribeSQLCollectorPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorPolicyResponse self = new DescribeSQLCollectorPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLCollectorPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLCollectorPolicyResponse setBody(DescribeSQLCollectorPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLCollectorPolicyResponseBody getBody() {
        return this.body;
    }

}
