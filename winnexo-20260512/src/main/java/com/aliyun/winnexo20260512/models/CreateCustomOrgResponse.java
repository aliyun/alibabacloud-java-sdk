// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateCustomOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomOrgResponseBody body;

    public static CreateCustomOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomOrgResponse self = new CreateCustomOrgResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomOrgResponse setBody(CreateCustomOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomOrgResponseBody getBody() {
        return this.body;
    }

}
