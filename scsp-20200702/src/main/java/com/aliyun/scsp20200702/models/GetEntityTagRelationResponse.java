// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetEntityTagRelationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEntityTagRelationResponseBody body;

    public static GetEntityTagRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEntityTagRelationResponse self = new GetEntityTagRelationResponse();
        return TeaModel.build(map, self);
    }

    public GetEntityTagRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEntityTagRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEntityTagRelationResponse setBody(GetEntityTagRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEntityTagRelationResponseBody getBody() {
        return this.body;
    }

}
