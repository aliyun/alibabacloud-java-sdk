// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceAclRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Pub</p>
     */
    @NameInMap("actions")
    public String actions;

    /**
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("decision")
    public String decision;

    @NameInMap("ipWhitelists")
    public java.util.List<String> ipWhitelists;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static UpdateInstanceAclRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAclRequest self = new UpdateInstanceAclRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAclRequest setActions(String actions) {
        this.actions = actions;
        return this;
    }
    public String getActions() {
        return this.actions;
    }

    public UpdateInstanceAclRequest setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public UpdateInstanceAclRequest setIpWhitelists(java.util.List<String> ipWhitelists) {
        this.ipWhitelists = ipWhitelists;
        return this;
    }
    public java.util.List<String> getIpWhitelists() {
        return this.ipWhitelists;
    }

    public UpdateInstanceAclRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public UpdateInstanceAclRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
