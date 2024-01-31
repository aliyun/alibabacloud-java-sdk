// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelTopPubUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeChannelTopPubUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelTopPubUserListResponse setBody(DescribeChannelTopPubUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelTopPubUserListResponseBody getBody() {
        return this.body;
    }

}
