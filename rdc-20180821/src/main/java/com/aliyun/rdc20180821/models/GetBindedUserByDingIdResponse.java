// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetBindedUserByDingIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBindedUserByDingIdResponseBody body;

    public static GetBindedUserByDingIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBindedUserByDingIdResponse self = new GetBindedUserByDingIdResponse();
        return TeaModel.build(map, self);
    }

    public GetBindedUserByDingIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBindedUserByDingIdResponse setBody(GetBindedUserByDingIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBindedUserByDingIdResponseBody getBody() {
        return this.body;
    }

}
