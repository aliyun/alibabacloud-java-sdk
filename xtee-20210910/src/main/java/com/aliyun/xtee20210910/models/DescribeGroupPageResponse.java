// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeGroupPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGroupPageResponseBody body;

    public static DescribeGroupPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupPageResponse self = new DescribeGroupPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGroupPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGroupPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGroupPageResponse setBody(DescribeGroupPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGroupPageResponseBody getBody() {
        return this.body;
    }

}
