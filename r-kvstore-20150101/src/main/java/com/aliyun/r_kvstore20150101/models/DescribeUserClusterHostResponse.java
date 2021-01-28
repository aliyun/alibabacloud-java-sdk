// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeUserClusterHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserClusterHostResponseBody body;

    public static DescribeUserClusterHostResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserClusterHostResponse self = new DescribeUserClusterHostResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserClusterHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserClusterHostResponse setBody(DescribeUserClusterHostResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserClusterHostResponseBody getBody() {
        return this.body;
    }

}
