// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProfileResponseBody body;

    public static DescribeProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProfileResponse self = new DescribeProfileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProfileResponse setBody(DescribeProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProfileResponseBody getBody() {
        return this.body;
    }

}
