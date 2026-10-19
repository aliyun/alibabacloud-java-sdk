// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetMemoryAutoExtractionSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMemoryAutoExtractionSwitchResponseBody body;

    public static GetMemoryAutoExtractionSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryAutoExtractionSwitchResponse self = new GetMemoryAutoExtractionSwitchResponse();
        return TeaModel.build(map, self);
    }

    public GetMemoryAutoExtractionSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemoryAutoExtractionSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemoryAutoExtractionSwitchResponse setBody(GetMemoryAutoExtractionSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemoryAutoExtractionSwitchResponseBody getBody() {
        return this.body;
    }

}
