// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeQualityOverallDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQualityOverallDataResponseBody body;

    public static DescribeQualityOverallDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOverallDataResponse self = new DescribeQualityOverallDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOverallDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQualityOverallDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQualityOverallDataResponse setBody(DescribeQualityOverallDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQualityOverallDataResponseBody getBody() {
        return this.body;
    }

}
