// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyNoticeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNoticeConfigResponseBody body;

    public static ModifyNoticeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNoticeConfigResponse self = new ModifyNoticeConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNoticeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNoticeConfigResponse setBody(ModifyNoticeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNoticeConfigResponseBody getBody() {
        return this.body;
    }

}
