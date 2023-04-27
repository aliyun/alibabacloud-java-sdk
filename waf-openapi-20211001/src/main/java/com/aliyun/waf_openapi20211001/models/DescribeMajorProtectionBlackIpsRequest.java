// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMajorProtectionBlackIpsRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address that you want to query. You can specify this parameter to query an IP address in the IP address blacklist for major event protection by using fuzzy matching.</p>
     */
    @NameInMap("IpLike")
    public String ipLike;

    /**
     * <p>The method that you want to use to sort the IP addresses **in descending order**. Valid values:</p>
     * <br>
     * <p>*   **gmtModified:** sorts the IP addresses by most recent modification time.</p>
     * <p>*   **ip:** sorts the IP addresses by IP address.</p>
     * <p>*   **templateId:** sorts the IP addresses by template ID.</p>
     * <p>*   **id:** sorts the IP addresses by primary key.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>The ID of the rule template for major event protection.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeMajorProtectionBlackIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMajorProtectionBlackIpsRequest self = new DescribeMajorProtectionBlackIpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMajorProtectionBlackIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMajorProtectionBlackIpsRequest setIpLike(String ipLike) {
        this.ipLike = ipLike;
        return this;
    }
    public String getIpLike() {
        return this.ipLike;
    }

    public DescribeMajorProtectionBlackIpsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeMajorProtectionBlackIpsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMajorProtectionBlackIpsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMajorProtectionBlackIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMajorProtectionBlackIpsRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public DescribeMajorProtectionBlackIpsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeMajorProtectionBlackIpsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
