// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListGrantedRolesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public RolePageResult result;

    public static ListGrantedRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGrantedRolesResponseBody self = new ListGrantedRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGrantedRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGrantedRolesResponseBody setResult(RolePageResult result) {
        this.result = result;
        return this;
    }
    public RolePageResult getResult() {
        return this.result;
    }

}
