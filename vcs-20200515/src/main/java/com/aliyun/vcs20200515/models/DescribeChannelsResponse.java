// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeChannelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelsResponseBody body;

    public static DescribeChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelsResponse self = new DescribeChannelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelsResponse setBody(DescribeChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelsResponseBody getBody() {
        return this.body;
    }

}
