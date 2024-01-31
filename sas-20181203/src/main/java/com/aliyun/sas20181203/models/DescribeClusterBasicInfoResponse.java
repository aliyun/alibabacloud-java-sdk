// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterBasicInfoResponseBody body;

    public static DescribeClusterBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBasicInfoResponse self = new DescribeClusterBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterBasicInfoResponse setBody(DescribeClusterBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterBasicInfoResponseBody getBody() {
        return this.body;
    }

}
