// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAccessTimeRangeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPolicyAccessTimeRangeConfigResponseBody body;

    public static SetPolicyAccessTimeRangeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyAccessTimeRangeConfigResponse self = new SetPolicyAccessTimeRangeConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetPolicyAccessTimeRangeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPolicyAccessTimeRangeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPolicyAccessTimeRangeConfigResponse setBody(SetPolicyAccessTimeRangeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPolicyAccessTimeRangeConfigResponseBody getBody() {
        return this.body;
    }

}
