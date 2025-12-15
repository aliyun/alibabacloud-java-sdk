// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupCapabilityRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportResourceGroupEvent")
    public Boolean supportResourceGroupEvent;

    public static ListResourceGroupCapabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupCapabilityRequest self = new ListResourceGroupCapabilityRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupCapabilityRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourceGroupCapabilityRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ListResourceGroupCapabilityRequest setSupportResourceGroupEvent(Boolean supportResourceGroupEvent) {
        this.supportResourceGroupEvent = supportResourceGroupEvent;
        return this;
    }
    public Boolean getSupportResourceGroupEvent() {
        return this.supportResourceGroupEvent;
    }

}
