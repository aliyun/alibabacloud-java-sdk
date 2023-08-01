// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Permission extends TeaModel {
    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("ResourceType")
    public String resourceType;

    public static Permission build(java.util.Map<String, ?> map) throws Exception {
        Permission self = new Permission();
        return TeaModel.build(map, self);
    }

    public Permission setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public Permission setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
