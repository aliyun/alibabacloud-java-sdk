// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStatisticalDataResponseBody body;

    public static DescribeStatisticalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataResponse self = new DescribeStatisticalDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStatisticalDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStatisticalDataResponse setBody(DescribeStatisticalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStatisticalDataResponseBody getBody() {
        return this.body;
    }

}
