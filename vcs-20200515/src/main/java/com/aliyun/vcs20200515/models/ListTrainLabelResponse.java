// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListTrainLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrainLabelResponseBody body;

    public static ListTrainLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrainLabelResponse self = new ListTrainLabelResponse();
        return TeaModel.build(map, self);
    }

    public ListTrainLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrainLabelResponse setBody(ListTrainLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrainLabelResponseBody getBody() {
        return this.body;
    }

}
