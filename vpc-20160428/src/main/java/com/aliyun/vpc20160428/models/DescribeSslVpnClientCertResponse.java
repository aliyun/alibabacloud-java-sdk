// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSslVpnClientCertResponseBody body;

    public static DescribeSslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertResponse self = new DescribeSslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSslVpnClientCertResponse setBody(DescribeSslVpnClientCertResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSslVpnClientCertResponseBody getBody() {
        return this.body;
    }

}
