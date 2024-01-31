// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityCheckScheduleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSecurityCheckScheduleConfigResponseBody body;

    public static DescribeSecurityCheckScheduleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityCheckScheduleConfigResponse self = new DescribeSecurityCheckScheduleConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityCheckScheduleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityCheckScheduleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityCheckScheduleConfigResponse setBody(DescribeSecurityCheckScheduleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityCheckScheduleConfigResponseBody getBody() {
        return this.body;
    }

}
