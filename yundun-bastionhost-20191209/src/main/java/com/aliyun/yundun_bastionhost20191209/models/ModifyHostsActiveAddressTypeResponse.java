// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsActiveAddressTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHostsActiveAddressTypeResponseBody body;

    public static ModifyHostsActiveAddressTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsActiveAddressTypeResponse self = new ModifyHostsActiveAddressTypeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHostsActiveAddressTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHostsActiveAddressTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHostsActiveAddressTypeResponse setBody(ModifyHostsActiveAddressTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostsActiveAddressTypeResponseBody getBody() {
        return this.body;
    }

}
