// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyProcItemResponseBody body;

    public static DescribePropertyProcItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcItemResponse self = new DescribePropertyProcItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyProcItemResponse setBody(DescribePropertyProcItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyProcItemResponseBody getBody() {
        return this.body;
    }

}
