// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeRollTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeRollTicketResponseBody body;

    public static RecognizeRollTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRollTicketResponse self = new RecognizeRollTicketResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeRollTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeRollTicketResponse setBody(RecognizeRollTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeRollTicketResponseBody getBody() {
        return this.body;
    }

}
