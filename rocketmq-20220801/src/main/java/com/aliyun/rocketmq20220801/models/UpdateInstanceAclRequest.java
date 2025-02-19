// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceAclRequest extends TeaModel {
    /**
     * <p>The following items describe the types of permissions that can be granted based on the resource type:</p>
     * <ul>
     * <li>Topic: Pub, Sub, and Pub|Sub</li>
     * <li>Consumer group: Sub</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>SUB: subscribe</li>
     * <li>Pub|Sub: publish and subscribe</li>
     * <li>Pub: publish</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pub</p>
     */
    @NameInMap("actions")
    public java.util.List<String> actions;

    /**
     * <p>The decision result of the authorization.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Deny</li>
     * <li>Allow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("decision")
    public String decision;

    /**
     * <p>The IP address whitelists.</p>
     */
    @NameInMap("ipWhitelists")
    public java.util.List<String> ipWhitelists;

    /**
     * <p>The name of the resource on which you want to grant permissions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>The type of the resource on which you want to grant permissions.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Group</li>
     * <li>Topic</li>
     * </ul>
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

    public UpdateInstanceAclRequest setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
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
