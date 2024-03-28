// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMajorProtectionBlackIpRequest extends TeaModel {
    /**
     * <p>The description of the IP address blacklist.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time after which the IP address blacklist becomes invalid. Unit: seconds.</p>
     * <br>
     * <p>>  If you set the value to **0**, the blacklist is permanently valid.</p>
     */
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP addresses that you want to add to the IP address blacklist. CIDR blocks and IP addresses are supported. IPv4 and IPv6 addresses are supported. Separate the CIDR blocks or IP addresses with commas (,). For more information, see [Protection for major events](~~425591~~).</p>
     */
    @NameInMap("IpList")
    public String ipList;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The ID of the IP address blacklist rule for major event protection.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The ID of the IP address blacklist rule template for major event protection.</p>
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
