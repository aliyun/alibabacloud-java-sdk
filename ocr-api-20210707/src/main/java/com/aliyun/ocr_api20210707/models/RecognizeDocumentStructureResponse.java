// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDocumentStructureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeDocumentStructureResponseBody body;

    public static RecognizeDocumentStructureResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDocumentStructureResponse self = new RecognizeDocumentStructureResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeDocumentStructureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeDocumentStructureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeDocumentStructureResponse setBody(RecognizeDocumentStructureResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeDocumentStructureResponseBody getBody() {
        return this.body;
    }

}
