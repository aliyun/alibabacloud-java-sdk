// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ResourceRequirements extends TeaModel {
    @NameInMap("Limits")
    public java.util.Map<String, String> limits;

    @NameInMap("Requests")
    public java.util.Map<String, String> requests;

    public static ResourceRequirements build(java.util.Map<String, ?> map) throws Exception {
        ResourceRequirements self = new ResourceRequirements();
        return TeaModel.build(map, self);
    }

    public ResourceRequirements setLimits(java.util.Map<String, String> limits) {
        this.limits = limits;
        return this;
    }
    public java.util.Map<String, String> getLimits() {
        return this.limits;
    }

    public ResourceRequirements setRequests(java.util.Map<String, String> requests) {
        this.requests = requests;
        return this;
    }
    public java.util.Map<String, String> getRequests() {
        return this.requests;
    }

}
