// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateRbacOrgUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRbacOrgUnitResponseBody body;

    public static CreateRbacOrgUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRbacOrgUnitResponse self = new CreateRbacOrgUnitResponse();
        return TeaModel.build(map, self);
    }

    public CreateRbacOrgUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRbacOrgUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRbacOrgUnitResponse setBody(CreateRbacOrgUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRbacOrgUnitResponseBody getBody() {
        return this.body;
    }

}
