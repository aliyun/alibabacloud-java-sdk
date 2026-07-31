// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplatesRequest extends TeaModel {
    /**
     * <p>The protection scenario. For more information, see the <strong>DefenseScene</strong> parameter in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>region_block</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The sub-scenario of the protection template. Valid values:</p>
     * <ul>
     * <li><strong>web</strong>: BOT management web protection scenario template.</li>
     * <li><strong>app</strong>: BOT management app protection scenario template.</li>
     * <li><strong>basic</strong>: BOT management basic protection template.</li>
     * <li><strong>bot_custom_acl</strong>: BOT management advanced custom rule protection template.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("DefenseSubScene")
    public String defenseSubScene;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-pe33b****03</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number to return in a paging query request. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paging query. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the WAF instance is deployed. Valid values:</p>
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
     * <p>The name of the protected object, protection group, or the ID of the protected asset.</p>
     * <blockquote>
     * <p>This parameter is used together with the ResourceType parameter. Both parameters must have values for filtering to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ruiqiu.cc-ecs</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvyknl****fa</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The type of the protected resource.</p>
     * <blockquote>
     * <p>This parameter is used together with the Resource parameter. Both parameters must have values for filtering to take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the protection template.</p>
     * 
     * <strong>example:</strong>
     * <p>39395</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The IDs of the protection templates to query. You can specify this parameter to query the protected resources associated with multiple protection templates. Separate multiple template IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>189731,189539,189538,189531,189540,189542,189541</p>
     */
    @NameInMap("TemplateIds")
    public String templateIds;

    /**
     * <p>The name of the protection template to query.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The templatetype of the protection template. Valid values:</p>
     * <ul>
     * <li><strong>user_default</strong>: user default protection.</li>
     * <li><strong>user_custom</strong>: user custom protection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user_default</p>
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

    public DescribeDefenseTemplatesRequest setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public String getTemplateIds() {
        return this.templateIds;
    }

    public DescribeDefenseTemplatesRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public DescribeDefenseTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
