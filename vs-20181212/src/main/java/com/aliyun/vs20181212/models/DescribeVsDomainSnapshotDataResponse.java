// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainSnapshotDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVsDomainSnapshotDataResponseBody body;

    public static DescribeVsDomainSnapshotDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainSnapshotDataResponse self = new DescribeVsDomainSnapshotDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainSnapshotDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsDomainSnapshotDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVsDomainSnapshotDataResponse setBody(DescribeVsDomainSnapshotDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainSnapshotDataResponseBody getBody() {
        return this.body;
    }

}
