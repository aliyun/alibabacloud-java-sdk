// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupsRequest extends TeaModel {
    /**
     * <p>The name of the protected object group that you want to query. Fuzzy queries are supported.</p>
     */
    @NameInMap("GroupNameLike")
    public String groupNameLike;

    /**
     * <p>The names of the protected object groups that you want to query. Separate multiple names with commas (,).</p>
     */
    @NameInMap("GroupNames")
    public String groupNames;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou**: Chinese mainland.</p>
     * <p>*   **ap-southeast-1**: outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeDefenseResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupsRequest self = new DescribeDefenseResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupsRequest setGroupNameLike(String groupNameLike) {
        this.groupNameLike = groupNameLike;
        return this;
    }
    public String getGroupNameLike() {
        return this.groupNameLike;
    }

    public DescribeDefenseResourceGroupsRequest setGroupNames(String groupNames) {
        this.groupNames = groupNames;
        return this;
    }
    public String getGroupNames() {
        return this.groupNames;
    }

    public DescribeDefenseResourceGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseResourceGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDefenseResourceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDefenseResourceGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseResourceGroupsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
