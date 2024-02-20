// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowTopResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowTopResourceResponseBody body;

    public static DescribeFlowTopResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowTopResourceResponse self = new DescribeFlowTopResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowTopResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowTopResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowTopResourceResponse setBody(DescribeFlowTopResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowTopResourceResponseBody getBody() {
        return this.body;
    }

}
