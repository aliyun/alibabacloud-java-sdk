// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpServiceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpServiceGroupPageResult body;

    public static ListPdpServiceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPdpServiceGroupsResponse self = new ListPdpServiceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListPdpServiceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPdpServiceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPdpServiceGroupsResponse setBody(PdpServiceGroupPageResult body) {
        this.body = body;
        return this;
    }
    public PdpServiceGroupPageResult getBody() {
        return this.body;
    }

}
