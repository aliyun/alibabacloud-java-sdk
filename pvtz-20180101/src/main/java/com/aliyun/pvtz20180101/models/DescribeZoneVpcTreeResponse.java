// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneVpcTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeZoneVpcTreeResponseBody body;

    public static DescribeZoneVpcTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZoneVpcTreeResponse self = new DescribeZoneVpcTreeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZoneVpcTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeZoneVpcTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeZoneVpcTreeResponse setBody(DescribeZoneVpcTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZoneVpcTreeResponseBody getBody() {
        return this.body;
    }

}
