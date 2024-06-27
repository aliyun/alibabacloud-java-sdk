// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagsTrendResponseBody body;

    public static DescribeTagsTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsTrendResponse self = new DescribeTagsTrendResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagsTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagsTrendResponse setBody(DescribeTagsTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagsTrendResponseBody getBody() {
        return this.body;
    }

}
