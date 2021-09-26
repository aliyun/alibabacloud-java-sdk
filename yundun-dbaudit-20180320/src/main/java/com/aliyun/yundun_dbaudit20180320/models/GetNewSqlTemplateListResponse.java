// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetNewSqlTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNewSqlTemplateListResponseBody body;

    public static GetNewSqlTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNewSqlTemplateListResponse self = new GetNewSqlTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public GetNewSqlTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNewSqlTemplateListResponse setBody(GetNewSqlTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNewSqlTemplateListResponseBody getBody() {
        return this.body;
    }

}
