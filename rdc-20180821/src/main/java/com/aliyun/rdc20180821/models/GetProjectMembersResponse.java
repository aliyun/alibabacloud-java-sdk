// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectMembersResponseBody body;

    public static GetProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMembersResponse self = new GetProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectMembersResponse setBody(GetProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectMembersResponseBody getBody() {
        return this.body;
    }

}
