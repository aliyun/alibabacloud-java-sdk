// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAllEventNameAndCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllEventNameAndCodeResponseBody body;

    public static DescribeAllEventNameAndCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEventNameAndCodeResponse self = new DescribeAllEventNameAndCodeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllEventNameAndCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllEventNameAndCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllEventNameAndCodeResponse setBody(DescribeAllEventNameAndCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllEventNameAndCodeResponseBody getBody() {
        return this.body;
    }

}
