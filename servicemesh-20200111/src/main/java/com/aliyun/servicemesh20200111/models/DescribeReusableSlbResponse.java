// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeReusableSlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReusableSlbResponseBody body;

    public static DescribeReusableSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReusableSlbResponse self = new DescribeReusableSlbResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReusableSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReusableSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReusableSlbResponse setBody(DescribeReusableSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReusableSlbResponseBody getBody() {
        return this.body;
    }

}
