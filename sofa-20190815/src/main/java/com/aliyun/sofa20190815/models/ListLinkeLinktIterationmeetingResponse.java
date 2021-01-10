// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktIterationmeetingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktIterationmeetingResponseBody body;

    public static ListLinkeLinktIterationmeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktIterationmeetingResponse self = new ListLinkeLinktIterationmeetingResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktIterationmeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktIterationmeetingResponse setBody(ListLinkeLinktIterationmeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktIterationmeetingResponseBody getBody() {
        return this.body;
    }

}
