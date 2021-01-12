// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCollationTimeZoneResponseBody body;

    public static ModifyCollationTimeZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollationTimeZoneResponse self = new ModifyCollationTimeZoneResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCollationTimeZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCollationTimeZoneResponse setBody(ModifyCollationTimeZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCollationTimeZoneResponseBody getBody() {
        return this.body;
    }

}
