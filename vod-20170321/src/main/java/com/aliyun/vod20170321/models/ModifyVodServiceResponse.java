// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyVodServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVodServiceResponseBody body;

    public static ModifyVodServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVodServiceResponse self = new ModifyVodServiceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVodServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVodServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVodServiceResponse setBody(ModifyVodServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVodServiceResponseBody getBody() {
        return this.body;
    }

}
