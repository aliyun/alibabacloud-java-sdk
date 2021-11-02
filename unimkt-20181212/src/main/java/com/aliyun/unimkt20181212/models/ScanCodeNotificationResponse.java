// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ScanCodeNotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanCodeNotificationResponseBody body;

    public static ScanCodeNotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanCodeNotificationResponse self = new ScanCodeNotificationResponse();
        return TeaModel.build(map, self);
    }

    public ScanCodeNotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanCodeNotificationResponse setBody(ScanCodeNotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanCodeNotificationResponseBody getBody() {
        return this.body;
    }

}
