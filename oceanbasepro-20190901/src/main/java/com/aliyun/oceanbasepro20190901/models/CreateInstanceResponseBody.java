// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateInstanceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setData(CreateInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateInstanceResponseBodyData getData() {
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
        /**
         * <p>The result of the dry-run request.</p>
         * <p>If the DryRun parameter is set to true and the dry run succeeds, the DryRunResult parameter returns true. Otherwise, an error code is returned.
         * If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DryRunResult")
        public Boolean dryRunResult;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Order ID. The ID of the order that you have placed.
         * This parameter returns a value after you create a pre-paid or post-paid cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-***************</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static CreateInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyData self = new CreateInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyData setDryRunResult(Boolean dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }
        public Boolean getDryRunResult() {
            return this.dryRunResult;
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
