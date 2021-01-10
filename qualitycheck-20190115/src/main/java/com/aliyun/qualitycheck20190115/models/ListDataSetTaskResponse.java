// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListDataSetTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSetTaskResponseBody body;

    public static ListDataSetTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetTaskResponse self = new ListDataSetTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSetTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSetTaskResponse setBody(ListDataSetTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSetTaskResponseBody getBody() {
        return this.body;
    }

}
