// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class EnableSmartAGDpiMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSmartAGDpiMonitorResponseBody body;

    public static EnableSmartAGDpiMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSmartAGDpiMonitorResponse self = new EnableSmartAGDpiMonitorResponse();
        return TeaModel.build(map, self);
    }

    public EnableSmartAGDpiMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSmartAGDpiMonitorResponse setBody(EnableSmartAGDpiMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSmartAGDpiMonitorResponseBody getBody() {
        return this.body;
    }

}
