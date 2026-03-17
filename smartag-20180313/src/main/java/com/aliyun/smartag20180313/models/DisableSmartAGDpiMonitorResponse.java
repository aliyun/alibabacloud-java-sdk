// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisableSmartAGDpiMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DisableSmartAGDpiMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSmartAGDpiMonitorResponse setBody(DisableSmartAGDpiMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSmartAGDpiMonitorResponseBody getBody() {
        return this.body;
    }

}
