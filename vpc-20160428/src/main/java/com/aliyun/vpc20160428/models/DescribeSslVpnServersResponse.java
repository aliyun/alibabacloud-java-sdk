// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSslVpnServersResponseBody body;

    public static DescribeSslVpnServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnServersResponse self = new DescribeSslVpnServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSslVpnServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSslVpnServersResponse setBody(DescribeSslVpnServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSslVpnServersResponseBody getBody() {
        return this.body;
    }

}
