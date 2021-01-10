// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDmsMsgTypeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDmsMsgTypeTemplateResponseBody body;

    public static GetDmsMsgTypeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDmsMsgTypeTemplateResponse self = new GetDmsMsgTypeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetDmsMsgTypeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDmsMsgTypeTemplateResponse setBody(GetDmsMsgTypeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDmsMsgTypeTemplateResponseBody getBody() {
        return this.body;
    }

}
