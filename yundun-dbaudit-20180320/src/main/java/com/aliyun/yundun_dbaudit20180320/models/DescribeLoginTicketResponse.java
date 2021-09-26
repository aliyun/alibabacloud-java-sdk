// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeLoginTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLoginTicketResponse setBody(DescribeLoginTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoginTicketResponseBody getBody() {
        return this.body;
    }

}
