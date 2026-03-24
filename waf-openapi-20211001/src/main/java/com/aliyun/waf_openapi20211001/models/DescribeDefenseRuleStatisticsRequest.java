// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleStatisticsRequest extends TeaModel {
    /**
     * <p>The quaternary condition by which to group the rule statistics. This value cannot be the same as the primary, secondary, or tertiary condition.</p>
     * 
     * <strong>example:</strong>
     * <p>riskLevel</p>
     */
    @NameInMap("FourthKey")
    public String fourthKey;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The primary condition by which to group the rule statistics.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scene</p>
     */
    @NameInMap("PrimaryKey")
    public String primaryKey;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
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
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The secondary condition by which to group the rule statistics. This value cannot be the same as the primary condition.</p>
     * 
     * <strong>example:</strong>
     * <p>action</p>
     */
    @NameInMap("SecondaryKey")
    public String secondaryKey;

    /**
     * <p>The ID of the protection template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239136</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The tertiary condition by which to group the rule statistics. This value cannot be the same as the primary or secondary condition.</p>
     * 
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("ThirdKey")
    public String thirdKey;

    public static DescribeDefenseRuleStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseRuleStatisticsRequest self = new DescribeDefenseRuleStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseRuleStatisticsRequest setFourthKey(String fourthKey) {
        this.fourthKey = fourthKey;
        return this;
    }
    public String getFourthKey() {
        return this.fourthKey;
    }

    public DescribeDefenseRuleStatisticsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDefenseRuleStatisticsRequest setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public DescribeDefenseRuleStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDefenseRuleStatisticsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeDefenseRuleStatisticsRequest setSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public DescribeDefenseRuleStatisticsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public DescribeDefenseRuleStatisticsRequest setThirdKey(String thirdKey) {
        this.thirdKey = thirdKey;
        return this;
    }
    public String getThirdKey() {
        return this.thirdKey;
    }

}
