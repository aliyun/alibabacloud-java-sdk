// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeMonitorItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMonitorItemsResponse setBody(DescribeMonitorItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMonitorItemsResponseBody getBody() {
        return this.body;
    }

}
