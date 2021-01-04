// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeACLAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeACLAttributeResponseBody body;

    public static DescribeACLAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLAttributeResponse self = new DescribeACLAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeACLAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeACLAttributeResponse setBody(DescribeACLAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeACLAttributeResponseBody getBody() {
        return this.body;
    }

}
