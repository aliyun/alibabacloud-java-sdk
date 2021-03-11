// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainReqTrafficDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsDomainReqTrafficDataResponseBody body;

    public static DescribeVsDomainReqTrafficDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainReqTrafficDataResponse self = new DescribeVsDomainReqTrafficDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainReqTrafficDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainReqTrafficDataResponse setBody(DescribeVsDomainReqTrafficDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainReqTrafficDataResponseBody getBody() {
        return this.body;
    }

}
