// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEcGrantRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEcGrantRelationResponseBody body;

    public static DescribeEcGrantRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcGrantRelationResponse self = new DescribeEcGrantRelationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEcGrantRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEcGrantRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEcGrantRelationResponse setBody(DescribeEcGrantRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEcGrantRelationResponseBody getBody() {
        return this.body;
    }

}
