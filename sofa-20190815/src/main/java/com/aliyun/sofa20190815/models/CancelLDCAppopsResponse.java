// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLDCAppopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelLDCAppopsResponseBody body;

    public static CancelLDCAppopsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelLDCAppopsResponse self = new CancelLDCAppopsResponse();
        return TeaModel.build(map, self);
    }

    public CancelLDCAppopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelLDCAppopsResponse setBody(CancelLDCAppopsResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelLDCAppopsResponseBody getBody() {
        return this.body;
    }

}
