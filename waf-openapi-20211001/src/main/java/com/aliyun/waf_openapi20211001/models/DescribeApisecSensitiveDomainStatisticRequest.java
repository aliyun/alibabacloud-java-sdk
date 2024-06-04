// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecSensitiveDomainStatisticRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderWay")
    public String orderWay;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    public static DescribeApisecSensitiveDomainStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecSensitiveDomainStatisticRequest self = new DescribeApisecSensitiveDomainStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecSensitiveDomainStatisticRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setOrderWay(String orderWay) {
        this.orderWay = orderWay;
        return this;
    }
    public String getOrderWay() {
        return this.orderWay;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeApisecSensitiveDomainStatisticRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
