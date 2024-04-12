// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateApplicationVswitchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationVswitchesResponseBody body;

    public static UpdateApplicationVswitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationVswitchesResponse self = new UpdateApplicationVswitchesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationVswitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationVswitchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationVswitchesResponse setBody(UpdateApplicationVswitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationVswitchesResponseBody getBody() {
        return this.body;
    }

}
