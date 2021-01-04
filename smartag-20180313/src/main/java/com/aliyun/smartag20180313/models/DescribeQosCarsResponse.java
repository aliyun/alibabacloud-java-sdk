// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeQosCarsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeQosCarsResponseBody body;

    public static DescribeQosCarsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosCarsResponse self = new DescribeQosCarsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQosCarsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQosCarsResponse setBody(DescribeQosCarsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQosCarsResponseBody getBody() {
        return this.body;
    }

}
