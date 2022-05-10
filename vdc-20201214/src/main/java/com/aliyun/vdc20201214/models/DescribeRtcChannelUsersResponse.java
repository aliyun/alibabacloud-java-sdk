// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelUsersResponseBody body;

    public static DescribeRtcChannelUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelUsersResponse self = new DescribeRtcChannelUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcChannelUsersResponse setBody(DescribeRtcChannelUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelUsersResponseBody getBody() {
        return this.body;
    }

}
