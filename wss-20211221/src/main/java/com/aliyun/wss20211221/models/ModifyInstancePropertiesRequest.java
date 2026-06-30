// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class ModifyInstancePropertiesRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mdp-0c62ayep0nk4v****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The key of the attribute.</p>
     * 
     * <strong>example:</strong>
     * <p>PackageUsedUpStrategy</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The resource type.</p>
     * <blockquote>
     * <p>This parameter is case-sensitive. Ensure that the value is spelled correctly.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DurationPackage</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The value of the attribute.</p>
     * <ul>
     * <li>PackageUsedUpStrategy: Valid values:<ul>
     * <li>Postpaid: Enters the pay-as-you-go phase.</li>
     * <li>Shutdown: Hibernation.</li>
     * <li>Maintenance: Shuts down and enters O&amp;M mode. Client connections are not allowed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("Value")
    public String value;

    public static ModifyInstancePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancePropertiesRequest self = new ModifyInstancePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstancePropertiesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstancePropertiesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyInstancePropertiesRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ModifyInstancePropertiesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ModifyInstancePropertiesRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
