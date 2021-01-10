// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasRisksceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasRisksceneResponseBody body;

    public static DeleteHasRisksceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasRisksceneResponse self = new DeleteHasRisksceneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasRisksceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasRisksceneResponse setBody(DeleteHasRisksceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasRisksceneResponseBody getBody() {
        return this.body;
    }

}
