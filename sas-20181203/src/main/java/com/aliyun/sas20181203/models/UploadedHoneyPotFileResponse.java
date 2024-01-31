// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UploadedHoneyPotFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadedHoneyPotFileResponseBody body;

    public static UploadedHoneyPotFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadedHoneyPotFileResponse self = new UploadedHoneyPotFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadedHoneyPotFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadedHoneyPotFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadedHoneyPotFileResponse setBody(UploadedHoneyPotFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadedHoneyPotFileResponseBody getBody() {
        return this.body;
    }

}
