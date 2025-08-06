// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyLicenseInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyLicenseInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLicenseInfoResponse setBody(ModifyLicenseInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLicenseInfoResponseBody getBody() {
        return this.body;
    }

}
