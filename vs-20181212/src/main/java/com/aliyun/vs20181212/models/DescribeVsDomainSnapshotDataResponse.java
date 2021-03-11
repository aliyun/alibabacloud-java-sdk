// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainSnapshotDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVsDomainSnapshotDataResponse setBody(DescribeVsDomainSnapshotDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsDomainSnapshotDataResponseBody getBody() {
        return this.body;
    }

}
