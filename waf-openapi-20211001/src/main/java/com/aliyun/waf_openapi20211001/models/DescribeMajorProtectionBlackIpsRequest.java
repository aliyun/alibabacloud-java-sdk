// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeMajorProtectionBlackIpsRequest extends TeaModel {
    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_cdnsdf3****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address to query. You can set this parameter to perform a fuzzy query on the added IP address blacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("IpLike")
    public String ipLike;

    /**
     * <p>The property by which to sort the results in <strong>descending order</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>gmtModified</strong>: sorts by modification time.</p>
     * </li>
     * <li><p><strong>ip</strong>: sorts by IP address.</p>
     * </li>
     * <li><p><strong>templateId</strong>: sorts by template ID.</p>
     * </li>
     * <li><p><strong>id</strong>: sorts by primary key.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gmtModified</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Default value: <strong>1</strong>, which indicates the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>, which indicates 10 entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the WAF instance is deployed. Valid values:</p>
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
     * 
     * <strong>example:</strong>
     * <p>20013199</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The ID of the critical event protection template.</p>
     * 
     * <strong>example:</strong>
     * <p>5673</p>
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
