// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReplicationLinkLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeReplicationLinkLogsResponseBody body;

    public static DescribeReplicationLinkLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationLinkLogsResponse self = new DescribeReplicationLinkLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationLinkLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicationLinkLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeReplicationLinkLogsResponse setBody(DescribeReplicationLinkLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicationLinkLogsResponseBody getBody() {
        return this.body;
    }

}
