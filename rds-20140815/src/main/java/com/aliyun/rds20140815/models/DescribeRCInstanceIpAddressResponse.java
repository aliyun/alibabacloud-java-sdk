// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstanceIpAddressResponseBody body;

    public static DescribeRCInstanceIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceIpAddressResponse self = new DescribeRCInstanceIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstanceIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstanceIpAddressResponse setBody(DescribeRCInstanceIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstanceIpAddressResponseBody getBody() {
        return this.body;
    }

}
