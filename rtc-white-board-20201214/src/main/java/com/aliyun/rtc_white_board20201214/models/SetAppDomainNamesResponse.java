// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppDomainNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAppDomainNamesResponseBody body;

    public static SetAppDomainNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppDomainNamesResponse self = new SetAppDomainNamesResponse();
        return TeaModel.build(map, self);
    }

    public SetAppDomainNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppDomainNamesResponse setBody(SetAppDomainNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppDomainNamesResponseBody getBody() {
        return this.body;
    }

}
