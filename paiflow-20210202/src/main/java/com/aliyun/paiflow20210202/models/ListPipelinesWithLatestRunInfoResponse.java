// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelinesWithLatestRunInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPipelinesWithLatestRunInfoResponseBody body;

    public static ListPipelinesWithLatestRunInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesWithLatestRunInfoResponse self = new ListPipelinesWithLatestRunInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelinesWithLatestRunInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelinesWithLatestRunInfoResponse setBody(ListPipelinesWithLatestRunInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelinesWithLatestRunInfoResponseBody getBody() {
        return this.body;
    }

}
