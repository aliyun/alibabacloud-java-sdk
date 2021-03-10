// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListAudienceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAudienceResponseBody body;

    public static ListAudienceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAudienceResponse self = new ListAudienceResponse();
        return TeaModel.build(map, self);
    }

    public ListAudienceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAudienceResponse setBody(ListAudienceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAudienceResponseBody getBody() {
        return this.body;
    }

}
