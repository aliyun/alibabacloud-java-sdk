// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasRiskSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasRiskSceneResponseBody body;

    public static GetHasRiskSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasRiskSceneResponse self = new GetHasRiskSceneResponse();
        return TeaModel.build(map, self);
    }

    public GetHasRiskSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasRiskSceneResponse setBody(GetHasRiskSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasRiskSceneResponseBody getBody() {
        return this.body;
    }

}
