// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudResourceCertResponseBody body;

    public static ModifyCloudResourceCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceCertResponse self = new ModifyCloudResourceCertResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudResourceCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudResourceCertResponse setBody(ModifyCloudResourceCertResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudResourceCertResponseBody getBody() {
        return this.body;
    }

}
