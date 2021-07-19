// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetApplicationGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApplicationGroupResponseBody body;

    public static GetApplicationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationGroupResponse self = new GetApplicationGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationGroupResponse setBody(GetApplicationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationGroupResponseBody getBody() {
        return this.body;
    }

}
