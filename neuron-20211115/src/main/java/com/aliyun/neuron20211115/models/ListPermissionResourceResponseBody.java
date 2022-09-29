// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourceResponseBody extends TeaModel {
    @NameInMap("permissionAllowResource")
    public PermissionAllowResource permissionAllowResource;

    @NameInMap("requestId")
    public String requestId;

    public static ListPermissionResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourceResponseBody self = new ListPermissionResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourceResponseBody setPermissionAllowResource(PermissionAllowResource permissionAllowResource) {
        this.permissionAllowResource = permissionAllowResource;
        return this;
    }
    public PermissionAllowResource getPermissionAllowResource() {
        return this.permissionAllowResource;
    }

    public ListPermissionResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
