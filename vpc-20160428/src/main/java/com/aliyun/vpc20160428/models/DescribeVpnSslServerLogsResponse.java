// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpnSslServerLogsResponseBody body;

    public static DescribeVpnSslServerLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsResponse self = new DescribeVpnSslServerLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnSslServerLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnSslServerLogsResponse setBody(DescribeVpnSslServerLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnSslServerLogsResponseBody getBody() {
        return this.body;
    }

}
