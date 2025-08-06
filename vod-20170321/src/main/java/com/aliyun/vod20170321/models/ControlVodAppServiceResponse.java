// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ControlVodAppServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ControlVodAppServiceResponseBody body;

    public static ControlVodAppServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ControlVodAppServiceResponse self = new ControlVodAppServiceResponse();
        return TeaModel.build(map, self);
    }

    public ControlVodAppServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ControlVodAppServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ControlVodAppServiceResponse setBody(ControlVodAppServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ControlVodAppServiceResponseBody getBody() {
        return this.body;
    }

}
