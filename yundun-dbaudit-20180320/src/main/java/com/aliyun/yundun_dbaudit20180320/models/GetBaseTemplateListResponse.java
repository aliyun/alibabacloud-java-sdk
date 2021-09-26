// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetBaseTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBaseTemplateListResponseBody body;

    public static GetBaseTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBaseTemplateListResponse self = new GetBaseTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public GetBaseTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBaseTemplateListResponse setBody(GetBaseTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBaseTemplateListResponseBody getBody() {
        return this.body;
    }

}
