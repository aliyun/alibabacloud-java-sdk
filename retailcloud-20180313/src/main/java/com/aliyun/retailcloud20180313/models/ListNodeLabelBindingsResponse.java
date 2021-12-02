// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListNodeLabelBindingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNodeLabelBindingsResponseBody body;

    public static ListNodeLabelBindingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeLabelBindingsResponse self = new ListNodeLabelBindingsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeLabelBindingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeLabelBindingsResponse setBody(ListNodeLabelBindingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeLabelBindingsResponseBody getBody() {
        return this.body;
    }

}
