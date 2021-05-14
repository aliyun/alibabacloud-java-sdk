// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUserItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyUserItemResponseBody body;

    public static DescribePropertyUserItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUserItemResponse self = new DescribePropertyUserItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUserItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyUserItemResponse setBody(DescribePropertyUserItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyUserItemResponseBody getBody() {
        return this.body;
    }

}
