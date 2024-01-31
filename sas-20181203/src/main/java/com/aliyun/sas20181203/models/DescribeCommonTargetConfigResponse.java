// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommonTargetConfigResponseBody body;

    public static DescribeCommonTargetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetConfigResponse self = new DescribeCommonTargetConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommonTargetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommonTargetConfigResponse setBody(DescribeCommonTargetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommonTargetConfigResponseBody getBody() {
        return this.body;
    }

}
