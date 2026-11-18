// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairAIGatewayInstanceResponseBody extends TeaModel {
    /**
     * <p>The number of instances that failed to be created in a batch. This parameter is not returned when a single instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tg-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceResults")
    public CreateTairAIGatewayInstanceResponseBodyInstanceResults instanceResults;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. The ID of the virtual node.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20881824000****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of instances successfully created in a batch. This parameter is not returned when a single instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>The total number of instances created in a batch. This parameter is not returned when a single instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. The ID of the virtual cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vc-16965a9267*****-*****</p>
     */
    @NameInMap("VClusterId")
    public String VClusterId;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. The instance ID of the VCluster virtual cluster where the VNode resides.</p>
     * 
     * <strong>example:</strong>
     * <p>tk-2ze4bba3c8fe****</p>
     */
    @NameInMap("VkName")
    public String vkName;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-l</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairAIGatewayInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTairAIGatewayInstanceResponseBody self = new CreateTairAIGatewayInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTairAIGatewayInstanceResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public CreateTairAIGatewayInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTairAIGatewayInstanceResponseBody setInstanceResults(CreateTairAIGatewayInstanceResponseBodyInstanceResults instanceResults) {
        this.instanceResults = instanceResults;
        return this;
    }
    public CreateTairAIGatewayInstanceResponseBodyInstanceResults getInstanceResults() {
        return this.instanceResults;
    }

    public CreateTairAIGatewayInstanceResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateTairAIGatewayInstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateTairAIGatewayInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairAIGatewayInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTairAIGatewayInstanceResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public CreateTairAIGatewayInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public CreateTairAIGatewayInstanceResponseBody setVClusterId(String VClusterId) {
        this.VClusterId = VClusterId;
        return this;
    }
    public String getVClusterId() {
        return this.VClusterId;
    }

    public CreateTairAIGatewayInstanceResponseBody setVkName(String vkName) {
        this.vkName = vkName;
        return this;
    }
    public String getVkName() {
        return this.vkName;
    }

    public CreateTairAIGatewayInstanceResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("Success")
        public Boolean success;

        public static CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults self = new CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults();
            return TeaModel.build(map, self);
        }

        public CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class CreateTairAIGatewayInstanceResponseBodyInstanceResults extends TeaModel {
        @NameInMap("instanceResults")
        public java.util.List<CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults> instanceResults;

        public static CreateTairAIGatewayInstanceResponseBodyInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            CreateTairAIGatewayInstanceResponseBodyInstanceResults self = new CreateTairAIGatewayInstanceResponseBodyInstanceResults();
            return TeaModel.build(map, self);
        }

        public CreateTairAIGatewayInstanceResponseBodyInstanceResults setInstanceResults(java.util.List<CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults> instanceResults) {
            this.instanceResults = instanceResults;
            return this;
        }
        public java.util.List<CreateTairAIGatewayInstanceResponseBodyInstanceResultsInstanceResults> getInstanceResults() {
            return this.instanceResults;
        }

    }

}
