// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupedVulResponseBody body;

    public static DescribeGroupedVulResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulResponse self = new DescribeGroupedVulResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupedVulResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupedVulResponse setBody(DescribeGroupedVulResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupedVulResponseBody getBody() {
        return this.body;
    }

}
