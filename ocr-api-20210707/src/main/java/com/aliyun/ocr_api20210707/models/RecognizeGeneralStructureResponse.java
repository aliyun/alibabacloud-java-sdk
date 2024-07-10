// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeGeneralStructureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeGeneralStructureResponseBody body;

    public static RecognizeGeneralStructureResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeGeneralStructureResponse self = new RecognizeGeneralStructureResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeGeneralStructureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeGeneralStructureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeGeneralStructureResponse setBody(RecognizeGeneralStructureResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeGeneralStructureResponseBody getBody() {
        return this.body;
    }

}
