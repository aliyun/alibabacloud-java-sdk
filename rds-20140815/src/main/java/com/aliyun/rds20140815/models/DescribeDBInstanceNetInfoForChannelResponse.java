// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoForChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBInstanceNetInfoForChannelResponseBody body;

    public static DescribeDBInstanceNetInfoForChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoForChannelResponse self = new DescribeDBInstanceNetInfoForChannelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoForChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBInstanceNetInfoForChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBInstanceNetInfoForChannelResponse setBody(DescribeDBInstanceNetInfoForChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBInstanceNetInfoForChannelResponseBody getBody() {
        return this.body;
    }

}
