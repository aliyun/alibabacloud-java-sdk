// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class GetRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRelationResponseBody body;

    public static GetRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRelationResponse self = new GetRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRelationResponse setBody(GetRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRelationResponseBody getBody() {
        return this.body;
    }

}
