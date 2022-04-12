// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserVpcSecurityGroupResponseBody body;

    public static GetUserVpcSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcSecurityGroupResponse self = new GetUserVpcSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetUserVpcSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserVpcSecurityGroupResponse setBody(GetUserVpcSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserVpcSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
