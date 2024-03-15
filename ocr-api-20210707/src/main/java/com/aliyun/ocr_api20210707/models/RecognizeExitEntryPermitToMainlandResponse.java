// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExitEntryPermitToMainlandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeExitEntryPermitToMainlandResponseBody body;

    public static RecognizeExitEntryPermitToMainlandResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExitEntryPermitToMainlandResponse self = new RecognizeExitEntryPermitToMainlandResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeExitEntryPermitToMainlandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeExitEntryPermitToMainlandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeExitEntryPermitToMainlandResponse setBody(RecognizeExitEntryPermitToMainlandResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeExitEntryPermitToMainlandResponseBody getBody() {
        return this.body;
    }

}
