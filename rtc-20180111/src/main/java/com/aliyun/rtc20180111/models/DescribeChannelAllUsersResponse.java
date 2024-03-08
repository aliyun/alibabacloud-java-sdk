// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelAllUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChannelAllUsersResponseBody body;

    public static DescribeChannelAllUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelAllUsersResponse self = new DescribeChannelAllUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelAllUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelAllUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelAllUsersResponse setBody(DescribeChannelAllUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelAllUsersResponseBody getBody() {
        return this.body;
    }

}
