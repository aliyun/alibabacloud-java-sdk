// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListHotWordsTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotWordsTasksResponseBody body;

    public static ListHotWordsTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotWordsTasksResponse self = new ListHotWordsTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListHotWordsTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotWordsTasksResponse setBody(ListHotWordsTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotWordsTasksResponseBody getBody() {
        return this.body;
    }

}
