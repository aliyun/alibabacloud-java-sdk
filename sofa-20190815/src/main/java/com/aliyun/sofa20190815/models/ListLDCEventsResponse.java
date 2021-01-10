// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCEventsResponseBody body;

    public static ListLDCEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCEventsResponse self = new ListLDCEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCEventsResponse setBody(ListLDCEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCEventsResponseBody getBody() {
        return this.body;
    }

}
