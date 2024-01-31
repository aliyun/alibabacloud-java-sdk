// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSasContainerWebDefenseRuleApplicationResponseBody body;

    public static GetSasContainerWebDefenseRuleApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleApplicationResponse self = new GetSasContainerWebDefenseRuleApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSasContainerWebDefenseRuleApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSasContainerWebDefenseRuleApplicationResponse setBody(GetSasContainerWebDefenseRuleApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSasContainerWebDefenseRuleApplicationResponseBody getBody() {
        return this.body;
    }

}
