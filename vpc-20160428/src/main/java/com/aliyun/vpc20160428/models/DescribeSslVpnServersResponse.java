// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSslVpnServersResponse setBody(DescribeSslVpnServersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSslVpnServersResponseBody getBody() {
        return this.body;
    }

}
