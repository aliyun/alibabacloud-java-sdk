// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListTicketNotesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTicketNotesResponseBody body;

    public static ListTicketNotesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTicketNotesResponse self = new ListTicketNotesResponse();
        return TeaModel.build(map, self);
    }

    public ListTicketNotesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTicketNotesResponse setBody(ListTicketNotesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTicketNotesResponseBody getBody() {
        return this.body;
    }

}
