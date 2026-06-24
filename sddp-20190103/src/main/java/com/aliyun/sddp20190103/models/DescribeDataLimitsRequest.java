// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsRequest extends TeaModel {
    /**
     * <p>The audit status. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Auditing enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: Auditing disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>The connectivity test status. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Ready.</p>
     * </li>
     * <li><p><strong>1</strong>: Running.</p>
     * </li>
     * <li><p><strong>2</strong>: Connectivity test in progress.</p>
     * </li>
     * <li><p><strong>3</strong>: Connectivity test passed.</p>
     * </li>
     * <li><p><strong>4</strong>: Connectivity test failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CheckStatus")
    public Integer checkStatus;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data masking status. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatamaskStatus")
    public Integer datamaskStatus;

    /**
     * <p>The sensitive data detection status. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>0</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1616068534877</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of the database engine. Examples: <strong>MySQL</strong>, <strong>SQLServer</strong>, <strong>Oracle</strong>, <strong>PostgreSQL</strong>, and <strong>MongoDB</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FeatureType")
    public Integer featureType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>**********8103</p>
     */
    @NameInMap("MemberAccount")
    public Long memberAccount;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the parent asset to which the data asset belongs. Valid values:</p>
     * <ul>
     * <li><p>The name or ID of a MaxCompute project.</p>
     * </li>
     * <li><p>The name or ID of an OSS bucket.</p>
     * </li>
     * <li><p>The name or ID of an RDS instance or database.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1112</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>The type of service to which the data asset belongs. Data assets can be instances, databases, or buckets. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute</p>
     * </li>
     * <li><p><strong>2</strong>: OSS</p>
     * </li>
     * <li><p><strong>3</strong>: AnalyticDB for MySQL</p>
     * </li>
     * <li><p><strong>4</strong>: Tablestore</p>
     * </li>
     * <li><p><strong>5</strong>: RDS</p>
     * </li>
     * <li><p><strong>6</strong>: A self-managed database</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceType")
    public Integer resourceType;

    /**
     * <p>The ID of the region where the data asset is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1616068534877</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDataLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitsRequest self = new DescribeDataLimitsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitsRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public DescribeDataLimitsRequest setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public DescribeDataLimitsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataLimitsRequest setDatamaskStatus(Integer datamaskStatus) {
        this.datamaskStatus = datamaskStatus;
        return this;
    }
    public Integer getDatamaskStatus() {
        return this.datamaskStatus;
    }

    public DescribeDataLimitsRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

    public DescribeDataLimitsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDataLimitsRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeDataLimitsRequest setFeatureType(Integer featureType) {
        this.featureType = featureType;
        return this;
    }
    public Integer getFeatureType() {
        return this.featureType;
    }

    public DescribeDataLimitsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataLimitsRequest setMemberAccount(Long memberAccount) {
        this.memberAccount = memberAccount;
        return this;
    }
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    public DescribeDataLimitsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataLimitsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DescribeDataLimitsRequest setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public DescribeDataLimitsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeDataLimitsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
