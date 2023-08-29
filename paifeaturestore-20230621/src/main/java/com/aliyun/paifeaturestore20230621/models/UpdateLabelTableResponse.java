// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateLabelTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLabelTableResponseBody body;

    public static UpdateLabelTableResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLabelTableResponse self = new UpdateLabelTableResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLabelTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLabelTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLabelTableResponse setBody(UpdateLabelTableResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLabelTableResponseBody getBody() {
        return this.body;
    }

}
