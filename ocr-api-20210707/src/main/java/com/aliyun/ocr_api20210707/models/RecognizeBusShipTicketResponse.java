// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBusShipTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RecognizeBusShipTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeBusShipTicketResponse setBody(RecognizeBusShipTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBusShipTicketResponseBody getBody() {
        return this.body;
    }

}
