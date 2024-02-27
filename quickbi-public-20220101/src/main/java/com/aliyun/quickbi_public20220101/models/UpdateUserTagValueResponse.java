// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserTagValueResponseBody body;

    public static UpdateUserTagValueResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserTagValueResponse self = new UpdateUserTagValueResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserTagValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserTagValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserTagValueResponse setBody(UpdateUserTagValueResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserTagValueResponseBody getBody() {
        return this.body;
    }

}
