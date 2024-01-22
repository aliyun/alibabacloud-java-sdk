// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InstanceExecAuthorizationOutput extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("accountId")
    public String accountId;

    @NameInMap("authorization")
    public String authorization;

    @NameInMap("date")
    public String date;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("requestId")
    public String requestId;

    public static InstanceExecAuthorizationOutput build(java.util.Map<String, ?> map) throws Exception {
        InstanceExecAuthorizationOutput self = new InstanceExecAuthorizationOutput();
        return TeaModel.build(map, self);
    }

    public InstanceExecAuthorizationOutput setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public InstanceExecAuthorizationOutput setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public InstanceExecAuthorizationOutput setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public InstanceExecAuthorizationOutput setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public InstanceExecAuthorizationOutput setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public InstanceExecAuthorizationOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
