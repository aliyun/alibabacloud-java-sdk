// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class DisassociateResourceShareRequest extends TeaModel {
    /**
     * <p>The owner of the resource share. Valid values:</p>
     * <ul>
     * <li>Self: The resource share belongs to the current account. This is the default value. For resource sharing within a resource directory, if you are a resource owner and you want to disassociate resources or principals from a resource share, set this parameter to Self.</li>
     * <li>OtherAccounts: The resource share belongs to another account. For resource sharing outside a resource directory, if you are a principal and you want to exit a resource share, set this parameter to OtherAccounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Self</p>
     */
    @NameInMap("ResourceOwner")
    public String resourceOwner;

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
    public java.util.List<DisassociateResourceShareRequestResources> resources;

    /**
     * <p>The information about the principals.</p>
     * 
     * <strong>example:</strong>
     * <p>172050525300****</p>
     */
    @NameInMap("Targets")
    public java.util.List<String> targets;

    public static DisassociateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateResourceShareRequest self = new DisassociateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateResourceShareRequest setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public String getResourceOwner() {
        return this.resourceOwner;
    }

    public DisassociateResourceShareRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public DisassociateResourceShareRequest setResources(java.util.List<DisassociateResourceShareRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DisassociateResourceShareRequestResources> getResources() {
        return this.resources;
    }

    public DisassociateResourceShareRequest setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public static class DisassociateResourceShareRequestResources extends TeaModel {
        /**
         * <p>The ID of the shared resource.</p>
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
         * <p> Resources.N.ResourceId and Resources.N.ResourceType must be used in pairs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VSwitch</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DisassociateResourceShareRequestResources build(java.util.Map<String, ?> map) throws Exception {
            DisassociateResourceShareRequestResources self = new DisassociateResourceShareRequestResources();
            return TeaModel.build(map, self);
        }

        public DisassociateResourceShareRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DisassociateResourceShareRequestResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
