// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeClusterMemberInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterMemberInfoResponseBody body;

    public static DescribeClusterMemberInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterMemberInfoResponse self = new DescribeClusterMemberInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterMemberInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterMemberInfoResponse setBody(DescribeClusterMemberInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterMemberInfoResponseBody getBody() {
        return this.body;
    }

}
