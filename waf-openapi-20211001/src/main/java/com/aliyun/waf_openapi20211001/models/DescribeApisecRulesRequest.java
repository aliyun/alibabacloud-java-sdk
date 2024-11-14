// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecRulesRequest extends TeaModel {
    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0x***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The level of the policy.</p>
     * <p>If Type is set to risk or event, you can set this parameter to one of the following values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * <p>If Type is set to sensitive_word, you can set this parameter to one of the following values:</p>
     * <ul>
     * <li><strong>S1</strong></li>
     * <li><strong>S2</strong></li>
     * <li><strong>S3</strong></li>
     * <li><strong>S4</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>Information Leak</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The source of the policy. Valid values:</p>
     * <ul>
     * <li><strong>custom</strong></li>
     * <li><strong>default</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
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
     * <p>The status of the policy. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled</li>
     * <li><strong>0</strong>: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <ul>
     * <li><strong>risk</strong>: risk detection</li>
     * <li><strong>event</strong>: security event</li>
     * <li><strong>sensitive_word</strong>: sensitive data</li>
     * <li><strong>auth_flag</strong>: authentication credential</li>
     * <li><strong>api_tag</strong>: business purpose</li>
     * <li><strong>desensitization</strong>: masking</li>
     * <li><strong>whitelist</strong>: whitelist</li>
     * <li><strong>recognition</strong>: API recognition</li>
     * <li><strong>offline_api</strong>: lifecycle management</li>
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
