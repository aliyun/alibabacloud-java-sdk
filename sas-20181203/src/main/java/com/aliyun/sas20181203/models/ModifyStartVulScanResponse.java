// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyStartVulScanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyStartVulScanResponse setBody(ModifyStartVulScanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStartVulScanResponseBody getBody() {
        return this.body;
    }

}
