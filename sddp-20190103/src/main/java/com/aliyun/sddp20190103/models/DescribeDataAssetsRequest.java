// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsRequest extends TeaModel {
    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the request and response. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese (Simplified)</p>
     * </li>
     * <li><p><strong>en_us</strong>: English (US)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The keyword for a fuzzy search of data assets.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. The default value is <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of data asset to query. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: MaxCompute project</p>
     * </li>
     * <li><p><strong>2</strong>: MaxCompute table</p>
     * </li>
     * <li><p><strong>3</strong>: MaxCompute package</p>
     * </li>
     * <li><p><strong>11</strong>: AnalyticDB for MySQL database</p>
     * </li>
     * <li><p><strong>12</strong>: AnalyticDB for MySQL table</p>
     * </li>
     * <li><p><strong>21</strong>: OSS bucket</p>
     * </li>
     * <li><p><strong>22</strong>: OSS object</p>
     * </li>
     * <li><p><strong>31</strong>: Tablestore instance</p>
     * </li>
     * <li><p><strong>32</strong>: Tablestore table</p>
     * </li>
     * <li><p><strong>51</strong>: RDS database</p>
     * </li>
     * <li><p><strong>52</strong>: RDS table</p>
     * </li>
     * <li><p><strong>61</strong>: Self-managed database on an ECS instance</p>
     * </li>
     * <li><p><strong>62</strong>: Self-managed table on an ECS instance</p>
     * </li>
     * <li><p><strong>71</strong>: DRDS database</p>
     * </li>
     * <li><p><strong>72</strong>: DRDS table</p>
     * </li>
     * <li><p><strong>81</strong>: PolarDB database</p>
     * </li>
     * <li><p><strong>82</strong>: PolarDB table</p>
     * </li>
     * <li><p><strong>91</strong>: GPDB database</p>
     * </li>
     * <li><p><strong>92</strong>: GPDB table</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RangeId")
    public Integer rangeId;

    /**
     * <p>The risk levels of the data assets to query. Separate multiple risk levels with commas (,).</p>
     * <ul>
     * <li><p><strong>2</strong>: S1, low risk level</p>
     * </li>
     * <li><p><strong>3</strong>: S2, medium risk level</p>
     * </li>
     * <li><p><strong>4</strong>: S3, high risk level</p>
     * </li>
     * <li><p><strong>5</strong>: S4, highest risk level</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevels")
    public String riskLevels;

    /**
     * <p>The ID of the sensitive data detection rule that the data asset matches.</p>
     * <blockquote>
     * <p>To find data assets based on the sensitive data detection rules they match, call the <a href="~~DescribeRules~~">DescribeRules</a> operation to get the rule IDs.</p>
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
