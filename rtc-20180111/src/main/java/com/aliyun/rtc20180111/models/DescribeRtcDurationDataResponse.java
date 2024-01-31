// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcDurationDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRtcDurationDataResponseBody body;

    public static DescribeRtcDurationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcDurationDataResponse self = new DescribeRtcDurationDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcDurationDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcDurationDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcDurationDataResponse setBody(DescribeRtcDurationDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcDurationDataResponseBody getBody() {
        return this.body;
    }

}
