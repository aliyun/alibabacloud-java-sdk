// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTrainTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTrainTicketResponseBody body;

    public static RecognizeTrainTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTrainTicketResponse self = new RecognizeTrainTicketResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTrainTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTrainTicketResponse setBody(RecognizeTrainTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTrainTicketResponseBody getBody() {
        return this.body;
    }

}
