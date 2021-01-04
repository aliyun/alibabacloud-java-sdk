// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeZoneVpcTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeZoneVpcTreeResponse setBody(DescribeZoneVpcTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeZoneVpcTreeResponseBody getBody() {
        return this.body;
    }

}
