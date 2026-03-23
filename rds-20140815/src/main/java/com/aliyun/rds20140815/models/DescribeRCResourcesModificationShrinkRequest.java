// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCResourcesModificationShrinkRequest extends TeaModel {
    @NameInMap("Conditionss")
    public String conditionssShrink;

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

    public static DescribeRCResourcesModificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCResourcesModificationShrinkRequest self = new DescribeRCResourcesModificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCResourcesModificationShrinkRequest setConditionssShrink(String conditionssShrink) {
        this.conditionssShrink = conditionssShrink;
        return this;
    }
    public String getConditionssShrink() {
        return this.conditionssShrink;
    }

    public DescribeRCResourcesModificationShrinkRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeRCResourcesModificationShrinkRequest setDestinationResource(String destinationResource) {
        this.destinationResource = destinationResource;
        return this;
    }
    public String getDestinationResource() {
        return this.destinationResource;
    }

    public DescribeRCResourcesModificationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCResourcesModificationShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeRCResourcesModificationShrinkRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeRCResourcesModificationShrinkRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public DescribeRCResourcesModificationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCResourcesModificationShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
