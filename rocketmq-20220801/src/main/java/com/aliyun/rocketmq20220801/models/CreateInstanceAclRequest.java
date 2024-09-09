// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceAclRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Pub</p>
     */
    @NameInMap("actions")
    public String actions;

    /**
     * <p>This parameter is required.</p>
     * 
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

    public static CreateInstanceAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceAclRequest self = new CreateInstanceAclRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceAclRequest setActions(String actions) {
        this.actions = actions;
        return this;
    }
    public String getActions() {
        return this.actions;
    }

    public CreateInstanceAclRequest setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public CreateInstanceAclRequest setIpWhitelists(java.util.List<String> ipWhitelists) {
        this.ipWhitelists = ipWhitelists;
        return this;
    }
    public java.util.List<String> getIpWhitelists() {
        return this.ipWhitelists;
    }

    public CreateInstanceAclRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CreateInstanceAclRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
