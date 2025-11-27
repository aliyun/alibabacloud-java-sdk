// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCAvailableResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCAvailableResourceResponseBody body;

    public static DescribeRCAvailableResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCAvailableResourceResponse self = new DescribeRCAvailableResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCAvailableResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCAvailableResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCAvailableResourceResponse setBody(DescribeRCAvailableResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCAvailableResourceResponseBody getBody() {
        return this.body;
    }

}
