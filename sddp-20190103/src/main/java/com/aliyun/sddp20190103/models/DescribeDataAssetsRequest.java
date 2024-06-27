// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Simplified Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The keyword that is used to search for data assets. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the data asset that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: MaxCompute project</li>
     * <li><strong>2</strong>: MaxCompute table</li>
     * <li><strong>3</strong>: MaxCompute package</li>
     * <li><strong>11</strong>: AnalyticDB for MySQL database</li>
     * <li><strong>12</strong>: AnalyticDB for MySQL table</li>
     * <li><strong>21</strong>: Object Storage Service (OSS) bucket</li>
     * <li><strong>22</strong>: OSS object</li>
     * <li><strong>31</strong>: Tablestore instance</li>
     * <li><strong>32</strong>: Tablestore table</li>
     * <li><strong>51</strong>: ApsaraDB RDS database</li>
     * <li><strong>52</strong>: ApsaraDB RDS table</li>
     * <li><strong>61</strong>: self-managed database hosted on an Elastic Compute Service (ECS) instance</li>
     * <li><strong>62</strong>: self-managed table hosted on an ECS instance</li>
     * <li><strong>71</strong>: PolarDB-X database</li>
     * <li><strong>72</strong>: PolarDB-X table</li>
     * <li><strong>81</strong>: PolarDB database</li>
     * <li><strong>82</strong>: PolarDB table</li>
     * <li><strong>91</strong>: AnalyticDB for PostgreSQL database</li>
     * <li><strong>92</strong>: AnalyticDB for PostgreSQL table</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RangeId")
    public Integer rangeId;

    /**
     * <p>The sensitivity level of the data asset. Separate multiple sensitivity levels with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: S1, indicating the low sensitivity level</li>
     * <li><strong>3</strong>: S2, indicating the medium sensitivity level</li>
     * <li><strong>4</strong>: S3, indicating the high sensitivity level</li>
     * <li><strong>5</strong>: S4, indicating the highest sensitivity level</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevels")
    public String riskLevels;

    /**
     * <p>The unique ID of the sensitive data detection rule that the data assets to be queried hit.</p>
     * <blockquote>
     * <p>If you query sensitive data detection results based on the sensitive data detection rule that the data assets hit, you can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to query the ID of the sensitive data detection rule.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11122200</p>
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
