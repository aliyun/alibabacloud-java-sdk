// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateSubCNInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSubCNInstanceResponseBody body;

    public static CreateSubCNInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCNInstanceResponse self = new CreateSubCNInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubCNInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubCNInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubCNInstanceResponse setBody(CreateSubCNInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubCNInstanceResponseBody getBody() {
        return this.body;
    }

}
