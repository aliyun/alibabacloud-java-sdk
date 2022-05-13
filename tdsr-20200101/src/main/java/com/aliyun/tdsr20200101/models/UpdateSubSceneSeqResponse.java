// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateSubSceneSeqResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSubSceneSeqResponseBody body;

    public static UpdateSubSceneSeqResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubSceneSeqResponse self = new UpdateSubSceneSeqResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSubSceneSeqResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubSceneSeqResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubSceneSeqResponse setBody(UpdateSubSceneSeqResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubSceneSeqResponseBody getBody() {
        return this.body;
    }

}
