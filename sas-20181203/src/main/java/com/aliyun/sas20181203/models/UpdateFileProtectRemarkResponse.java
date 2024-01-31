// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFileProtectRemarkResponseBody body;

    public static UpdateFileProtectRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectRemarkResponse self = new UpdateFileProtectRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFileProtectRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFileProtectRemarkResponse setBody(UpdateFileProtectRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFileProtectRemarkResponseBody getBody() {
        return this.body;
    }

}
