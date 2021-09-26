// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetGroupDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGroupDetailResponseBody body;

    public static GetGroupDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupDetailResponse self = new GetGroupDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupDetailResponse setBody(GetGroupDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupDetailResponseBody getBody() {
        return this.body;
    }

}
