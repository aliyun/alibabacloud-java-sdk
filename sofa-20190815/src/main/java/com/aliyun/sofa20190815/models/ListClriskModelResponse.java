// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskModelResponseBody body;

    public static ListClriskModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskModelResponse self = new ListClriskModelResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskModelResponse setBody(ListClriskModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskModelResponseBody getBody() {
        return this.body;
    }

}
