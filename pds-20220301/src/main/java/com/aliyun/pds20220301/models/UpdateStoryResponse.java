// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateStoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStoryResponseBody body;

    public static UpdateStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoryResponse self = new UpdateStoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStoryResponse setBody(UpdateStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStoryResponseBody getBody() {
        return this.body;
    }

}
