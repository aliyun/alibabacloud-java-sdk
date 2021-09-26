// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeTablesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RiskLevelId")
    public Long riskLevelId;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SensLevelName")
    public String sensLevelName;

    @NameInMap("PackageId")
    public Long packageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("LastScanTimeStart")
    public Long lastScanTimeStart;

    @NameInMap("LastScanTimeEnd")
    public Long lastScanTimeEnd;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceDescription")
    public String instanceDescription;

    public static DescribeTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesRequest self = new DescribeTablesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTablesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTablesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeTablesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeTablesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeTablesRequest setRiskLevelId(Long riskLevelId) {
        this.riskLevelId = riskLevelId;
        return this;
    }
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    public DescribeTablesRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public DescribeTablesRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeTablesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeTablesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeTablesRequest setSensLevelName(String sensLevelName) {
        this.sensLevelName = sensLevelName;
        return this;
    }
    public String getSensLevelName() {
        return this.sensLevelName;
    }

    public DescribeTablesRequest setPackageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }
    public Long getPackageId() {
        return this.packageId;
    }

    public DescribeTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTablesRequest setLastScanTimeStart(Long lastScanTimeStart) {
        this.lastScanTimeStart = lastScanTimeStart;
        return this;
    }
    public Long getLastScanTimeStart() {
        return this.lastScanTimeStart;
    }

    public DescribeTablesRequest setLastScanTimeEnd(Long lastScanTimeEnd) {
        this.lastScanTimeEnd = lastScanTimeEnd;
        return this;
    }
    public Long getLastScanTimeEnd() {
        return this.lastScanTimeEnd;
    }

    public DescribeTablesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeTablesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeTablesRequest setInstanceDescription(String instanceDescription) {
        this.instanceDescription = instanceDescription;
        return this;
    }
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

}
