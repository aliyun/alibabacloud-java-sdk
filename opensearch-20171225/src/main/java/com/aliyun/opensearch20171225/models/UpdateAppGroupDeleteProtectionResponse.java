// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateAppGroupDeleteProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppGroupDeleteProtectionResponseBody body;

    public static UpdateAppGroupDeleteProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppGroupDeleteProtectionResponse self = new UpdateAppGroupDeleteProtectionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppGroupDeleteProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppGroupDeleteProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppGroupDeleteProtectionResponse setBody(UpdateAppGroupDeleteProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppGroupDeleteProtectionResponseBody getBody() {
        return this.body;
    }

}
