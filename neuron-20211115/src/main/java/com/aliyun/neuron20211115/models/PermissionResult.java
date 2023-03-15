// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PermissionResult extends TeaModel {
    @NameInMap("allow")
    public Boolean allow;

    @NameInMap("requestId")
    public String requestId;

    public static PermissionResult build(java.util.Map<String, ?> map) throws Exception {
        PermissionResult self = new PermissionResult();
        return TeaModel.build(map, self);
    }

    public PermissionResult setAllow(Boolean allow) {
        this.allow = allow;
        return this;
    }
    public Boolean getAllow() {
        return this.allow;
    }

    public PermissionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
