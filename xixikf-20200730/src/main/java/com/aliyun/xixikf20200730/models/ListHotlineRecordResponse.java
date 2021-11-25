// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class ListHotlineRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHotlineRecordResponseBody body;

    public static ListHotlineRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordResponse self = new ListHotlineRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotlineRecordResponse setBody(ListHotlineRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotlineRecordResponseBody getBody() {
        return this.body;
    }

}
