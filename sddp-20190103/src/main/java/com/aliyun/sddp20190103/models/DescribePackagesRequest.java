// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribePackagesRequest extends TeaModel {
    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset instance to which the data asset package belongs.</p>
     * <blockquote>
     * <p>To query the list of MaxCompute data asset packages that are authorized for an SDPP connection by instance ID, call the <strong>DescribeInstances</strong> operation to obtain the instance ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12321</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The language of the request and response. The default value is <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The keyword for the search. Fuzzy matching is supported.</p>
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the product to which the data asset package belongs.</p>
     * <blockquote>
     * <p>To query the list of MaxCompute data asset packages that are authorized for an SDPP connection by product ID, call the <strong>DescribeDataAssets</strong> operation to obtain the product ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2566600</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The ID of the risk level for the data asset package.</p>
     * <ul>
     * <li><p><strong>1</strong>: N/A: No sensitive data is detected.</p>
     * </li>
     * <li><p><strong>2</strong>: S1: Level 1 sensitive data.</p>
     * </li>
     * <li><p><strong>3</strong>: S2: Level 2 sensitive data.</p>
     * </li>
     * <li><p><strong>4</strong>: S3: Level 3 sensitive data.</p>
     * </li>
     * <li><p><strong>5</strong>: S4: Level 4 sensitive data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that the data asset package matches.</p>
     * <blockquote>
     * <p>To query the list of MaxCompute data asset packages that are authorized for an SDPP connection by the ID of a matching sensitive data detection rule, call the <strong>DescribeRules</strong> operation to obtain the rule ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>266666</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static DescribePackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackagesRequest self = new DescribePackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackagesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePackagesRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribePackagesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePackagesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackagesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribePackagesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribePackagesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
