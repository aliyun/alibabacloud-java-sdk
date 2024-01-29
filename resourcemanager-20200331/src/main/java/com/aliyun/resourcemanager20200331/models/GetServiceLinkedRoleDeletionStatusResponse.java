// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleDeletionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceLinkedRoleDeletionStatusResponseBody body;

    public static GetServiceLinkedRoleDeletionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleDeletionStatusResponse self = new GetServiceLinkedRoleDeletionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleDeletionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceLinkedRoleDeletionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceLinkedRoleDeletionStatusResponse setBody(GetServiceLinkedRoleDeletionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceLinkedRoleDeletionStatusResponseBody getBody() {
        return this.body;
    }

}
