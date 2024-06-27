// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribePackagesRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the instance to which the package belongs.</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeInstances</strong> operation to query the ID of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12321</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the service to which the package belongs.</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeDataAssets</strong> operation to query the ID of the service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2566600</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The sensitivity level of the package. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
     * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
     * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
     * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
     * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    /**
     * <p>The ID of the sensitive data detection rule that the package hits.</p>
     * <blockquote>
     * <p>You can call the <strong>DescribeRules</strong> operation to query the ID of the sensitive data detection rule.</p>
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
