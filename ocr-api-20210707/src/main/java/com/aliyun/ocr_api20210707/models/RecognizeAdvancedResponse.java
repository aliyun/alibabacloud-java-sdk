// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAdvancedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeAdvancedResponseBody body;

    public static RecognizeAdvancedResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAdvancedResponse self = new RecognizeAdvancedResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAdvancedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeAdvancedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeAdvancedResponse setBody(RecognizeAdvancedResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeAdvancedResponseBody getBody() {
        return this.body;
    }

}
