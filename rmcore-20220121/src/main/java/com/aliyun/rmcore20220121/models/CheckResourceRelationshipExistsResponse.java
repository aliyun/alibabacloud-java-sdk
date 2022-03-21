// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class CheckResourceRelationshipExistsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckResourceRelationshipExistsResponseBody body;

    public static CheckResourceRelationshipExistsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceRelationshipExistsResponse self = new CheckResourceRelationshipExistsResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceRelationshipExistsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceRelationshipExistsResponse setBody(CheckResourceRelationshipExistsResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceRelationshipExistsResponseBody getBody() {
        return this.body;
    }

}
