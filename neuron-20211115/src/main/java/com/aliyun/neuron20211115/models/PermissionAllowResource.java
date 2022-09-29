// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PermissionAllowResource extends TeaModel {
    @NameInMap("resourceList")
    public java.util.List<String> resourceList;

    public static PermissionAllowResource build(java.util.Map<String, ?> map) throws Exception {
        PermissionAllowResource self = new PermissionAllowResource();
        return TeaModel.build(map, self);
    }

    public PermissionAllowResource setResourceList(java.util.List<String> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<String> getResourceList() {
        return this.resourceList;
    }

}
