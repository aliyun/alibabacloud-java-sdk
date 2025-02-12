// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetIngestProcessorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IngestProcessor body;

    public static GetIngestProcessorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIngestProcessorResponse self = new GetIngestProcessorResponse();
        return TeaModel.build(map, self);
    }

    public GetIngestProcessorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIngestProcessorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIngestProcessorResponse setBody(IngestProcessor body) {
        this.body = body;
        return this;
    }
    public IngestProcessor getBody() {
        return this.body;
    }

}
