// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnterpriseDingtalkGroupResponseBody body;

    public static GetEnterpriseDingtalkGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDingtalkGroupResponse self = new GetEnterpriseDingtalkGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDingtalkGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseDingtalkGroupResponse setBody(GetEnterpriseDingtalkGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseDingtalkGroupResponseBody getBody() {
        return this.body;
    }

}
