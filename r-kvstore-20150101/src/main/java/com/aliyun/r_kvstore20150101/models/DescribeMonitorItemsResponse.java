// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeMonitorItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMonitorItemsResponseBody body;

    public static DescribeMonitorItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorItemsResponse self = new DescribeMonitorItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMonitorItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMonitorItemsResponse setBody(DescribeMonitorItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorItemsResponseBody getBody() {
        return this.body;
    }

}
