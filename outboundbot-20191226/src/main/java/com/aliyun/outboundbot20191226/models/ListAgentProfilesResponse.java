// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAgentProfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentProfilesResponseBody body;

    public static ListAgentProfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentProfilesResponse self = new ListAgentProfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentProfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentProfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentProfilesResponse setBody(ListAgentProfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentProfilesResponseBody getBody() {
        return this.body;
    }

}
