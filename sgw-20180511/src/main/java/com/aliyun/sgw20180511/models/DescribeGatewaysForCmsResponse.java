// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewaysForCmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewaysForCmsResponseBody body;

    public static DescribeGatewaysForCmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewaysForCmsResponse self = new DescribeGatewaysForCmsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewaysForCmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewaysForCmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewaysForCmsResponse setBody(DescribeGatewaysForCmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewaysForCmsResponseBody getBody() {
        return this.body;
    }

}
