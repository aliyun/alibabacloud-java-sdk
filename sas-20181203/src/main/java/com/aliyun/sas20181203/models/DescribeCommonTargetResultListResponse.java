// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetResultListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommonTargetResultListResponseBody body;

    public static DescribeCommonTargetResultListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetResultListResponse self = new DescribeCommonTargetResultListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetResultListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommonTargetResultListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommonTargetResultListResponse setBody(DescribeCommonTargetResultListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommonTargetResultListResponseBody getBody() {
        return this.body;
    }

}
