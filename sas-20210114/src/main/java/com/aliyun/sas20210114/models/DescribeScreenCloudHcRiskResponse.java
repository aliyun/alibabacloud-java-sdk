// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenCloudHcRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScreenCloudHcRiskResponseBody body;

    public static DescribeScreenCloudHcRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenCloudHcRiskResponse self = new DescribeScreenCloudHcRiskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScreenCloudHcRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScreenCloudHcRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScreenCloudHcRiskResponse setBody(DescribeScreenCloudHcRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScreenCloudHcRiskResponseBody getBody() {
        return this.body;
    }

}
