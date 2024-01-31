// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAppVulScanCycleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppVulScanCycleResponseBody body;

    public static ModifyAppVulScanCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppVulScanCycleResponse self = new ModifyAppVulScanCycleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppVulScanCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppVulScanCycleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppVulScanCycleResponse setBody(ModifyAppVulScanCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppVulScanCycleResponseBody getBody() {
        return this.body;
    }

}
