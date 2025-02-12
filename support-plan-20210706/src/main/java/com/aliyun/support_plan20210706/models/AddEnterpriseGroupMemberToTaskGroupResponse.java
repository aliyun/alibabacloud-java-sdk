// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class AddEnterpriseGroupMemberToTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddEnterpriseGroupMemberToTaskGroupResponseBody body;

    public static AddEnterpriseGroupMemberToTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnterpriseGroupMemberToTaskGroupResponse self = new AddEnterpriseGroupMemberToTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddEnterpriseGroupMemberToTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnterpriseGroupMemberToTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddEnterpriseGroupMemberToTaskGroupResponse setBody(AddEnterpriseGroupMemberToTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnterpriseGroupMemberToTaskGroupResponseBody getBody() {
        return this.body;
    }

}
