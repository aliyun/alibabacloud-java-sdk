// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeDBNodeDirectVipInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBNodeDirectVipInfoResponseBody body;

    public static DescribeDBNodeDirectVipInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodeDirectVipInfoResponse self = new DescribeDBNodeDirectVipInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodeDirectVipInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBNodeDirectVipInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBNodeDirectVipInfoResponse setBody(DescribeDBNodeDirectVipInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBNodeDirectVipInfoResponseBody getBody() {
        return this.body;
    }

}
