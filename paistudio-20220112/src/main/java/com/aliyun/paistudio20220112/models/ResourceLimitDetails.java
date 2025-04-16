// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ResourceLimitDetails extends TeaModel {
    @NameInMap("GCLevel")
    public String GCLevel;

    @NameInMap("ResourceLimit")
    public java.util.Map<String, ?> resourceLimit;

    @NameInMap("ShouldIgnoreResourceCheck")
    public Boolean shouldIgnoreResourceCheck;

    public static ResourceLimitDetails build(java.util.Map<String, ?> map) throws Exception {
        ResourceLimitDetails self = new ResourceLimitDetails();
        return TeaModel.build(map, self);
    }

    public ResourceLimitDetails setGCLevel(String GCLevel) {
        this.GCLevel = GCLevel;
        return this;
    }
    public String getGCLevel() {
        return this.GCLevel;
    }

    public ResourceLimitDetails setResourceLimit(java.util.Map<String, ?> resourceLimit) {
        this.resourceLimit = resourceLimit;
        return this;
    }
    public java.util.Map<String, ?> getResourceLimit() {
        return this.resourceLimit;
    }

    public ResourceLimitDetails setShouldIgnoreResourceCheck(Boolean shouldIgnoreResourceCheck) {
        this.shouldIgnoreResourceCheck = shouldIgnoreResourceCheck;
        return this;
    }
    public Boolean getShouldIgnoreResourceCheck() {
        return this.shouldIgnoreResourceCheck;
    }

}
