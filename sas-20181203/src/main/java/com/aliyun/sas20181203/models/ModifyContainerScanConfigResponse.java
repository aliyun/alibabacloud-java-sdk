// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyContainerScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyContainerScanConfigResponseBody body;

    public static ModifyContainerScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyContainerScanConfigResponse self = new ModifyContainerScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyContainerScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyContainerScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyContainerScanConfigResponse setBody(ModifyContainerScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyContainerScanConfigResponseBody getBody() {
        return this.body;
    }

}
