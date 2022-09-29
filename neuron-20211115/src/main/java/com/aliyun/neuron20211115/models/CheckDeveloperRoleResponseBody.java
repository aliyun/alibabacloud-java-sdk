// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CheckDeveloperRoleResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PermissionResult result;

    public static CheckDeveloperRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDeveloperRoleResponseBody self = new CheckDeveloperRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDeveloperRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDeveloperRoleResponseBody setResult(PermissionResult result) {
        this.result = result;
        return this;
    }
    public PermissionResult getResult() {
        return this.result;
    }

}
