// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVolDingdingMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVolDingdingMessageResponseBody body;

    public static DescribeVolDingdingMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVolDingdingMessageResponse self = new DescribeVolDingdingMessageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVolDingdingMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVolDingdingMessageResponse setBody(DescribeVolDingdingMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVolDingdingMessageResponseBody getBody() {
        return this.body;
    }

}
