// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CopyDefenseTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyDefenseTemplateResponseBody body;

    public static CopyDefenseTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyDefenseTemplateResponse self = new CopyDefenseTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CopyDefenseTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyDefenseTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyDefenseTemplateResponse setBody(CopyDefenseTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyDefenseTemplateResponseBody getBody() {
        return this.body;
    }

}
