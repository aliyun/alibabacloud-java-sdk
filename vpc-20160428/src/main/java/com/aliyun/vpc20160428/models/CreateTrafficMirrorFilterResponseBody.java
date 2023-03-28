// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateTrafficMirrorFilterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the mirrored traffic belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the filter.</p>
     */
    @NameInMap("TrafficMirrorFilterId")
    public String trafficMirrorFilterId;

    public static CreateTrafficMirrorFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficMirrorFilterResponseBody self = new CreateTrafficMirrorFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrafficMirrorFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrafficMirrorFilterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTrafficMirrorFilterResponseBody setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        return this;
    }
    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

}
