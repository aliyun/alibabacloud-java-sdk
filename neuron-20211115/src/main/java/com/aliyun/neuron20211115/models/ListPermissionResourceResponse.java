// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PermissionAllowResource body;

    public static ListPermissionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourceResponse self = new ListPermissionResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionResourceResponse setBody(PermissionAllowResource body) {
        this.body = body;
        return this;
    }
    public PermissionAllowResource getBody() {
        return this.body;
    }

}
