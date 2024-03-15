// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExitEntryPermitToHKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeExitEntryPermitToHKResponseBody body;

    public static RecognizeExitEntryPermitToHKResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExitEntryPermitToHKResponse self = new RecognizeExitEntryPermitToHKResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeExitEntryPermitToHKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeExitEntryPermitToHKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeExitEntryPermitToHKResponse setBody(RecognizeExitEntryPermitToHKResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeExitEntryPermitToHKResponseBody getBody() {
        return this.body;
    }

}
