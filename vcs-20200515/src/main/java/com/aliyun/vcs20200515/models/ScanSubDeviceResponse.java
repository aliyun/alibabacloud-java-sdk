// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ScanSubDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScanSubDeviceResponseBody body;

    public static ScanSubDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanSubDeviceResponse self = new ScanSubDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ScanSubDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScanSubDeviceResponse setBody(ScanSubDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ScanSubDeviceResponseBody getBody() {
        return this.body;
    }

}
