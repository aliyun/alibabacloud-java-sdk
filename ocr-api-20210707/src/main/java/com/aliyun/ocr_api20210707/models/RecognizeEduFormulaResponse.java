// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduFormulaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeEduFormulaResponseBody body;

    public static RecognizeEduFormulaResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduFormulaResponse self = new RecognizeEduFormulaResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEduFormulaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEduFormulaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEduFormulaResponse setBody(RecognizeEduFormulaResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduFormulaResponseBody getBody() {
        return this.body;
    }

}
