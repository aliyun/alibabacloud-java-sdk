// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableMemResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeAvailableMemResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableMemResourceResponse setBody(DescribeAvailableMemResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableMemResourceResponseBody getBody() {
        return this.body;
    }

}
