// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationsResponseBody body;

    public static DescribeApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationsResponse self = new DescribeApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationsResponse setBody(DescribeApplicationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationsResponseBody getBody() {
        return this.body;
    }

}
