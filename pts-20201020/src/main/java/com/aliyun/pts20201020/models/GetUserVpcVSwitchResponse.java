// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcVSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserVpcVSwitchResponseBody body;

    public static GetUserVpcVSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcVSwitchResponse self = new GetUserVpcVSwitchResponse();
        return TeaModel.build(map, self);
    }

    public GetUserVpcVSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserVpcVSwitchResponse setBody(GetUserVpcVSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserVpcVSwitchResponseBody getBody() {
        return this.body;
    }

}
