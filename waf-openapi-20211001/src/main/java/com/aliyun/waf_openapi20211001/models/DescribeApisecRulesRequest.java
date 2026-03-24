// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecRulesRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0x***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The level of the rule.</p>
     * <p>For threat detection (risk) and security events (event), valid values are:</p>
     * <ul>
     * <li><p><strong>high</strong>: important</p>
     * </li>
     * <li><p><strong>medium</strong>: medium</p>
     * </li>
     * <li><p><strong>low</strong>: low</p>
     * </li>
     * </ul>
     * <p>For sensitive data (sensitive_word), valid values are:</p>
     * <ul>
     * <li><p><strong>S1</strong>: S1</p>
     * </li>
     * <li><p><strong>S2</strong>: S2</p>
     * </li>
     * <li><p><strong>S3</strong>: S3</p>
     * </li>
     * <li><p><strong>S4</strong>: S4</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>information leakage</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>custom</strong>: custom</p>
     * </li>
     * <li><p><strong>default</strong>: built-in</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The enabling status of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: enabled</p>
     * </li>
     * <li><p><strong>0</strong>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>risk</strong>: threat detection</p>
     * </li>
     * <li><p><strong>event</strong>: security event</p>
     * </li>
     * <li><p><strong>sensitive_word</strong>: sensitive data</p>
     * </li>
     * <li><p><strong>auth_flag</strong>: authentication credential</p>
     * </li>
     * <li><p><strong>api_tag</strong>: business purpose</p>
     * </li>
     * <li><p><strong>desensitization</strong>: data masking</p>
     * </li>
     * <li><p><strong>whitelist</strong>: whitelist</p>
     * </li>
     * <li><p><strong>recognition</strong>: API</p>
     * </li>
     * <li><p><strong>offline_api</strong>: lifecycle management</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>risk</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeApisecRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecRulesRequest self = new DescribeApisecRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisecRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApisecRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeApisecRulesRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeApisecRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeApisecRulesRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public DescribeApisecRulesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisecRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeApisecRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApisecRulesRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeApisecRulesRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public DescribeApisecRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
