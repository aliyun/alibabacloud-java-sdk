// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The code of the file type.</p>
     */
    @NameInMap("FileCategoryCode")
    public Long fileCategoryCode;

    /**
     * <p>The ID of the instance to which the OSS object belongs.</p>
     * <br>
     * <p>> You can call the **DescribeInstances** operation to query the instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The end time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("LastScanTimeEnd")
    public Long lastScanTimeEnd;

    /**
     * <p>The start time of the last scan. The value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("LastScanTimeStart")
    public Long lastScanTimeStart;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sensitivity level of the OSS object. Valid values:</p>
     * <br>
     * <p>*   **1**: N/A, which indicates that no sensitive data is detected.</p>
     * <p>*   **2**: S1, which indicates the low sensitivity level.</p>
     * <p>*   **3**: S2, which indicates the medium sensitivity level.</p>
     * <p>*   **4**: S3, which indicates the high sensitivity level.</p>
     * <p>*   **5**: S4, which indicates the highest sensitivity level.</p>
     */
    @NameInMap("RiskLevelId")
    public Integer riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that the OSS object hits.</p>
     * <br>
     * <p>> You can call the **DescribeRules** operation to query the ID of the sensitive data detection rule.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The region in which the data asset resides.</p>
     */
    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    /**
     * <p>The ID of the industry-specific rule template.</p>
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
