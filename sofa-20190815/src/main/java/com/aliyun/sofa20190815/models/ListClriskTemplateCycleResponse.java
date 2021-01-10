// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateCycleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskTemplateCycleResponseBody body;

    public static ListClriskTemplateCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateCycleResponse self = new ListClriskTemplateCycleResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskTemplateCycleResponse setBody(ListClriskTemplateCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskTemplateCycleResponseBody getBody() {
        return this.body;
    }

}
