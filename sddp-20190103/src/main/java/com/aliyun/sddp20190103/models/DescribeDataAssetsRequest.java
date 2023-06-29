// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Simplified Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The keyword that is used to search for data assets. Fuzzy search is supported.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the data asset that you want to query. Valid values:</p>
     * <br>
     * <p>*   **1**: MaxCompute project</p>
     * <p>*   **2**: MaxCompute table</p>
     * <p>*   **3**: MaxCompute package</p>
     * <p>*   **11**: AnalyticDB for MySQL database</p>
     * <p>*   **12**: AnalyticDB for MySQL table</p>
     * <p>*   **21**: Object Storage Service (OSS) bucket</p>
     * <p>*   **22**: OSS object</p>
     * <p>*   **31**: Tablestore instance</p>
     * <p>*   **32**: Tablestore table</p>
     * <p>*   **51**: ApsaraDB RDS database</p>
     * <p>*   **52**: ApsaraDB RDS table</p>
     * <p>*   **61**: self-managed database hosted on an Elastic Compute Service (ECS) instance</p>
     * <p>*   **62**: self-managed table hosted on an ECS instance</p>
     * <p>*   **71**: PolarDB-X database</p>
     * <p>*   **72**: PolarDB-X table</p>
     * <p>*   **81**: PolarDB database</p>
     * <p>*   **82**: PolarDB table</p>
     * <p>*   **91**: AnalyticDB for PostgreSQL database</p>
     * <p>*   **92**: AnalyticDB for PostgreSQL table</p>
     */
    @NameInMap("RangeId")
    public Integer rangeId;

    /**
     * <p>The sensitivity level of the data asset. Separate multiple sensitivity levels with commas (,). Valid values:</p>
     * <br>
     * <p>*   **2**: S1, indicating the low sensitivity level</p>
     * <p>*   **3**: S2, indicating the medium sensitivity level</p>
     * <p>*   **4**: S3, indicating the high sensitivity level</p>
     * <p>*   **5**: S4, indicating the highest sensitivity level</p>
     */
    @NameInMap("RiskLevels")
    public String riskLevels;

    /**
     * <p>The unique ID of the sensitive data detection rule that the data assets to be queried hit.</p>
     * <br>
     * <p>> If you query sensitive data detection results based on the sensitive data detection rule that the data assets hit, you can call the [DescribeRules](~~DescribeRules~~) operation to query the ID of the sensitive data detection rule.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DescribeDataAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataAssetsRequest self = new DescribeDataAssetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataAssetsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataAssetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDataAssetsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeDataAssetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataAssetsRequest setRangeId(Integer rangeId) {
        this.rangeId = rangeId;
        return this;
    }
    public Integer getRangeId() {
        return this.rangeId;
    }

    public DescribeDataAssetsRequest setRiskLevels(String riskLevels) {
        this.riskLevels = riskLevels;
        return this;
    }
    public String getRiskLevels() {
        return this.riskLevels;
    }

    public DescribeDataAssetsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
