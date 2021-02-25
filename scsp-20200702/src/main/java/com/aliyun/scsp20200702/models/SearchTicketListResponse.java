// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class SearchTicketListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTicketListResponseBody body;

    public static SearchTicketListResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTicketListResponse self = new SearchTicketListResponse();
        return TeaModel.build(map, self);
    }

    public SearchTicketListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTicketListResponse setBody(SearchTicketListResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTicketListResponseBody getBody() {
        return this.body;
    }

}
