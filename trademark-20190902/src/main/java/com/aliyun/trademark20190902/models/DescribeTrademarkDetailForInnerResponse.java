// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeTrademarkDetailForInnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrademarkDetailForInnerResponseBody body;

    public static DescribeTrademarkDetailForInnerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrademarkDetailForInnerResponse self = new DescribeTrademarkDetailForInnerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrademarkDetailForInnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrademarkDetailForInnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrademarkDetailForInnerResponse setBody(DescribeTrademarkDetailForInnerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrademarkDetailForInnerResponseBody getBody() {
        return this.body;
    }

}
