// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelOverallDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChannelOverallDataResponseBody body;

    public static DescribeChannelOverallDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelOverallDataResponse self = new DescribeChannelOverallDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelOverallDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelOverallDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChannelOverallDataResponse setBody(DescribeChannelOverallDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelOverallDataResponseBody getBody() {
        return this.body;
    }

}
