// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplatesRequest extends TeaModel {
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
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The sub-scenario in which the protection template is used. Valid values:</p>
     * <br>
     * <p>*   **web**: bot management for website protection.</p>
     * <p>*   **app**: bot management for app protection.</p>
     * <p>*   **basic**: bot management for basic protection.</p>
     */
    @NameInMap("DefenseSubScene")
    public String defenseSubScene;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to query the ID of the WAF instance.</p>
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
     * <p>The name of the protected object or protected object group.</p>
     * <br>
     * <p>>  If you specify ResourceType, you must specify this parameter.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the protected resource. Valid values:</p>
     * <br>
     * <p>*   **single**: protected object. This is the default value.</p>
     * <p>*   **group**: protected object group.</p>
     * <br>
     * <p>>  If you specify Resource, you must specify this parameter.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the protection template.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The type of the protection template. Valid values:</p>
     * <br>
     * <p>*   **user_default**: default template.</p>
     * <p>*   **user_custom**: custom template.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static DescribeDefenseTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseTemplatesRequest self = new DescribeDefenseTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseTemplatesRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public DescribeDefenseTemplatesRequest setDefenseSubScene(String defenseSubScene) {
        this.defenseSubScene = defenseSubScene;
        return this;
    }
    public String getDefenseSubScene() {
        return this.defenseSubScene;
    }

    public DescribeDefenseTemplatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDefenseTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDefenseTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseTemplatesRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public DescribeDefenseTemplatesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDefenseTemplatesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeDefenseTemplatesRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public DescribeDefenseTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
