// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateCloudResourceExtensionCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudResourceExtensionCertResponseBody body;

    public static CreateCloudResourceExtensionCertResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudResourceExtensionCertResponse self = new CreateCloudResourceExtensionCertResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudResourceExtensionCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudResourceExtensionCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudResourceExtensionCertResponse setBody(CreateCloudResourceExtensionCertResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudResourceExtensionCertResponseBody getBody() {
        return this.body;
    }

}
