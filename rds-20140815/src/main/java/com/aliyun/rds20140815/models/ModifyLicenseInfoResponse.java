// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyLicenseInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyLicenseInfoResponseBody body;

    public static ModifyLicenseInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLicenseInfoResponse self = new ModifyLicenseInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLicenseInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLicenseInfoResponse setBody(ModifyLicenseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLicenseInfoResponseBody getBody() {
        return this.body;
    }

}
