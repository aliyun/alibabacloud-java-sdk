// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListCASSlsProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCASSlsProjectResponseBody body;

    public static ListCASSlsProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCASSlsProjectResponse self = new ListCASSlsProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListCASSlsProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCASSlsProjectResponse setBody(ListCASSlsProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCASSlsProjectResponseBody getBody() {
        return this.body;
    }

}
