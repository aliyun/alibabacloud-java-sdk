// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeConsumerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsumerGroupsResponseBody body;

    public static DescribeConsumerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerGroupsResponse self = new DescribeConsumerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsumerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsumerGroupsResponse setBody(DescribeConsumerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsumerGroupsResponseBody getBody() {
        return this.body;
    }

}
