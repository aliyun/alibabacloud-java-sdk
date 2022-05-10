// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcUserEventListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcUserEventListResponseBody body;

    public static DescribeRtcUserEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserEventListResponse self = new DescribeRtcUserEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcUserEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcUserEventListResponse setBody(DescribeRtcUserEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcUserEventListResponseBody getBody() {
        return this.body;
    }

}
