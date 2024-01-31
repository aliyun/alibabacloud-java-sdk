// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEventOnStageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventOnStageResponseBody body;

    public static DescribeEventOnStageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventOnStageResponse self = new DescribeEventOnStageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventOnStageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventOnStageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventOnStageResponse setBody(DescribeEventOnStageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventOnStageResponseBody getBody() {
        return this.body;
    }

}
