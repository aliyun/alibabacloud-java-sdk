// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadPlayDeviceAbilityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreloadPlayDeviceAbilityResponseBody body;

    public static PreloadPlayDeviceAbilityResponse build(java.util.Map<String, ?> map) throws Exception {
        PreloadPlayDeviceAbilityResponse self = new PreloadPlayDeviceAbilityResponse();
        return TeaModel.build(map, self);
    }

    public PreloadPlayDeviceAbilityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreloadPlayDeviceAbilityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreloadPlayDeviceAbilityResponse setBody(PreloadPlayDeviceAbilityResponseBody body) {
        this.body = body;
        return this;
    }
    public PreloadPlayDeviceAbilityResponseBody getBody() {
        return this.body;
    }

}
