// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourcePopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PermissionAllowResource body;

    public static ListPermissionResourcePopResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourcePopResponse self = new ListPermissionResourcePopResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourcePopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionResourcePopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionResourcePopResponse setBody(PermissionAllowResource body) {
        this.body = body;
        return this;
    }
    public PermissionAllowResource getBody() {
        return this.body;
    }

}
