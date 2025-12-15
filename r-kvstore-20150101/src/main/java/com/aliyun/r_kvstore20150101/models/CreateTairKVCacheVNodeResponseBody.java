// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairKVCacheVNodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the Tair VNode instance.</p>
     * 
     * <strong>example:</strong>
     * <p>tv-2zeb1ce76fee****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the VNode.</p>
     * 
     * <strong>example:</strong>
     * <p>vn-03a49876edb****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20905403119****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the region where the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VCluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vc-16965a9267*****-*****</p>
     */
    @NameInMap("VClusterId")
    public String VClusterId;

    /**
     * <p>The ID of the VCluster instance.</p>
     * 
     * <strong>example:</strong>
     * <p>tk-2ze4bba3c8fe****</p>
     */
    @NameInMap("VkName")
    public String vkName;

    /**
     * <p>The zone ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-f</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairKVCacheVNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTairKVCacheVNodeResponseBody self = new CreateTairKVCacheVNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTairKVCacheVNodeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTairKVCacheVNodeResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateTairKVCacheVNodeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CreateTairKVCacheVNodeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairKVCacheVNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTairKVCacheVNodeResponseBody setVClusterId(String VClusterId) {
        this.VClusterId = VClusterId;
        return this;
    }
    public String getVClusterId() {
        return this.VClusterId;
    }

    public CreateTairKVCacheVNodeResponseBody setVkName(String vkName) {
        this.vkName = vkName;
        return this;
    }
    public String getVkName() {
        return this.vkName;
    }

    public CreateTairKVCacheVNodeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
