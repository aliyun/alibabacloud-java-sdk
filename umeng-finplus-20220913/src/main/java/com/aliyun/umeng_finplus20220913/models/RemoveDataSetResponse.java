// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class RemoveDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDataSetResponseBody body;

    public static RemoveDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataSetResponse self = new RemoveDataSetResponse();
        return TeaModel.build(map, self);
    }

    public RemoveDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDataSetResponse setBody(RemoveDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataSetResponseBody getBody() {
        return this.body;
    }

}
