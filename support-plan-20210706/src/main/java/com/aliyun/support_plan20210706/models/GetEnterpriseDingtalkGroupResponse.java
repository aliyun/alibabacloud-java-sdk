// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class GetEnterpriseDingtalkGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetEnterpriseDingtalkGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseDingtalkGroupResponse setBody(GetEnterpriseDingtalkGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseDingtalkGroupResponseBody getBody() {
        return this.body;
    }

}
