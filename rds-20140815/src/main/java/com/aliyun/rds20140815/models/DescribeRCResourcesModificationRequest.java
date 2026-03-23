// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCResourcesModificationRequest extends TeaModel {
    @NameInMap("Conditionss")
    public java.util.List<String> conditionss;

    @NameInMap("Cores")
    public Integer cores;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceType</p>
     */
    @NameInMap("DestinationResource")
    public String destinationResource;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Memory")
    public Float memory;

    /**
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeRCResourcesModificationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCResourcesModificationRequest self = new DescribeRCResourcesModificationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCResourcesModificationRequest setConditionss(java.util.List<String> conditionss) {
        this.conditionss = conditionss;
        return this;
    }
    public java.util.List<String> getConditionss() {
        return this.conditionss;
    }

    public DescribeRCResourcesModificationRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeRCResourcesModificationRequest setDestinationResource(String destinationResource) {
        this.destinationResource = destinationResource;
        return this;
    }
    public String getDestinationResource() {
        return this.destinationResource;
    }

    public DescribeRCResourcesModificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCResourcesModificationRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeRCResourcesModificationRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeRCResourcesModificationRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeRCResourcesModificationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCResourcesModificationRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
