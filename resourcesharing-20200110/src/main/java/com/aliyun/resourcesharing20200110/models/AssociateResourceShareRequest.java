// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AssociateResourceShareRequest extends TeaModel {
    /**
     * <p>The information about the permissions. If you do not configure this parameter, the system automatically associates the default permission for the specified resource type with the resource share. For more information, see <a href="https://help.aliyun.com/document_detail/465474.html">Permission library</a>.</p>
     */
    @NameInMap("PermissionNames")
    public java.util.List<String> permissionNames;

    @NameInMap("ResourceArns")
    public java.util.List<String> resourceArns;

    @NameInMap("ResourceProperties")
    public java.util.List<AssociateResourceShareRequestResourceProperties> resourceProperties;

    /**
     * <p>The ID of the resource share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-6GRmdD3X****</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    /**
     * <p>The information about the resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<AssociateResourceShareRequestResources> resources;

    /**
     * <p>The properties of the principal.</p>
     * <blockquote>
     * <p> This parameter is available only when you specify an Alibaba Cloud service as a principal.</p>
     * </blockquote>
     */
    @NameInMap("TargetProperties")
    public java.util.List<AssociateResourceShareRequestTargetProperties> targetProperties;

    /**
     * <p>The information about the principals.</p>
     * 
     * <strong>example:</strong>
     * <p>172050525300****</p>
     */
    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static AssociateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateResourceShareRequest self = new AssociateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public AssociateResourceShareRequest setPermissionNames(java.util.List<String> permissionNames) {
        this.permissionNames = permissionNames;
        return this;
    }
    public java.util.List<String> getPermissionNames() {
        return this.permissionNames;
    }

    public AssociateResourceShareRequest setResourceArns(java.util.List<String> resourceArns) {
        this.resourceArns = resourceArns;
        return this;
    }
    public java.util.List<String> getResourceArns() {
        return this.resourceArns;
    }

    public AssociateResourceShareRequest setResourceProperties(java.util.List<AssociateResourceShareRequestResourceProperties> resourceProperties) {
        this.resourceProperties = resourceProperties;
        return this;
    }
    public java.util.List<AssociateResourceShareRequestResourceProperties> getResourceProperties() {
        return this.resourceProperties;
    }

    public AssociateResourceShareRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public AssociateResourceShareRequest setResources(java.util.List<AssociateResourceShareRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<AssociateResourceShareRequestResources> getResources() {
        return this.resources;
    }

    public AssociateResourceShareRequest setTargetProperties(java.util.List<AssociateResourceShareRequestTargetProperties> targetProperties) {
        this.targetProperties = targetProperties;
        return this;
    }
    public java.util.List<AssociateResourceShareRequestTargetProperties> getTargetProperties() {
        return this.targetProperties;
    }

    public AssociateResourceShareRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public static class AssociateResourceShareRequestResourceProperties extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;sharePrincipals&quot;:true,&quot;shareTagOptions&quot;:false}</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <strong>example:</strong>
         * <p>acs:vpc:cn-shanghai:103755469187****:vswitch/vsw-uf62b11ue4m8oz2di****</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        public static AssociateResourceShareRequestResourceProperties build(java.util.Map<String, ?> map) throws Exception {
            AssociateResourceShareRequestResourceProperties self = new AssociateResourceShareRequestResourceProperties();
            return TeaModel.build(map, self);
        }

        public AssociateResourceShareRequestResourceProperties setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public AssociateResourceShareRequestResourceProperties setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

    }

    public static class AssociateResourceShareRequestResources extends TeaModel {
        /**
         * <p>The ID of a shared resource.</p>
         * <p>Valid values of N: 1 to 5. This indicates that a maximum of five shared resources can be specified at a time.</p>
         * <blockquote>
         * <p> Resources.N.ResourceId and Resources.N.ResourceType must be used in pairs.</p>
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

        public static AssociateResourceShareRequestResources build(java.util.Map<String, ?> map) throws Exception {
            AssociateResourceShareRequestResources self = new AssociateResourceShareRequestResources();
            return TeaModel.build(map, self);
        }

        public AssociateResourceShareRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AssociateResourceShareRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class AssociateResourceShareRequestTargetProperties extends TeaModel {
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

        public static AssociateResourceShareRequestTargetProperties build(java.util.Map<String, ?> map) throws Exception {
            AssociateResourceShareRequestTargetProperties self = new AssociateResourceShareRequestTargetProperties();
            return TeaModel.build(map, self);
        }

        public AssociateResourceShareRequestTargetProperties setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public AssociateResourceShareRequestTargetProperties setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

    }

}
