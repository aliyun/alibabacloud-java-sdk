// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateNumberDistrictInfoDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNumberDistrictInfoDownloadUrlResponseBody body;

    public static CreateNumberDistrictInfoDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNumberDistrictInfoDownloadUrlResponse self = new CreateNumberDistrictInfoDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public CreateNumberDistrictInfoDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNumberDistrictInfoDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNumberDistrictInfoDownloadUrlResponse setBody(CreateNumberDistrictInfoDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNumberDistrictInfoDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
