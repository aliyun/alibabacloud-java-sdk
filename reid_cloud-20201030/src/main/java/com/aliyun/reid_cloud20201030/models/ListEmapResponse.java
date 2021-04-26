// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListEmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmapResponseBody body;

    public static ListEmapResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmapResponse self = new ListEmapResponse();
        return TeaModel.build(map, self);
    }

    public ListEmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmapResponse setBody(ListEmapResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmapResponseBody getBody() {
        return this.body;
    }

}
