// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSecurityGroupResponseBody body;

    public static GetSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityGroupResponse self = new GetSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecurityGroupResponse setBody(GetSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
