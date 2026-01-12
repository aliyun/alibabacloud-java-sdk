// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class GetApplyStatusForTryOnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplyStatusForTryOnResponseBody body;

    public static GetApplyStatusForTryOnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplyStatusForTryOnResponse self = new GetApplyStatusForTryOnResponse();
        return TeaModel.build(map, self);
    }

    public GetApplyStatusForTryOnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplyStatusForTryOnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplyStatusForTryOnResponse setBody(GetApplyStatusForTryOnResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplyStatusForTryOnResponseBody getBody() {
        return this.body;
    }

}
