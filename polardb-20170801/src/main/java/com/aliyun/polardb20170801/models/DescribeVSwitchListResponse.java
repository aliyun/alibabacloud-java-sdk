// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeVSwitchListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVSwitchListResponseBody body;

    public static DescribeVSwitchListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchListResponse self = new DescribeVSwitchListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVSwitchListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVSwitchListResponse setBody(DescribeVSwitchListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVSwitchListResponseBody getBody() {
        return this.body;
    }

}
