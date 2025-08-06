// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodTopDomainsByFlowResponseBody body;

    public static DescribeVodTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTopDomainsByFlowResponse self = new DescribeVodTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodTopDomainsByFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodTopDomainsByFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodTopDomainsByFlowResponse setBody(DescribeVodTopDomainsByFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

}
