// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListNodePodsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodePodsResponseBody body;

    public static ListNodePodsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodePodsResponse self = new ListNodePodsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodePodsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodePodsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodePodsResponse setBody(ListNodePodsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodePodsResponseBody getBody() {
        return this.body;
    }

}
