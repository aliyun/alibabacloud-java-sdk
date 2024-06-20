// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupsRequest extends TeaModel {
    /**
     * <p>The name of the protected object group that you want to query. Fuzzy queries are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>demoGroupName</p>
     */
    @NameInMap("GroupNameLike")
    public String groupNameLike;

    /**
     * <p>The names of the protected object groups that you want to query. Separate multiple names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>groupName1,groupName2</p>
     */
    @NameInMap("GroupNames")
    public String groupNames;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-wwo36****0i</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxc7lf****eq</p>
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
