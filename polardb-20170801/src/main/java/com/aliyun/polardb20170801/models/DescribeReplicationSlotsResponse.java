// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeReplicationSlotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReplicationSlotsResponseBody body;

    public static DescribeReplicationSlotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationSlotsResponse self = new DescribeReplicationSlotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationSlotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicationSlotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReplicationSlotsResponse setBody(DescribeReplicationSlotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicationSlotsResponseBody getBody() {
        return this.body;
    }

}
