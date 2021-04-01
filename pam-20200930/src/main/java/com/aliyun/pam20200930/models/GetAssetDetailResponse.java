// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GetAssetDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAssetDetailResponseBody body;

    public static GetAssetDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAssetDetailResponse self = new GetAssetDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAssetDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAssetDetailResponse setBody(GetAssetDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAssetDetailResponseBody getBody() {
        return this.body;
    }

}
