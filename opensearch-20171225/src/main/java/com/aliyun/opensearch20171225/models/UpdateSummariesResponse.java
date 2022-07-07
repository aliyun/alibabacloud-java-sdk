// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSummariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSummariesResponseBody body;

    public static UpdateSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSummariesResponse self = new UpdateSummariesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSummariesResponse setBody(UpdateSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSummariesResponseBody getBody() {
        return this.body;
    }

}
