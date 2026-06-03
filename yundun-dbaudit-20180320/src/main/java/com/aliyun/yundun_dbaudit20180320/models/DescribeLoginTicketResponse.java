// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeLoginTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLoginTicketResponseBody body;

    public static DescribeLoginTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginTicketResponse self = new DescribeLoginTicketResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoginTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoginTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoginTicketResponse setBody(DescribeLoginTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoginTicketResponseBody getBody() {
        return this.body;
    }

}
