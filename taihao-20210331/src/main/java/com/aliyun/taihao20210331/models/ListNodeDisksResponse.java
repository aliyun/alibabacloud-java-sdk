// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListNodeDisksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeDisksResponseBody body;

    public static ListNodeDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeDisksResponse self = new ListNodeDisksResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeDisksResponse setBody(ListNodeDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeDisksResponseBody getBody() {
        return this.body;
    }

}
