// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktUnmatchedstatusbetweentemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktUnmatchedstatusbetweentemplateResponseBody body;

    public static ListLinkeLinktUnmatchedstatusbetweentemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktUnmatchedstatusbetweentemplateResponse self = new ListLinkeLinktUnmatchedstatusbetweentemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktUnmatchedstatusbetweentemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktUnmatchedstatusbetweentemplateResponse setBody(ListLinkeLinktUnmatchedstatusbetweentemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktUnmatchedstatusbetweentemplateResponseBody getBody() {
        return this.body;
    }

}
