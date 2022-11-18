// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewaySoftwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DowngradeSmartAccessGatewaySoftwareResponseBody body;

    public static DowngradeSmartAccessGatewaySoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradeSmartAccessGatewaySoftwareResponse self = new DowngradeSmartAccessGatewaySoftwareResponse();
        return TeaModel.build(map, self);
    }

    public DowngradeSmartAccessGatewaySoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradeSmartAccessGatewaySoftwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DowngradeSmartAccessGatewaySoftwareResponse setBody(DowngradeSmartAccessGatewaySoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradeSmartAccessGatewaySoftwareResponseBody getBody() {
        return this.body;
    }

}
