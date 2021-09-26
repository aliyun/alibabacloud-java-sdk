// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionQueryConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSessionQueryConditionResponseBody body;

    public static GetSessionQueryConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionQueryConditionResponse self = new GetSessionQueryConditionResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionQueryConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionQueryConditionResponse setBody(GetSessionQueryConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionQueryConditionResponseBody getBody() {
        return this.body;
    }

}
