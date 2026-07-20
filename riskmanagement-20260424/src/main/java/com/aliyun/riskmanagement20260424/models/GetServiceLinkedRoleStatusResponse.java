// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceLinkedRoleStatusResponseBody body;

    public static GetServiceLinkedRoleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleStatusResponse self = new GetServiceLinkedRoleStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceLinkedRoleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceLinkedRoleStatusResponse setBody(GetServiceLinkedRoleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceLinkedRoleStatusResponseBody getBody() {
        return this.body;
    }

}
