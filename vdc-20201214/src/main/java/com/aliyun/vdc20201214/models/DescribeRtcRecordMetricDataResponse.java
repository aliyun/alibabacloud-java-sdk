// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcRecordMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcRecordMetricDataResponseBody body;

    public static DescribeRtcRecordMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcRecordMetricDataResponse self = new DescribeRtcRecordMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcRecordMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcRecordMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcRecordMetricDataResponse setBody(DescribeRtcRecordMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcRecordMetricDataResponseBody getBody() {
        return this.body;
    }

}
