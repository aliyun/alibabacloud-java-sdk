// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResetTSTriggerInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetTSTriggerInstanceStatusResponseBody body;

    public static ResetTSTriggerInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetTSTriggerInstanceStatusResponse self = new ResetTSTriggerInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ResetTSTriggerInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetTSTriggerInstanceStatusResponse setBody(ResetTSTriggerInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetTSTriggerInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
