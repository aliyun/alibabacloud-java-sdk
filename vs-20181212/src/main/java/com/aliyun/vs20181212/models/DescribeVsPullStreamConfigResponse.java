// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsPullStreamConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVsPullStreamConfigResponseBody body;

    public static DescribeVsPullStreamConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsPullStreamConfigResponse self = new DescribeVsPullStreamConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVsPullStreamConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVsPullStreamConfigResponse setBody(DescribeVsPullStreamConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVsPullStreamConfigResponseBody getBody() {
        return this.body;
    }

}
