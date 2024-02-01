// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSslVpnClientCertsResponseBody body;

    public static DescribeSslVpnClientCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertsResponse self = new DescribeSslVpnClientCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSslVpnClientCertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSslVpnClientCertsResponse setBody(DescribeSslVpnClientCertsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSslVpnClientCertsResponseBody getBody() {
        return this.body;
    }

}
