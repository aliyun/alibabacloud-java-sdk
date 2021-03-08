// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAICaptionExtractionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SubmitAICaptionExtractionJobResponse setBody(SubmitAICaptionExtractionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAICaptionExtractionJobResponseBody getBody() {
        return this.body;
    }

}
