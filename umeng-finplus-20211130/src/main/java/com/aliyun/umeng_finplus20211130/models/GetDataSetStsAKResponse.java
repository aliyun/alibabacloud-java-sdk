// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetDataSetStsAKResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataSetStsAKResponseBody body;

    public static GetDataSetStsAKResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSetStsAKResponse self = new GetDataSetStsAKResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSetStsAKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSetStsAKResponse setBody(GetDataSetStsAKResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSetStsAKResponseBody getBody() {
        return this.body;
    }

}
