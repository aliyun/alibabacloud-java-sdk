// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcChannelDetailsResponseBody body;

    public static DescribeRtcChannelDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelDetailsResponse self = new DescribeRtcChannelDetailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcChannelDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcChannelDetailsResponse setBody(DescribeRtcChannelDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcChannelDetailsResponseBody getBody() {
        return this.body;
    }

}
