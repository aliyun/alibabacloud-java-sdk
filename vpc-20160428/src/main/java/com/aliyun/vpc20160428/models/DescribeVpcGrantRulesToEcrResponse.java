// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcGrantRulesToEcrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpcGrantRulesToEcrResponseBody body;

    public static DescribeVpcGrantRulesToEcrResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcGrantRulesToEcrResponse self = new DescribeVpcGrantRulesToEcrResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcGrantRulesToEcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcGrantRulesToEcrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcGrantRulesToEcrResponse setBody(DescribeVpcGrantRulesToEcrResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcGrantRulesToEcrResponseBody getBody() {
        return this.body;
    }

}
