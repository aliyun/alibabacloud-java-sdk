// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncDWSVpcIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncDWSVpcIpResponseBody body;

    public static SyncDWSVpcIpResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDWSVpcIpResponse self = new SyncDWSVpcIpResponse();
        return TeaModel.build(map, self);
    }

    public SyncDWSVpcIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDWSVpcIpResponse setBody(SyncDWSVpcIpResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDWSVpcIpResponseBody getBody() {
        return this.body;
    }

}
