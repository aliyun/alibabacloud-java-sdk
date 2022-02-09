// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsDatabaseGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsDatabaseGatewaysResponseBody body;

    public static DescribeOmsDatabaseGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsDatabaseGatewaysResponse self = new DescribeOmsDatabaseGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsDatabaseGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsDatabaseGatewaysResponse setBody(DescribeOmsDatabaseGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsDatabaseGatewaysResponseBody getBody() {
        return this.body;
    }

}
