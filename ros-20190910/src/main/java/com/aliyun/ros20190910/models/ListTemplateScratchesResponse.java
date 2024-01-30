// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListTemplateScratchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplateScratchesResponse setBody(ListTemplateScratchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateScratchesResponseBody getBody() {
        return this.body;
    }

}
