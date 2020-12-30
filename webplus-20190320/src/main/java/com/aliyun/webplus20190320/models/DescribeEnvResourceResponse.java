// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeEnvResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEnvResourceResponseBody body;

    public static DescribeEnvResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvResourceResponse self = new DescribeEnvResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnvResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnvResourceResponse setBody(DescribeEnvResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnvResourceResponseBody getBody() {
        return this.body;
    }

}
