// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroup")
    public ChangeResourceGroupResponseBodyResourceGroup resourceGroup;

    public static ChangeResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupResponseBody self = new ChangeResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeResourceGroupResponseBody setResourceGroup(ChangeResourceGroupResponseBodyResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public ChangeResourceGroupResponseBodyResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class ChangeResourceGroupResponseBodyResourceGroup extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NewResourceGroupId")
        public String newResourceGroupId;

        @NameInMap("ResourceOwnerId")
        public String resourceOwnerId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static ChangeResourceGroupResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            ChangeResourceGroupResponseBodyResourceGroup self = new ChangeResourceGroupResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public ChangeResourceGroupResponseBodyResourceGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ChangeResourceGroupResponseBodyResourceGroup setNewResourceGroupId(String newResourceGroupId) {
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }
        public String getNewResourceGroupId() {
            return this.newResourceGroupId;
        }

        public ChangeResourceGroupResponseBodyResourceGroup setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ChangeResourceGroupResponseBodyResourceGroup setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
