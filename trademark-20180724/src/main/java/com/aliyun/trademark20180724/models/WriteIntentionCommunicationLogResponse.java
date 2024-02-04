// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class WriteIntentionCommunicationLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WriteIntentionCommunicationLogResponseBody body;

    public static WriteIntentionCommunicationLogResponse build(java.util.Map<String, ?> map) throws Exception {
        WriteIntentionCommunicationLogResponse self = new WriteIntentionCommunicationLogResponse();
        return TeaModel.build(map, self);
    }

    public WriteIntentionCommunicationLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WriteIntentionCommunicationLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WriteIntentionCommunicationLogResponse setBody(WriteIntentionCommunicationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public WriteIntentionCommunicationLogResponseBody getBody() {
        return this.body;
    }

}
