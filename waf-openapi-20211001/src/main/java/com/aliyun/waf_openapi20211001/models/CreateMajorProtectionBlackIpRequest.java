// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMajorProtectionBlackIpRequest extends TeaModel {
    /**
     * <p>The description of the IP address blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>Protection for major events</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timestamp after which the IP address blacklist becomes invalid. Unit: seconds.</p>
     * <blockquote>
     * <p>If you set this parameter to <strong>0</strong>, the IP address blacklist is permanently valid.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1716528465</p>
     */
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    /**
     * <p>The ID of the WAF instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v3prepaid_public_cn-2r42s6y****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address blacklist to add. You can specify custom IP addresses or CIDR blocks. Both IPv4 and IPv6 addresses are supported. Separate multiple IP addresses with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/425591.html">Critical event protection</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX,192.0.XX.XX/24</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: regions outside the Chinese mainland.</p>
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
     * <p>The ID of the IP address blacklist rule for critical event protection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>232324</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The ID of the protection template for critical event protection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2221</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateMajorProtectionBlackIpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorProtectionBlackIpRequest self = new CreateMajorProtectionBlackIpRequest();
        return TeaModel.build(map, self);
    }

    public CreateMajorProtectionBlackIpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMajorProtectionBlackIpRequest setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public CreateMajorProtectionBlackIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMajorProtectionBlackIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public CreateMajorProtectionBlackIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMajorProtectionBlackIpRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateMajorProtectionBlackIpRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public CreateMajorProtectionBlackIpRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
