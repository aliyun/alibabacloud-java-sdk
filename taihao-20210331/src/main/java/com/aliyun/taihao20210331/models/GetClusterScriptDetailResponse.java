// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterScriptDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterScriptDetailResponseBody body;

    public static GetClusterScriptDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScriptDetailResponse self = new GetClusterScriptDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterScriptDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterScriptDetailResponse setBody(GetClusterScriptDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterScriptDetailResponseBody getBody() {
        return this.body;
    }

}
