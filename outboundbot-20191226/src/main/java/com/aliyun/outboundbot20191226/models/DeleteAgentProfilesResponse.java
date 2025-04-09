// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteAgentProfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentProfilesResponseBody body;

    public static DeleteAgentProfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentProfilesResponse self = new DeleteAgentProfilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentProfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentProfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentProfilesResponse setBody(DeleteAgentProfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentProfilesResponseBody getBody() {
        return this.body;
    }

}
