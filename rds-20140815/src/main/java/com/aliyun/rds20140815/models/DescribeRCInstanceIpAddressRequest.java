// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceIpAddressRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The region ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    /**
     * <p>The DDoS mitigation status of the asset. Valid values:</p>
     * <ul>
     * <li><strong>defense</strong>: queries assets for which traffic scrubbing is performed.</li>
     * <li><strong>blackhole</strong>: queries assets for which blackhole filtering is triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>defense</p>
     */
    @NameInMap("DdosStatus")
    public String ddosStatus;

    /**
     * <p>The ID of the RDS Custom instance to which the asset to query is added.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-y6dn4pyuub1r89******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>39.105.XXX.XXX</p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The name of the RDS Custom instance to which the asset to query is added.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-y6dn4pyuub1r89******</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The type of the asset that is assigned a public IP address. Set the value to <strong>ecs</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of instances on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the RDS Custom instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the resource. Set the value to <strong>ecs</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeRCInstanceIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceIpAddressRequest self = new DescribeRCInstanceIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceIpAddressRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRCInstanceIpAddressRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    public DescribeRCInstanceIpAddressRequest setDdosStatus(String ddosStatus) {
        this.ddosStatus = ddosStatus;
        return this;
    }
    public String getDdosStatus() {
        return this.ddosStatus;
    }

    public DescribeRCInstanceIpAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCInstanceIpAddressRequest setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public DescribeRCInstanceIpAddressRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeRCInstanceIpAddressRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeRCInstanceIpAddressRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInstanceIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCInstanceIpAddressRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
