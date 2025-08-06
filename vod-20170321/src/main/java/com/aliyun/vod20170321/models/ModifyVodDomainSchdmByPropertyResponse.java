// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ModifyVodDomainSchdmByPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVodDomainSchdmByPropertyResponseBody body;

    public static ModifyVodDomainSchdmByPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVodDomainSchdmByPropertyResponse self = new ModifyVodDomainSchdmByPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVodDomainSchdmByPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVodDomainSchdmByPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVodDomainSchdmByPropertyResponse setBody(ModifyVodDomainSchdmByPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVodDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

}
