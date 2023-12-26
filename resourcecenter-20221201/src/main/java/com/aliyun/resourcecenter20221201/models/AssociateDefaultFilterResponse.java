// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class AssociateDefaultFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateDefaultFilterResponseBody body;

    public static AssociateDefaultFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateDefaultFilterResponse self = new AssociateDefaultFilterResponse();
        return TeaModel.build(map, self);
    }

    public AssociateDefaultFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateDefaultFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateDefaultFilterResponse setBody(AssociateDefaultFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateDefaultFilterResponseBody getBody() {
        return this.body;
    }

}
