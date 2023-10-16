// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileUploadLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFileUploadLimitResponseBody body;

    public static CreateFileUploadLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileUploadLimitResponse self = new CreateFileUploadLimitResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileUploadLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileUploadLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileUploadLimitResponse setBody(CreateFileUploadLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileUploadLimitResponseBody getBody() {
        return this.body;
    }

}
