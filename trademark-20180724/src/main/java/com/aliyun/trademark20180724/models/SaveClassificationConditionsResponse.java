// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveClassificationConditionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveClassificationConditionsResponseBody body;

    public static SaveClassificationConditionsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveClassificationConditionsResponse self = new SaveClassificationConditionsResponse();
        return TeaModel.build(map, self);
    }

    public SaveClassificationConditionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveClassificationConditionsResponse setBody(SaveClassificationConditionsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveClassificationConditionsResponseBody getBody() {
        return this.body;
    }

}
