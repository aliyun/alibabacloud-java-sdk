// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SubmitImageAnalysisOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitImageAnalysisOutputResponseBody body;

    public static SubmitImageAnalysisOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageAnalysisOutputResponse self = new SubmitImageAnalysisOutputResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageAnalysisOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageAnalysisOutputResponse setBody(SubmitImageAnalysisOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageAnalysisOutputResponseBody getBody() {
        return this.body;
    }

}
