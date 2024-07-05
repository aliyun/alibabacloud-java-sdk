// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsTopDomainsByFlowResponseBody body;

    public static DescribeVsTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsTopDomainsByFlowResponse self = new DescribeVsTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsTopDomainsByFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsTopDomainsByFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsTopDomainsByFlowResponse setBody(DescribeVsTopDomainsByFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

}
