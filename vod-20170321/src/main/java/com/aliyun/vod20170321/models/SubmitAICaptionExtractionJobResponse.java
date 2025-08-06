// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAICaptionExtractionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAICaptionExtractionJobResponseBody body;

    public static SubmitAICaptionExtractionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAICaptionExtractionJobResponse self = new SubmitAICaptionExtractionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAICaptionExtractionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAICaptionExtractionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAICaptionExtractionJobResponse setBody(SubmitAICaptionExtractionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAICaptionExtractionJobResponseBody getBody() {
        return this.body;
    }

}
