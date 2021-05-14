// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyUsageNewestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePropertyUsageNewestResponseBody body;

    public static DescribePropertyUsageNewestResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyUsageNewestResponse self = new DescribePropertyUsageNewestResponse();
        return TeaModel.build(map, self);
    }

    public DescribePropertyUsageNewestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePropertyUsageNewestResponse setBody(DescribePropertyUsageNewestResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePropertyUsageNewestResponseBody getBody() {
        return this.body;
    }

}
