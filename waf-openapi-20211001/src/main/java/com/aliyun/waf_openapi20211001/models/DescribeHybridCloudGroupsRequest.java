// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudGroupsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public Long clusterId;

    @NameInMap("ClusterProxyType")
    public String clusterProxyType;

    @NameInMap("GroupName")
    public Integer groupName;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeHybridCloudGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudGroupsRequest self = new DescribeHybridCloudGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudGroupsRequest setClusterId(Long clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public Long getClusterId() {
        return this.clusterId;
    }

    public DescribeHybridCloudGroupsRequest setClusterProxyType(String clusterProxyType) {
        this.clusterProxyType = clusterProxyType;
        return this;
    }
    public String getClusterProxyType() {
        return this.clusterProxyType;
    }

    public DescribeHybridCloudGroupsRequest setGroupName(Integer groupName) {
        this.groupName = groupName;
        return this;
    }
    public Integer getGroupName() {
        return this.groupName;
    }

    public DescribeHybridCloudGroupsRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeHybridCloudGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHybridCloudGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridCloudGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridCloudGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridCloudGroupsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
