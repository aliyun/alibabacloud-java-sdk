// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The code of the file category.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FileCategoryCode")
    public Long fileCategoryCode;

    /**
     * <p>The ID of the asset instance to which the OSS object belongs.</p>
     * <blockquote>
     * <p>To query the list of authorized OSS objects by the ID of the asset instance, call the <strong>DescribeInstances</strong> operation to obtain the instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ins-2222</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>The end time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1536751124000</p>
     */
    @NameInMap("LastScanTimeEnd")
    public Long lastScanTimeEnd;

    /**
     * <p>The start time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1536751124000</p>
     */
    @NameInMap("LastScanTimeStart")
    public Long lastScanTimeStart;

    /**
     * <p>The position where the query starts. To retrieve the next page of results, set this parameter to the value of <code>NextMarker</code> from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>1754786235714378752</p>
     */
    @NameInMap("Marker")
    public Long marker;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The risk level ID of the OSS object. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: N/A. No sensitive data is detected.</p>
     * </li>
     * <li><p><strong>2</strong>: S1. Level 1 sensitive data.</p>
     * </li>
     * <li><p><strong>3</strong>: S2. Level 2 sensitive data.</p>
     * </li>
     * <li><p><strong>4</strong>: S3. Level 3 sensitive data.</p>
     * </li>
     * <li><p><strong>5</strong>: S4. Level 4 sensitive data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Integer riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that the OSS object matches.</p>
     * <blockquote>
     * <p>To query the list of authorized OSS objects by the ID of a matched sensitive data detection rule, call the <strong>DescribeRules</strong> operation to obtain the rule ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1222</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The region of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The ID of the industry-specific template.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DescribeOssObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectsRequest self = new DescribeOssObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOssObjectsRequest setFileCategoryCode(Long fileCategoryCode) {
        this.fileCategoryCode = fileCategoryCode;
        return this;
    }
    public Long getFileCategoryCode() {
        return this.fileCategoryCode;
    }

    public DescribeOssObjectsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOssObjectsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssObjectsRequest setLastScanTimeEnd(Long lastScanTimeEnd) {
        this.lastScanTimeEnd = lastScanTimeEnd;
        return this;
    }
    public Long getLastScanTimeEnd() {
        return this.lastScanTimeEnd;
    }

    public DescribeOssObjectsRequest setLastScanTimeStart(Long lastScanTimeStart) {
        this.lastScanTimeStart = lastScanTimeStart;
        return this;
    }
    public Long getLastScanTimeStart() {
        return this.lastScanTimeStart;
    }

    public DescribeOssObjectsRequest setMarker(Long marker) {
        this.marker = marker;
        return this;
    }
    public Long getMarker() {
        return this.marker;
    }

    public DescribeOssObjectsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeOssObjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOssObjectsRequest setRiskLevelId(Integer riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Integer getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeOssObjectsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeOssObjectsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeOssObjectsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
