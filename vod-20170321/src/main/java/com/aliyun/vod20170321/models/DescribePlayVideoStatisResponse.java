// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayVideoStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlayVideoStatisResponseBody body;

    public static DescribePlayVideoStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayVideoStatisResponse self = new DescribePlayVideoStatisResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayVideoStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayVideoStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayVideoStatisResponse setBody(DescribePlayVideoStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayVideoStatisResponseBody getBody() {
        return this.body;
    }

}
