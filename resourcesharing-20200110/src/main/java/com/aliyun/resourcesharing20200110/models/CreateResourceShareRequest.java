// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CreateResourceShareRequest extends TeaModel {
    /**
     * <p>Specifies whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
     * <ul>
     * <li>false (default): Resources in the resource share can be shared only with accounts in the resource directory.</li>
     * <li>true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowExternalTargets")
    public Boolean allowExternalTargets;

    /**
     * <p>The information about the permissions. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see <a href="https://help.aliyun.com/document_detail/465474.html">Permission library</a>.</p>
     */
    @NameInMap("PermissionNames")
    public java.util.List<String> permissionNames;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the resource share.</p>
     * <p>The name must be 1 to 50 characters in length.</p>
     * <p>The name can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceShareName")
    public String resourceShareName;

    /**
     * <p>The information about the shared resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<CreateResourceShareRequestResources> resources;

    @NameInMap("Tag")
    public java.util.List<CreateResourceShareRequestTag> tag;

    /**
     * <p>The properties of the principal.</p>
     * <blockquote>
     * <p> This parameter is available only when you specify an Alibaba Cloud service as a principal.</p>
     * </blockquote>
     */
    @NameInMap("TargetProperties")
    public java.util.List<CreateResourceShareRequestTargetProperties> targetProperties;

    /**
     * <p>The information about the principals.</p>
     * 
     * <strong>example:</strong>
     * <p>172050525300****</p>
     */
    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static CreateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceShareRequest self = new CreateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceShareRequest setAllowExternalTargets(Boolean allowExternalTargets) {
        this.allowExternalTargets = allowExternalTargets;
        return this;
    }
    public Boolean getAllowExternalTargets() {
        return this.allowExternalTargets;
    }

    public CreateResourceShareRequest setPermissionNames(java.util.List<String> permissionNames) {
        this.permissionNames = permissionNames;
        return this;
    }
    public java.util.List<String> getPermissionNames() {
        return this.permissionNames;
    }

    public CreateResourceShareRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateResourceShareRequest setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }
    public String getResourceShareName() {
        return this.resourceShareName;
    }

    public CreateResourceShareRequest setResources(java.util.List<CreateResourceShareRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateResourceShareRequestResources> getResources() {
        return this.resources;
    }

    public CreateResourceShareRequest setTag(java.util.List<CreateResourceShareRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateResourceShareRequestTag> getTag() {
        return this.tag;
    }

    public CreateResourceShareRequest setTargetProperties(java.util.List<CreateResourceShareRequestTargetProperties> targetProperties) {
        this.targetProperties = targetProperties;
        return this;
    }
    public java.util.List<CreateResourceShareRequestTargetProperties> getTargetProperties() {
        return this.targetProperties;
    }

    public CreateResourceShareRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public static class CreateResourceShareRequestResources extends TeaModel {
        /**
         * <p>The ID of a shared resource.</p>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
         * <blockquote>
         * <p> <code>Resources.N.ResourceId</code> and <code>Resources.N.ResourceType</code> must be used in pairs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp183p93qs667muql****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of a shared resource.</p>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
         * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
         * <blockquote>
         * <p> <code>Resources.N.ResourceId</code> and <code>Resources.N.ResourceType</code> must be used in pairs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateResourceShareRequestResources build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceShareRequestResources self = new CreateResourceShareRequestResources();
            return TeaModel.build(map, self);
        }

        public CreateResourceShareRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateResourceShareRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class CreateResourceShareRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateResourceShareRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceShareRequestTag self = new CreateResourceShareRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateResourceShareRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceShareRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateResourceShareRequestTargetProperties extends TeaModel {
        /**
         * <p>The property parameter of the principal. For example, you can specify a parameter that indicates the time range for resource sharing. Valid values of <code>timeRangeType</code>:</p>
         * <ul>
         * <li>timeRange: a specific time range</li>
         * <li>day: all day</li>
         * </ul>
         * <blockquote>
         * <p> <code>TargetProperties.N.TargetId</code> and <code>TargetProperties.N.Property</code> must be used in pairs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;timeRange&quot;:{
         *         &quot;timeRangeType&quot;:&quot;timeRange&quot;,
         *         &quot;beginAtTime&quot;:&quot;00:00&quot;,
         *         &quot;timezone&quot;:&quot;UTC+8&quot;,
         *         &quot;endAtTime&quot;:&quot;19:59&quot;
         *     }
         * }</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>The ID of the principal.</p>
         * <blockquote>
         * <p> <code>TargetProperties.N.TargetId</code> and <code>TargetProperties.N.Property</code> must be used in pairs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172050525300****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        public static CreateResourceShareRequestTargetProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceShareRequestTargetProperties self = new CreateResourceShareRequestTargetProperties();
            return TeaModel.build(map, self);
        }

        public CreateResourceShareRequestTargetProperties setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public CreateResourceShareRequestTargetProperties setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

}
