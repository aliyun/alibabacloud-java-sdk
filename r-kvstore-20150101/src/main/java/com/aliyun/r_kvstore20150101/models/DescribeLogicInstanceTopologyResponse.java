// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeLogicInstanceTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogicInstanceTopologyResponseBody body;

    public static DescribeLogicInstanceTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogicInstanceTopologyResponse self = new DescribeLogicInstanceTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogicInstanceTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogicInstanceTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogicInstanceTopologyResponse setBody(DescribeLogicInstanceTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogicInstanceTopologyResponseBody getBody() {
        return this.body;
    }

}
