// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupAccountPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupAccountPageResponseBody body;

    public static DescribeGroupAccountPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupAccountPageResponse self = new DescribeGroupAccountPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupAccountPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupAccountPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupAccountPageResponse setBody(DescribeGroupAccountPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupAccountPageResponseBody getBody() {
        return this.body;
    }

}
