// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetContainerDefenseRuleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContainerDefenseRuleDetailResponseBody body;

    public static GetContainerDefenseRuleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContainerDefenseRuleDetailResponse self = new GetContainerDefenseRuleDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetContainerDefenseRuleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContainerDefenseRuleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContainerDefenseRuleDetailResponse setBody(GetContainerDefenseRuleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContainerDefenseRuleDetailResponseBody getBody() {
        return this.body;
    }

}
