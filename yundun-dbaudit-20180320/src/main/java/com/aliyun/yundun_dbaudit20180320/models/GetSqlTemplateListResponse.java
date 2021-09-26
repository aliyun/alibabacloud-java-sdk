// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSqlTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSqlTemplateListResponseBody body;

    public static GetSqlTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTemplateListResponse self = new GetSqlTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlTemplateListResponse setBody(GetSqlTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlTemplateListResponseBody getBody() {
        return this.body;
    }

}
