// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyClientUserDNSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyClientUserDNSResponseBody body;

    public static ModifyClientUserDNSResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientUserDNSResponse self = new ModifyClientUserDNSResponse();
        return TeaModel.build(map, self);
    }

    public ModifyClientUserDNSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyClientUserDNSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyClientUserDNSResponse setBody(ModifyClientUserDNSResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyClientUserDNSResponseBody getBody() {
        return this.body;
    }

}
