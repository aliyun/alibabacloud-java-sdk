// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadLabelDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadLabelDataResponseBody body;

    public static UploadLabelDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadLabelDataResponse self = new UploadLabelDataResponse();
        return TeaModel.build(map, self);
    }

    public UploadLabelDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadLabelDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadLabelDataResponse setBody(UploadLabelDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadLabelDataResponseBody getBody() {
        return this.body;
    }

}
