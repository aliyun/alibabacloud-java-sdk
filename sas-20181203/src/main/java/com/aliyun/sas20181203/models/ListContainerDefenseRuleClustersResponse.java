// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListContainerDefenseRuleClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContainerDefenseRuleClustersResponseBody body;

    public static ListContainerDefenseRuleClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerDefenseRuleClustersResponse self = new ListContainerDefenseRuleClustersResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerDefenseRuleClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContainerDefenseRuleClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContainerDefenseRuleClustersResponse setBody(ListContainerDefenseRuleClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContainerDefenseRuleClustersResponseBody getBody() {
        return this.body;
    }

}
