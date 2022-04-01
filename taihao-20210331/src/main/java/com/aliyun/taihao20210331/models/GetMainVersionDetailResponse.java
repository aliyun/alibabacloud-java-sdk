// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetMainVersionDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMainVersionDetailResponseBody body;

    public static GetMainVersionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainVersionDetailResponse self = new GetMainVersionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMainVersionDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMainVersionDetailResponse setBody(GetMainVersionDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMainVersionDetailResponseBody getBody() {
        return this.body;
    }

}
