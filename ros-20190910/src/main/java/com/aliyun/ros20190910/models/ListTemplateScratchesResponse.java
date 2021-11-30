// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTemplateScratchesResponseBody body;

    public static ListTemplateScratchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateScratchesResponse self = new ListTemplateScratchesResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateScratchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateScratchesResponse setBody(ListTemplateScratchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateScratchesResponseBody getBody() {
        return this.body;
    }

}
