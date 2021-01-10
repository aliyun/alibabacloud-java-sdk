// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSkillGroupConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSkillGroupConfigResponseBody body;

    public static ListSkillGroupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupConfigResponse self = new ListSkillGroupConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillGroupConfigResponse setBody(ListSkillGroupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillGroupConfigResponseBody getBody() {
        return this.body;
    }

}
