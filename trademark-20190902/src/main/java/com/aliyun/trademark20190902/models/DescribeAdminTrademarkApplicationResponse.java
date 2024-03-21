// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeAdminTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAdminTrademarkApplicationResponseBody body;

    public static DescribeAdminTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdminTrademarkApplicationResponse self = new DescribeAdminTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAdminTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAdminTrademarkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAdminTrademarkApplicationResponse setBody(DescribeAdminTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAdminTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
