// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetUserGroupInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserGroupInfoResponseBody body;

    public static GetUserGroupInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserGroupInfoResponse self = new GetUserGroupInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserGroupInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserGroupInfoResponse setBody(GetUserGroupInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserGroupInfoResponseBody getBody() {
        return this.body;
    }

}
