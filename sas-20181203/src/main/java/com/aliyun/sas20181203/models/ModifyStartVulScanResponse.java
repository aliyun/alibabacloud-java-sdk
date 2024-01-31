// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStartVulScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStartVulScanResponseBody body;

    public static ModifyStartVulScanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStartVulScanResponse self = new ModifyStartVulScanResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStartVulScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStartVulScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStartVulScanResponse setBody(ModifyStartVulScanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStartVulScanResponseBody getBody() {
        return this.body;
    }

}
