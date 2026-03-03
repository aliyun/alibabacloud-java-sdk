// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpLanesForServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpLanesPageResult body;

    public static ListPdpLanesForServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPdpLanesForServiceGroupResponse self = new ListPdpLanesForServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListPdpLanesForServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPdpLanesForServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPdpLanesForServiceGroupResponse setBody(PdpLanesPageResult body) {
        this.body = body;
        return this;
    }
    public PdpLanesPageResult getBody() {
        return this.body;
    }

}
