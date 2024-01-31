// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginSwitchConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoginSwitchConfigsResponseBody body;

    public static DescribeLoginSwitchConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginSwitchConfigsResponse self = new DescribeLoginSwitchConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoginSwitchConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoginSwitchConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoginSwitchConfigsResponse setBody(DescribeLoginSwitchConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoginSwitchConfigsResponseBody getBody() {
        return this.body;
    }

}
