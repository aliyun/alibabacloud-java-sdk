// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetTemplatePermissionResponseBody body;

    public static SetTemplatePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTemplatePermissionResponse self = new SetTemplatePermissionResponse();
        return TeaModel.build(map, self);
    }

    public SetTemplatePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTemplatePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetTemplatePermissionResponse setBody(SetTemplatePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTemplatePermissionResponseBody getBody() {
        return this.body;
    }

}
