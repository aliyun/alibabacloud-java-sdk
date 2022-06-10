// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGrantRulesToCenResponseBody body;

    public static DescribeGrantRulesToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenResponse self = new DescribeGrantRulesToCenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGrantRulesToCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGrantRulesToCenResponse setBody(DescribeGrantRulesToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGrantRulesToCenResponseBody getBody() {
        return this.body;
    }

}
