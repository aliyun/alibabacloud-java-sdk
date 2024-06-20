// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseTemplatesRequest extends TeaModel {
    /**
     * <p>The scenario in which the protection template is used.</p>
     * <ul>
     * <li><strong>waf_group</strong>: basic protection.</li>
     * <li><strong>antiscan</strong>: scan protection.</li>
     * <li><strong>ip_blacklist</strong>: IP address blacklist.</li>
     * <li><strong>custom_acl</strong>: custom rule.</li>
     * <li><strong>whitelist</strong>: whitelist.</li>
     * <li><strong>region_block</strong>: region blacklist.</li>
     * <li><strong>custom_response</strong>: custom response.</li>
     * <li><strong>cc</strong>: HTTP flood protection.</li>
     * <li><strong>tamperproof</strong>: website tamper-proofing.</li>
     * <li><strong>dlp</strong>: data leakage prevention.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>region_block</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The sub-scenario in which the protection template is used. Valid values:</p>
     * <ul>
     * <li><strong>web</strong>: bot management for website protection.</li>
     * <li><strong>app</strong>: bot management for app protection.</li>
     * <li><strong>basic</strong>: bot management for basic protection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("DefenseSubScene")
    public String defenseSubScene;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-pe33b****03</p>
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
     * <p>10</p>
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
     * <p>The name of the protected object or protected object group.</p>
     * <blockquote>
     * <p> If you specify ResourceType, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxxqiu.cc-ecs</p>
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
     * <p>The type of the protected resource. Valid values:</p>
     * <ul>
     * <li><strong>single</strong>: protected object. This is the default value.</li>
     * <li><strong>group</strong>: protected object group.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify Resource, you must specify this parameter.</p>
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
     * <p>12345</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The type of the protection template. Valid values:</p>
     * <ul>
     * <li><strong>user_default</strong>: default template.</li>
     * <li><strong>user_custom</strong>: custom template.</li>
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

    public DescribeDefenseTemplatesRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
