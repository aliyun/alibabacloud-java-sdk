// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAppKeyPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppKeyPageResponseBody body;

    public static DescribeAppKeyPageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppKeyPageResponse self = new DescribeAppKeyPageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppKeyPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppKeyPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppKeyPageResponse setBody(DescribeAppKeyPageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppKeyPageResponseBody getBody() {
        return this.body;
    }

}
