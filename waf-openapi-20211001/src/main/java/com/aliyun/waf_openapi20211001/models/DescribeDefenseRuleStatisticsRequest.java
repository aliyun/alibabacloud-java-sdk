// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseRuleStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>riskLevel</p>
     */
    @NameInMap("FourthKey")
    public String fourthKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_elasticity-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scene</p>
     */
    @NameInMap("PrimaryKey")
    public String primaryKey;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>action</p>
     */
    @NameInMap("SecondaryKey")
    public String secondaryKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>239136</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
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
