// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyMajorProtectionBlackIpRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Protection for major events</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expiration timestamp, in seconds.</p>
     * <blockquote>
     * <p>If the value is <strong>0</strong>, the rule takes effect permanently.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1662603328</p>
     */
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP blacklist to add. You can specify custom IP addresses or CIDR blocks. Both IPv4 and IPv6 are supported. Separate multiple IP addresses with commas (,).
     * For more information, see <a href="https://help.aliyun.com/document_detail/425591.html">Critical event protection</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12.XX.XX.2,3.XX.XX.3/24</p>
     */
    @NameInMap("IpList")
    public String ipList;

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
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the IP blacklist rule for critical event protection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20012033</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The ID of the critical event protection scenario template.</p>
     * <blockquote>
     * <p>This parameter requires the ID of a protection template of the critical event protection type. You can create this type of template only after you purchase the critical event protection upgrade.</p>
     * <p>For more information about how to enable critical event protection and create a critical event protection rule template, see <a href="https://help.aliyun.com/document_detail/425591.html">Critical event protection</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5132</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifyMajorProtectionBlackIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMajorProtectionBlackIpRequest self = new ModifyMajorProtectionBlackIpRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMajorProtectionBlackIpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyMajorProtectionBlackIpRequest setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public ModifyMajorProtectionBlackIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyMajorProtectionBlackIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public ModifyMajorProtectionBlackIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyMajorProtectionBlackIpRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public ModifyMajorProtectionBlackIpRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyMajorProtectionBlackIpRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
