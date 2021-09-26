// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeOssObjectsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("RiskLevelId")
    public Integer riskLevelId;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ServiceRegionId")
    public String serviceRegionId;

    @NameInMap("LastScanTimeStart")
    public Long lastScanTimeStart;

    @NameInMap("LastScanTimeEnd")
    public Long lastScanTimeEnd;

    public static DescribeOssObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssObjectsRequest self = new DescribeOssObjectsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssObjectsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssObjectsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public DescribeOssObjectsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeOssObjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOssObjectsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOssObjectsRequest setServiceRegionId(String serviceRegionId) {
        this.serviceRegionId = serviceRegionId;
        return this;
    }
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public DescribeOssObjectsRequest setLastScanTimeStart(Long lastScanTimeStart) {
        this.lastScanTimeStart = lastScanTimeStart;
        return this;
    }
    public Long getLastScanTimeStart() {
        return this.lastScanTimeStart;
    }

    public DescribeOssObjectsRequest setLastScanTimeEnd(Long lastScanTimeEnd) {
        this.lastScanTimeEnd = lastScanTimeEnd;
        return this;
    }
    public Long getLastScanTimeEnd() {
        return this.lastScanTimeEnd;
    }

}
