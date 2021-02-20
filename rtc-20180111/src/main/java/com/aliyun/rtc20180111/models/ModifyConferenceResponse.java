// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyConferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyConferenceResponseBody body;

    public static ModifyConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConferenceResponse self = new ModifyConferenceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConferenceResponse setBody(ModifyConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConferenceResponseBody getBody() {
        return this.body;
    }

}
