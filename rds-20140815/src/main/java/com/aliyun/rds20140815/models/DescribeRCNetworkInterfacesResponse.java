// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCNetworkInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCNetworkInterfacesResponseBody body;

    public static DescribeRCNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCNetworkInterfacesResponse self = new DescribeRCNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCNetworkInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCNetworkInterfacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCNetworkInterfacesResponse setBody(DescribeRCNetworkInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

}
