// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartImageVulScanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartImageVulScanResponseBody body;

    public static StartImageVulScanResponse build(java.util.Map<String, ?> map) throws Exception {
        StartImageVulScanResponse self = new StartImageVulScanResponse();
        return TeaModel.build(map, self);
    }

    public StartImageVulScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartImageVulScanResponse setBody(StartImageVulScanResponseBody body) {
        this.body = body;
        return this;
    }
    public StartImageVulScanResponseBody getBody() {
        return this.body;
    }

}
