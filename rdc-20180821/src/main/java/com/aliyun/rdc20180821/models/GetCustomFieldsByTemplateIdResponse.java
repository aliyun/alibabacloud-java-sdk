// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetCustomFieldsByTemplateIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomFieldsByTemplateIdResponseBody body;

    public static GetCustomFieldsByTemplateIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldsByTemplateIdResponse self = new GetCustomFieldsByTemplateIdResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldsByTemplateIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomFieldsByTemplateIdResponse setBody(GetCustomFieldsByTemplateIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomFieldsByTemplateIdResponseBody getBody() {
        return this.body;
    }

}
