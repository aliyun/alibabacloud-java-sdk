// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public java.util.List<CreateInstanceResponseBodyData> data;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setData(java.util.List<CreateInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateInstanceResponseBodyData> getData() {
        return this.data;
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateInstanceResponseBodyData extends TeaModel {
        // 实例ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 订单ID。该参数只有创建包年包月ECS实例（请求参数InstanceChargeType=PrePaid）时有返回值。
        @NameInMap("OrderId")
        public String orderId;

        // 资源组ID
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static CreateInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyData self = new CreateInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CreateInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
