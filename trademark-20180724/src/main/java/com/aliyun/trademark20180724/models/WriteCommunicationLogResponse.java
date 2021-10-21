// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class WriteCommunicationLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public WriteCommunicationLogResponse setBody(WriteCommunicationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public WriteCommunicationLogResponseBody getBody() {
        return this.body;
    }

}
