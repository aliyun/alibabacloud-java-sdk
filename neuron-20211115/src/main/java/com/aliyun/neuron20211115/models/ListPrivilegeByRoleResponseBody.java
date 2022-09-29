// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPrivilegeByRoleResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PrivilegePageResult result;

    public static ListPrivilegeByRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivilegeByRoleResponseBody self = new ListPrivilegeByRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivilegeByRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivilegeByRoleResponseBody setResult(PrivilegePageResult result) {
        this.result = result;
        return this;
    }
    public PrivilegePageResult getResult() {
        return this.result;
    }

}
