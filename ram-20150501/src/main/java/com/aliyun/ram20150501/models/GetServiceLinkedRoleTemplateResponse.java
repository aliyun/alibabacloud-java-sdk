// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
