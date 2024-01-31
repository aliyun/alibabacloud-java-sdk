// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulCheckTaskStatusDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVulCheckTaskStatusDetailResponseBody body;

    public static DescribeVulCheckTaskStatusDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulCheckTaskStatusDetailResponse self = new DescribeVulCheckTaskStatusDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulCheckTaskStatusDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulCheckTaskStatusDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVulCheckTaskStatusDetailResponse setBody(DescribeVulCheckTaskStatusDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulCheckTaskStatusDetailResponseBody getBody() {
        return this.body;
    }

}
