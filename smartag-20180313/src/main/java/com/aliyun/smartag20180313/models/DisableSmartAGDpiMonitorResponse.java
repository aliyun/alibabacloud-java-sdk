// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisableSmartAGDpiMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableSmartAGDpiMonitorResponseBody body;

    public static DisableSmartAGDpiMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSmartAGDpiMonitorResponse self = new DisableSmartAGDpiMonitorResponse();
        return TeaModel.build(map, self);
    }

    public DisableSmartAGDpiMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSmartAGDpiMonitorResponse setBody(DisableSmartAGDpiMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSmartAGDpiMonitorResponseBody getBody() {
        return this.body;
    }

}
