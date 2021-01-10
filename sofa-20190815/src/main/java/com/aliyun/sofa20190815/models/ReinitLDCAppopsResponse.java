// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitLDCAppopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReinitLDCAppopsResponseBody body;

    public static ReinitLDCAppopsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinitLDCAppopsResponse self = new ReinitLDCAppopsResponse();
        return TeaModel.build(map, self);
    }

    public ReinitLDCAppopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinitLDCAppopsResponse setBody(ReinitLDCAppopsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinitLDCAppopsResponseBody getBody() {
        return this.body;
    }

}
