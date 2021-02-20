// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleDeletionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetServiceLinkedRoleDeletionStatusResponse setBody(GetServiceLinkedRoleDeletionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceLinkedRoleDeletionStatusResponseBody getBody() {
        return this.body;
    }

}
