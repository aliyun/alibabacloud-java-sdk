// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBusShipTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeBusShipTicketResponseBody body;

    public static RecognizeBusShipTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusShipTicketResponse self = new RecognizeBusShipTicketResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBusShipTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBusShipTicketResponse setBody(RecognizeBusShipTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBusShipTicketResponseBody getBody() {
        return this.body;
    }

}
