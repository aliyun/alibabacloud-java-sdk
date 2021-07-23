// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeModelServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeModelServiceResponseBody body;

    public static DescribeModelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceResponse self = new DescribeModelServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelServiceResponse setBody(DescribeModelServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelServiceResponseBody getBody() {
        return this.body;
    }

}
