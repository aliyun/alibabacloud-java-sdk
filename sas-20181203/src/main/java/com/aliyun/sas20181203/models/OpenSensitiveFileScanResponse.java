// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OpenSensitiveFileScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenSensitiveFileScanResponseBody body;

    public static OpenSensitiveFileScanResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenSensitiveFileScanResponse self = new OpenSensitiveFileScanResponse();
        return TeaModel.build(map, self);
    }

    public OpenSensitiveFileScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenSensitiveFileScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenSensitiveFileScanResponse setBody(OpenSensitiveFileScanResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenSensitiveFileScanResponseBody getBody() {
        return this.body;
    }

}
