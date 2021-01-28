// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeUserClusterHostInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserClusterHostInstanceResponseBody body;

    public static DescribeUserClusterHostInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserClusterHostInstanceResponse self = new DescribeUserClusterHostInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserClusterHostInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserClusterHostInstanceResponse setBody(DescribeUserClusterHostInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserClusterHostInstanceResponseBody getBody() {
        return this.body;
    }

}
