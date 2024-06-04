// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplateValidGroupsRequest extends TeaModel {
    /**
     * <p>The scenario in which the protection template is used.</p>
     * <br>
     * <p>*   **waf_group**: basic protection.</p>
     * <p>*   **antiscan**: scan protection.</p>
     * <p>*   **ip_blacklist**: IP address blacklist.</p>
     * <p>*   **custom_acl**: custom rule.</p>
     * <p>*   **whitelist**: whitelist.</p>
     * <p>*   **region_block**: region blacklist.</p>
     * <p>*   **custom_response**: custom response.</p>
     * <p>*   **cc**: HTTP flood protection.</p>
     * <p>*   **tamperproof**: website tamper-proofing.</p>
     * <p>*   **dlp**: data leakage prevention.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The name of the protected object group that you want to query.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

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

    /**
     * <p>The ID of the protection template.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeDefenseTemplateValidGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplateValidGroupsRequest self = new DescribeDefenseTemplateValidGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplateValidGroupsRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public DescribeDefenseTemplateValidGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeDefenseTemplateValidGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseTemplateValidGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDefenseTemplateValidGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDefenseTemplateValidGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseTemplateValidGroupsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDefenseTemplateValidGroupsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
