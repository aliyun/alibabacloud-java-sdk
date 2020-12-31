// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class DescribeChangeSetDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChangeSetDetailResponseBody body;

    public static DescribeChangeSetDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeSetDetailResponse self = new DescribeChangeSetDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChangeSetDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChangeSetDetailResponse setBody(DescribeChangeSetDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChangeSetDetailResponseBody getBody() {
        return this.body;
    }

}
