// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarSQLCollectorPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarSQLCollectorPolicyResponseBody body;

    public static DescribePolarSQLCollectorPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarSQLCollectorPolicyResponse self = new DescribePolarSQLCollectorPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarSQLCollectorPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarSQLCollectorPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarSQLCollectorPolicyResponse setBody(DescribePolarSQLCollectorPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarSQLCollectorPolicyResponseBody getBody() {
        return this.body;
    }

}
