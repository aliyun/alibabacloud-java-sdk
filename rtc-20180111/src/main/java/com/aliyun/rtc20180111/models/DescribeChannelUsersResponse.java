// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelUsersResponseBody body;

    public static DescribeChannelUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUsersResponse self = new DescribeChannelUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelUsersResponse setBody(DescribeChannelUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelUsersResponseBody getBody() {
        return this.body;
    }

}
