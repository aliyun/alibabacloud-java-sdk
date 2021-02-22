// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class GetMessageDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageDetailResponseBody body;

    public static GetMessageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageDetailResponse self = new GetMessageDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageDetailResponse setBody(GetMessageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageDetailResponseBody getBody() {
        return this.body;
    }

}
