// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateNetworkAclRequest extends TeaModel {
    @NameInMap("Resource")
    public java.util.List<AssociateNetworkAclRequestResource> resource;

    @NameInMap("NetworkAclId")
    @Validation(required = true)
    public String networkAclId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AssociateNetworkAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkAclRequest self = new AssociateNetworkAclRequest();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkAclRequest setResource(java.util.List<AssociateNetworkAclRequestResource> resource) {
        this.resource = resource;
        return this;
    }
    public java.util.List<AssociateNetworkAclRequestResource> getResource() {
        return this.resource;
    }

    public AssociateNetworkAclRequest setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    public AssociateNetworkAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AssociateNetworkAclRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class AssociateNetworkAclRequestResource extends TeaModel {
        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        public static AssociateNetworkAclRequestResource build(java.util.Map<String, ?> map) throws Exception {
            AssociateNetworkAclRequestResource self = new AssociateNetworkAclRequestResource();
            return TeaModel.build(map, self);
        }

        public AssociateNetworkAclRequestResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public AssociateNetworkAclRequestResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
