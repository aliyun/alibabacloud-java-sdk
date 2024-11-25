// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCSnapshotsResponseBody body;

    public static DescribeRCSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSnapshotsResponse self = new DescribeRCSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCSnapshotsResponse setBody(DescribeRCSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCSnapshotsResponseBody getBody() {
        return this.body;
    }

}
