// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodeGroupDescriptionResponseBody body;

    public static UpdateNodeGroupDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupDescriptionResponse self = new UpdateNodeGroupDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeGroupDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodeGroupDescriptionResponse setBody(UpdateNodeGroupDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeGroupDescriptionResponseBody getBody() {
        return this.body;
    }

}
