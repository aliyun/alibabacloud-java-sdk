// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateRbacOrgUnitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRbacOrgUnitResponseBody body;

    public static UpdateRbacOrgUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRbacOrgUnitResponse self = new UpdateRbacOrgUnitResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRbacOrgUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRbacOrgUnitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRbacOrgUnitResponse setBody(UpdateRbacOrgUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRbacOrgUnitResponseBody getBody() {
        return this.body;
    }

}
