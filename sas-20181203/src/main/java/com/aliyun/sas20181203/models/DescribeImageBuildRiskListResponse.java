// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageBuildRiskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageBuildRiskListResponseBody body;

    public static DescribeImageBuildRiskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageBuildRiskListResponse self = new DescribeImageBuildRiskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageBuildRiskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageBuildRiskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageBuildRiskListResponse setBody(DescribeImageBuildRiskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageBuildRiskListResponseBody getBody() {
        return this.body;
    }

}
