// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelTopPubUserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelTopPubUserListResponseBody body;

    public static DescribeChannelTopPubUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelTopPubUserListResponse self = new DescribeChannelTopPubUserListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelTopPubUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelTopPubUserListResponse setBody(DescribeChannelTopPubUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelTopPubUserListResponseBody getBody() {
        return this.body;
    }

}
