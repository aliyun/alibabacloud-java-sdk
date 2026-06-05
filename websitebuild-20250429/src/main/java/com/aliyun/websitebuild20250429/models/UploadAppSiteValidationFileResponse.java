// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UploadAppSiteValidationFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadAppSiteValidationFileResponseBody body;

    public static UploadAppSiteValidationFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAppSiteValidationFileResponse self = new UploadAppSiteValidationFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadAppSiteValidationFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAppSiteValidationFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadAppSiteValidationFileResponse setBody(UploadAppSiteValidationFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAppSiteValidationFileResponseBody getBody() {
        return this.body;
    }

}
