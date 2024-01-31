// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyCollationTimeZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCollationTimeZoneResponse setBody(ModifyCollationTimeZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCollationTimeZoneResponseBody getBody() {
        return this.body;
    }

}
