// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UploadAnalyzerRuntimeLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadAnalyzerRuntimeLogResponseBody body;

    public static UploadAnalyzerRuntimeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAnalyzerRuntimeLogResponse self = new UploadAnalyzerRuntimeLogResponse();
        return TeaModel.build(map, self);
    }

    public UploadAnalyzerRuntimeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAnalyzerRuntimeLogResponse setBody(UploadAnalyzerRuntimeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAnalyzerRuntimeLogResponseBody getBody() {
        return this.body;
    }

}
