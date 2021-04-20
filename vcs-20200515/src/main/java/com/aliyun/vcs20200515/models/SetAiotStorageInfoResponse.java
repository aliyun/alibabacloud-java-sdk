// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SetAiotStorageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAiotStorageInfoResponseBody body;

    public static SetAiotStorageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAiotStorageInfoResponse self = new SetAiotStorageInfoResponse();
        return TeaModel.build(map, self);
    }

    public SetAiotStorageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAiotStorageInfoResponse setBody(SetAiotStorageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAiotStorageInfoResponseBody getBody() {
        return this.body;
    }

}
