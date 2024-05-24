// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveAccessControlListEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveAccessControlListEntryResponseBody body;

    public static RemoveAccessControlListEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessControlListEntryResponse self = new RemoveAccessControlListEntryResponse();
        return TeaModel.build(map, self);
    }

    public RemoveAccessControlListEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveAccessControlListEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveAccessControlListEntryResponse setBody(RemoveAccessControlListEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveAccessControlListEntryResponseBody getBody() {
        return this.body;
    }

}
