// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceLinkedRoleTemplateResponseBody body;

    public static GetServiceLinkedRoleTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleTemplateResponse self = new GetServiceLinkedRoleTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceLinkedRoleTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceLinkedRoleTemplateResponse setBody(GetServiceLinkedRoleTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceLinkedRoleTemplateResponseBody getBody() {
        return this.body;
    }

}
