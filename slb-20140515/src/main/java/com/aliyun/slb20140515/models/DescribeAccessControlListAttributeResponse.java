// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccessControlListAttributeResponseBody body;

    public static DescribeAccessControlListAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListAttributeResponse self = new DescribeAccessControlListAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessControlListAttributeResponse setBody(DescribeAccessControlListAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessControlListAttributeResponseBody getBody() {
        return this.body;
    }

}
