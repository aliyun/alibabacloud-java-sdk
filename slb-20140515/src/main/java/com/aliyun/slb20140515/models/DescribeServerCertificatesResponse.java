// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeServerCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServerCertificatesResponseBody body;

    public static DescribeServerCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerCertificatesResponse self = new DescribeServerCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServerCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServerCertificatesResponse setBody(DescribeServerCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServerCertificatesResponseBody getBody() {
        return this.body;
    }

}
