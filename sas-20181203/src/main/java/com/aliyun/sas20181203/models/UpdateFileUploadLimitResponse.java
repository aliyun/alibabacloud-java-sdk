// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileUploadLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFileUploadLimitResponseBody body;

    public static UpdateFileUploadLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileUploadLimitResponse self = new UpdateFileUploadLimitResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileUploadLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileUploadLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileUploadLimitResponse setBody(UpdateFileUploadLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileUploadLimitResponseBody getBody() {
        return this.body;
    }

}
