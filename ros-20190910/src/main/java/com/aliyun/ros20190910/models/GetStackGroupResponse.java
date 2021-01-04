// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStackGroupResponseBody body;

    public static GetStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackGroupResponse self = new GetStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetStackGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackGroupResponse setBody(GetStackGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackGroupResponseBody getBody() {
        return this.body;
    }

}
