// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeTagKeysForExpressConnectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagKeysForExpressConnectResponseBody body;

    public static DescribeTagKeysForExpressConnectResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagKeysForExpressConnectResponse self = new DescribeTagKeysForExpressConnectResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagKeysForExpressConnectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagKeysForExpressConnectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagKeysForExpressConnectResponse setBody(DescribeTagKeysForExpressConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagKeysForExpressConnectResponseBody getBody() {
        return this.body;
    }

}
