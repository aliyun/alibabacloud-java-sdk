// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class DeleteTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrainingJobResponseBody body;

    public static DeleteTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrainingJobResponse self = new DeleteTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrainingJobResponse setBody(DeleteTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrainingJobResponseBody getBody() {
        return this.body;
    }

}
