// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsActiveAddressTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyHostsActiveAddressTypeResponse setBody(ModifyHostsActiveAddressTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHostsActiveAddressTypeResponseBody getBody() {
        return this.body;
    }

}
