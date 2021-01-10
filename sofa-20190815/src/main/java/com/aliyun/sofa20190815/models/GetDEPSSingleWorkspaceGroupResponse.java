// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDEPSSingleWorkspaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDEPSSingleWorkspaceGroupResponseBody body;

    public static GetDEPSSingleWorkspaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDEPSSingleWorkspaceGroupResponse self = new GetDEPSSingleWorkspaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetDEPSSingleWorkspaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDEPSSingleWorkspaceGroupResponse setBody(GetDEPSSingleWorkspaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDEPSSingleWorkspaceGroupResponseBody getBody() {
        return this.body;
    }

}
