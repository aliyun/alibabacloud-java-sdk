// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribePartnerTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePartnerTrademarkApplicationResponseBody body;

    public static DescribePartnerTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerTrademarkApplicationResponse self = new DescribePartnerTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribePartnerTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePartnerTrademarkApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePartnerTrademarkApplicationResponse setBody(DescribePartnerTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePartnerTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
