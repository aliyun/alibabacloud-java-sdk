// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTemplateVersionsResponseBody body;

    public static ListTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsResponse self = new ListTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateVersionsResponse setBody(ListTemplateVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateVersionsResponseBody getBody() {
        return this.body;
    }

}
