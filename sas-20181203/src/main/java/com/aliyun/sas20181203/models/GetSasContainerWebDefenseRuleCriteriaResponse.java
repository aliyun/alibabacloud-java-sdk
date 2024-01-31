// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSasContainerWebDefenseRuleCriteriaResponseBody body;

    public static GetSasContainerWebDefenseRuleCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleCriteriaResponse self = new GetSasContainerWebDefenseRuleCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSasContainerWebDefenseRuleCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSasContainerWebDefenseRuleCriteriaResponse setBody(GetSasContainerWebDefenseRuleCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSasContainerWebDefenseRuleCriteriaResponseBody getBody() {
        return this.body;
    }

}
