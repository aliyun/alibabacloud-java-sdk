// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVulConfigResponseBody body;

    public static DescribeVulConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulConfigResponse self = new DescribeVulConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulConfigResponse setBody(DescribeVulConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulConfigResponseBody getBody() {
        return this.body;
    }

}
