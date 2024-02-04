// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class WriteCommunicationLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WriteCommunicationLogResponseBody body;

    public static WriteCommunicationLogResponse build(java.util.Map<String, ?> map) throws Exception {
        WriteCommunicationLogResponse self = new WriteCommunicationLogResponse();
        return TeaModel.build(map, self);
    }

    public WriteCommunicationLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WriteCommunicationLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WriteCommunicationLogResponse setBody(WriteCommunicationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public WriteCommunicationLogResponseBody getBody() {
        return this.body;
    }

}
