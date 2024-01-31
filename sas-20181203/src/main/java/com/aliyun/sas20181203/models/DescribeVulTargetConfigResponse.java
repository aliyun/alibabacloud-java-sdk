// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulTargetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulTargetConfigResponseBody body;

    public static DescribeVulTargetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulTargetConfigResponse self = new DescribeVulTargetConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulTargetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulTargetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulTargetConfigResponse setBody(DescribeVulTargetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulTargetConfigResponseBody getBody() {
        return this.body;
    }

}
