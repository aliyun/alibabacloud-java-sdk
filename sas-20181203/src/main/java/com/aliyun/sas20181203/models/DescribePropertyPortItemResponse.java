// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyPortItemResponseBody body;

    public static DescribePropertyPortItemResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortItemResponse self = new DescribePropertyPortItemResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyPortItemResponse setBody(DescribePropertyPortItemResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyPortItemResponseBody getBody() {
        return this.body;
    }

}
