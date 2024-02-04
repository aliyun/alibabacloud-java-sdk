// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveClassificationConditionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveClassificationConditionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveClassificationConditionsResponse setBody(SaveClassificationConditionsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveClassificationConditionsResponseBody getBody() {
        return this.body;
    }

}
