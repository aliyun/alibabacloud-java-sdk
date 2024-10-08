// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class ListConfigRulesForTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConfigRulesForTargetResponseBody body;

    public static ListConfigRulesForTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRulesForTargetResponse self = new ListConfigRulesForTargetResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigRulesForTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigRulesForTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigRulesForTargetResponse setBody(ListConfigRulesForTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigRulesForTargetResponseBody getBody() {
        return this.body;
    }

}
