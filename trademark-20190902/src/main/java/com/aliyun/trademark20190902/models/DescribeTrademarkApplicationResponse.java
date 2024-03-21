// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrademarkApplicationResponseBody body;

    public static DescribeTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrademarkApplicationResponse self = new DescribeTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrademarkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrademarkApplicationResponse setBody(DescribeTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
