// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableMemResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAvailableMemResourceResponseBody body;

    public static DescribeAvailableMemResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableMemResourceResponse self = new DescribeAvailableMemResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableMemResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableMemResourceResponse setBody(DescribeAvailableMemResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableMemResourceResponseBody getBody() {
        return this.body;
    }

}
