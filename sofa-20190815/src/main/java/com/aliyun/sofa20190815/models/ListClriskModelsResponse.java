// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskModelsResponseBody body;

    public static ListClriskModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskModelsResponse self = new ListClriskModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskModelsResponse setBody(ListClriskModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskModelsResponseBody getBody() {
        return this.body;
    }

}
