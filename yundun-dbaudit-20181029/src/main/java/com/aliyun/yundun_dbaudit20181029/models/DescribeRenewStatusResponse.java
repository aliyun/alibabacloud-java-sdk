// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class DescribeRenewStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRenewStatusResponseBody body;

    public static DescribeRenewStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewStatusResponse self = new DescribeRenewStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRenewStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRenewStatusResponse setBody(DescribeRenewStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRenewStatusResponseBody getBody() {
        return this.body;
    }

}
