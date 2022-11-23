// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScheduleConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyScheduleConfigResponseBody body;

    public static DescribePropertyScheduleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScheduleConfigResponse self = new DescribePropertyScheduleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScheduleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyScheduleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePropertyScheduleConfigResponse setBody(DescribePropertyScheduleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyScheduleConfigResponseBody getBody() {
        return this.body;
    }

}
