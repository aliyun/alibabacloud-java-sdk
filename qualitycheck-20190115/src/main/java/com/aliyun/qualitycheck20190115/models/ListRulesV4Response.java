// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListRulesV4Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRulesV4ResponseBody body;

    public static ListRulesV4Response build(java.util.Map<String, ?> map) throws Exception {
        ListRulesV4Response self = new ListRulesV4Response();
        return TeaModel.build(map, self);
    }

    public ListRulesV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRulesV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRulesV4Response setBody(ListRulesV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRulesV4ResponseBody getBody() {
        return this.body;
    }

}
