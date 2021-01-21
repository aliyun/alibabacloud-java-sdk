// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAppNameResponseBody body;

    public static SetAppNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppNameResponse self = new SetAppNameResponse();
        return TeaModel.build(map, self);
    }

    public SetAppNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppNameResponse setBody(SetAppNameResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppNameResponseBody getBody() {
        return this.body;
    }

}
