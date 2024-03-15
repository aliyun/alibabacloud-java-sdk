// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHouseholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeHouseholdResponseBody body;

    public static RecognizeHouseholdResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHouseholdResponse self = new RecognizeHouseholdResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHouseholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHouseholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeHouseholdResponse setBody(RecognizeHouseholdResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHouseholdResponseBody getBody() {
        return this.body;
    }

}
