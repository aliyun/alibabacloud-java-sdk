// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataAssetsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RangeId")
    public Integer rangeId;

    @NameInMap("RiskLevels")
    public String riskLevels;

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
