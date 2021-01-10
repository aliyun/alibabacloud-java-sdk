// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetCasDatabaseAssignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetCasDatabaseAssignResponseBody body;

    public static SetCasDatabaseAssignResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasDatabaseAssignResponse self = new SetCasDatabaseAssignResponse();
        return TeaModel.build(map, self);
    }

    public SetCasDatabaseAssignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCasDatabaseAssignResponse setBody(SetCasDatabaseAssignResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasDatabaseAssignResponseBody getBody() {
        return this.body;
    }

}
