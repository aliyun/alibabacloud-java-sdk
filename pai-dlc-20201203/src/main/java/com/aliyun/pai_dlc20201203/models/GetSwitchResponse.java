// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSwitchResponseBody body;

    public static GetSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchResponse self = new GetSwitchResponse();
        return TeaModel.build(map, self);
    }

    public GetSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSwitchResponse setBody(GetSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSwitchResponseBody getBody() {
        return this.body;
    }

}
