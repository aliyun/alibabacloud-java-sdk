// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourceForFrontResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPermissionResourceForFrontResponseBody body;

    public static ListPermissionResourceForFrontResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourceForFrontResponse self = new ListPermissionResourceForFrontResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourceForFrontResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionResourceForFrontResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionResourceForFrontResponse setBody(ListPermissionResourceForFrontResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionResourceForFrontResponseBody getBody() {
        return this.body;
    }

}
