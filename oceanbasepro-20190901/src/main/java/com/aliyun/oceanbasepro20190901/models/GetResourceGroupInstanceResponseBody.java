// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetResourceGroupInstanceResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroup")
    public GetResourceGroupInstanceResponseBodyResourceGroup resourceGroup;

    public static GetResourceGroupInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupInstanceResponseBody self = new GetResourceGroupInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupInstanceResponseBody setResourceGroup(GetResourceGroupInstanceResponseBodyResourceGroup resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public GetResourceGroupInstanceResponseBodyResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static class GetResourceGroupInstanceResponseBodyResourceGroup extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static GetResourceGroupInstanceResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupInstanceResponseBodyResourceGroup self = new GetResourceGroupInstanceResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupInstanceResponseBodyResourceGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetResourceGroupInstanceResponseBodyResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
