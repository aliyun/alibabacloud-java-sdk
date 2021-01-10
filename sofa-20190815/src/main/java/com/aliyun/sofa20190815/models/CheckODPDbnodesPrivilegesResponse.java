// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckODPDbnodesPrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckODPDbnodesPrivilegesResponseBody body;

    public static CheckODPDbnodesPrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckODPDbnodesPrivilegesResponse self = new CheckODPDbnodesPrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public CheckODPDbnodesPrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckODPDbnodesPrivilegesResponse setBody(CheckODPDbnodesPrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckODPDbnodesPrivilegesResponseBody getBody() {
        return this.body;
    }

}
