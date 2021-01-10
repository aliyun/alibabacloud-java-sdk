// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsSgRelationSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsSgRelationSwitchResponseBody body;

    public static GetMsSgRelationSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsSgRelationSwitchResponse self = new GetMsSgRelationSwitchResponse();
        return TeaModel.build(map, self);
    }

    public GetMsSgRelationSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsSgRelationSwitchResponse setBody(GetMsSgRelationSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsSgRelationSwitchResponseBody getBody() {
        return this.body;
    }

}
