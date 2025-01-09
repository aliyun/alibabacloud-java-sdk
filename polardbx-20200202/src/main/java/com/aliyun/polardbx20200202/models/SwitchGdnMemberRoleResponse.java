// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SwitchGdnMemberRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchGdnMemberRoleResponseBody body;

    public static SwitchGdnMemberRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchGdnMemberRoleResponse self = new SwitchGdnMemberRoleResponse();
        return TeaModel.build(map, self);
    }

    public SwitchGdnMemberRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchGdnMemberRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchGdnMemberRoleResponse setBody(SwitchGdnMemberRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchGdnMemberRoleResponseBody getBody() {
        return this.body;
    }

}
