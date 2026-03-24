// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>428</p>
     */
    @NameInMap("ClusterId")
    public Long clusterId;

    /**
     * <p>The proxy type of the hybrid cloud cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>service</strong>: SDK-based integration.</p>
     * </li>
     * <li><p><strong>cname</strong>: CNAME-based reverse proxy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cname</p>
     */
    @NameInMap("ClusterProxyType")
    public String clusterProxyType;

    /**
     * <p>The name of the hybrid cloud node group that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>groupName1</p>
     */
    @NameInMap("GroupName")
    public Integer groupName;

    /**
     * <p>The type of the hybrid cloud node group. Valid values:</p>
     * <ul>
     * <li><p><strong>protect</strong>: protection node group.</p>
     * </li>
     * <li><p><strong>control</strong>: control node group.</p>
     * </li>
     * <li><p><strong>storage</strong>: storage node group.</p>
     * </li>
     * <li><p><strong>controlStorage</strong>: control and storage node group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>protect</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-********w0b</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the WAF instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
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
