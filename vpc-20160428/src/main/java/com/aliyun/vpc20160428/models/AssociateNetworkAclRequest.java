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

    }

}
