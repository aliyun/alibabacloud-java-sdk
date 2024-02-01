// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeTagKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagKeysResponseBody body;

    public static DescribeTagKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysResponse self = new DescribeTagKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagKeysResponse setBody(DescribeTagKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagKeysResponseBody getBody() {
        return this.body;
    }

}
