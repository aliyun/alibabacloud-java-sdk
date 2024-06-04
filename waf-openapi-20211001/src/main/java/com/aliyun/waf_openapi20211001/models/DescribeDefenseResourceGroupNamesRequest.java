// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupNamesRequest extends TeaModel {
    /**
     * <p>The name of the protected object group. Fuzzy queries are supported.</p>
     */
    @NameInMap("GroupNameLike")
    public String groupNameLike;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to query the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
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

    public static DescribeDefenseResourceGroupNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupNamesRequest self = new DescribeDefenseResourceGroupNamesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupNamesRequest setGroupNameLike(String groupNameLike) {
        this.groupNameLike = groupNameLike;
        return this;
    }
    public String getGroupNameLike() {
        return this.groupNameLike;
    }

    public DescribeDefenseResourceGroupNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseResourceGroupNamesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDefenseResourceGroupNamesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDefenseResourceGroupNamesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseResourceGroupNamesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
