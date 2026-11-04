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
     * <p>The instance IDs.</p>
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
     * <p>The list of instance attributes to modify. You can modify multiple key-value pairs at a time. These pairs are merged with the original Key and Value request parameters. If an attribute with the same name has the same value, it is deduplicated. If the values are different, a parameter error is returned.</p>
     */
    @NameInMap("Properties")
    public java.util.List<ModifyInstancePropertiesRequestProperties> properties;

    /**
     * <p>The resource type.</p>
     * <blockquote>
     * <p>This parameter is case-sensitive. Ensure correct spelling.</p>
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
     * <li>PackageUsedUpStrategy: [enum]<ul>
     * <li>Postpaid (switches to the pay-as-you-go billing method)</li>
     * <li>Shutdown (hibernates or shuts down the instance)</li>
     * <li>Maintenance (stops the instance and enters O&amp;M mode, and does not allow client connections)</li>
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

    public ModifyInstancePropertiesRequest setProperties(java.util.List<ModifyInstancePropertiesRequestProperties> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<ModifyInstancePropertiesRequestProperties> getProperties() {
        return this.properties;
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

    public static class ModifyInstancePropertiesRequestProperties extends TeaModel {
        /**
         * <p>The name of the instance attribute. For example, DisableRemainingNotify specifies whether to disable the remaining duration reminder for the client, and PackageUsedUpStrategy specifies the policy applied when the package duration is used up.</p>
         * 
         * <strong>example:</strong>
         * <p>DisableRemainingNotify</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the instance attribute. When Key is set to DisableRemainingNotify, only the string true or false is supported, and ResourceType must be set to DurationPackage. A value of true indicates that the remaining duration reminder for the client is disabled. A value of false indicates that the reminder is retained and triggered based on the original conditions. Administrator notifications continue to be triggered based on the original conditions. For other attributes, pass values based on their respective definitions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyInstancePropertiesRequestProperties build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstancePropertiesRequestProperties self = new ModifyInstancePropertiesRequestProperties();
            return TeaModel.build(map, self);
        }

        public ModifyInstancePropertiesRequestProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyInstancePropertiesRequestProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
