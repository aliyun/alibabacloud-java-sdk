// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class GetRdsBackUpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRdsBackUpResponseBody body;

    public static GetRdsBackUpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRdsBackUpResponse self = new GetRdsBackUpResponse();
        return TeaModel.build(map, self);
    }

    public GetRdsBackUpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRdsBackUpResponse setBody(GetRdsBackUpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRdsBackUpResponseBody getBody() {
        return this.body;
    }

}
