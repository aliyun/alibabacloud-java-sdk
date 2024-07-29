// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppLiveStreamStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppLiveStreamStatusResponseBody body;

    public static ModifyAppLiveStreamStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppLiveStreamStatusResponse self = new ModifyAppLiveStreamStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppLiveStreamStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppLiveStreamStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppLiveStreamStatusResponse setBody(ModifyAppLiveStreamStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppLiveStreamStatusResponseBody getBody() {
        return this.body;
    }

}
