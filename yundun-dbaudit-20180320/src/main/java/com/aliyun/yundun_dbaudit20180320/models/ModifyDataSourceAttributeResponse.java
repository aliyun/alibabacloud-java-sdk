// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyDataSourceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDataSourceAttributeResponseBody body;

    public static ModifyDataSourceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceAttributeResponse self = new ModifyDataSourceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataSourceAttributeResponse setBody(ModifyDataSourceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataSourceAttributeResponseBody getBody() {
        return this.body;
    }

}
