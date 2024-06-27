// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRuleSnapshotResponseBody body;

    public static DescribeRuleSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleSnapshotResponse self = new DescribeRuleSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRuleSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRuleSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRuleSnapshotResponse setBody(DescribeRuleSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRuleSnapshotResponseBody getBody() {
        return this.body;
    }

}
