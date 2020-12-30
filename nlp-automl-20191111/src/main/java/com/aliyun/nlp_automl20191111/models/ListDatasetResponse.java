// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class ListDatasetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatasetResponseBody body;

    public static ListDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetResponse self = new ListDatasetResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetResponse setBody(ListDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetResponseBody getBody() {
        return this.body;
    }

}
