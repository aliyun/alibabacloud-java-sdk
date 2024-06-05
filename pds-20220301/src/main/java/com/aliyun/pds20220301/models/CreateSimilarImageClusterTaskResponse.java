// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateSimilarImageClusterTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSimilarImageClusterTaskResponseBody body;

    public static CreateSimilarImageClusterTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSimilarImageClusterTaskResponse self = new CreateSimilarImageClusterTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSimilarImageClusterTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSimilarImageClusterTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSimilarImageClusterTaskResponse setBody(CreateSimilarImageClusterTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSimilarImageClusterTaskResponseBody getBody() {
        return this.body;
    }

}
