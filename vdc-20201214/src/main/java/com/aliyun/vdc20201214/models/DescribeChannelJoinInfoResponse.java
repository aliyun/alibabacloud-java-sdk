// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelJoinInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelJoinInfoResponseBody body;

    public static DescribeChannelJoinInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelJoinInfoResponse self = new DescribeChannelJoinInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelJoinInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelJoinInfoResponse setBody(DescribeChannelJoinInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelJoinInfoResponseBody getBody() {
        return this.body;
    }

}
