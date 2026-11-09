// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecRulesRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0x***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the returned rules. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The level of the rule.</p>
     * <p>For risk detection (risk) and security events (event), valid values:</p>
     * <ul>
     * <li><strong>high</strong>: High risk.</li>
     * <li><strong>medium</strong>: Medium risk.</li>
     * <li><strong>low</strong>: Low risk.</li>
     * </ul>
     * <p>For sensitive data (sensitive_word), valid values:</p>
     * <ul>
     * <li><strong>S1</strong>: S1 level.</li>
     * <li><strong>S2</strong>: S2 level.</li>
     * <li><strong>S3</strong>: S3 level.</li>
     * <li><strong>S4</strong>: S4 level.</li>
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
     * <li><strong>custom</strong>: Custom.</li>
     * <li><strong>default</strong>: Built-in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The page number to return in a paged query. Default value: <strong>1</strong>, which indicates the first page of paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page in a paged query. Default value: <strong>10</strong>, which indicates 10 entries per paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
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
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The enabling status of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: shutdown.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>risk</strong>: Risk detection.</li>
     * <li><strong>event</strong>: Security events.</li>
     * <li><strong>sensitive_word</strong>: Sensitive data.</li>
     * <li><strong>auth_flag</strong>: Authentication credentials.</li>
     * <li><strong>api_tag</strong>: Business purpose.</li>
     * <li><strong>desensitization</strong>: Data masking.</li>
     * <li><strong>whitelist</strong>: Whitelist.</li>
     * <li><strong>recognition</strong>: API identification.</li>
     * <li><strong>offline_api</strong>: Lifecycle management.</li>
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
