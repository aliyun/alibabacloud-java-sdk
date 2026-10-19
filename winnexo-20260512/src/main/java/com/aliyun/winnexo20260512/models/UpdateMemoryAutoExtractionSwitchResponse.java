// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateMemoryAutoExtractionSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMemoryAutoExtractionSwitchResponseBody body;

    public static UpdateMemoryAutoExtractionSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryAutoExtractionSwitchResponse self = new UpdateMemoryAutoExtractionSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryAutoExtractionSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemoryAutoExtractionSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemoryAutoExtractionSwitchResponse setBody(UpdateMemoryAutoExtractionSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemoryAutoExtractionSwitchResponseBody getBody() {
        return this.body;
    }

}
