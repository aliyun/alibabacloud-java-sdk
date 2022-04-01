// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListApplicationMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplicationMetaResponseBody body;

    public static ListApplicationMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMetaResponse self = new ListApplicationMetaResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationMetaResponse setBody(ListApplicationMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationMetaResponseBody getBody() {
        return this.body;
    }

}
