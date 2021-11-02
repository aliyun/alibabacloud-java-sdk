// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllRegionsStatisticsRequest extends TeaModel {
    @NameInMap("Action1")
    public Integer action1;

    @NameInMap("AllRegion")
    public Boolean allRegion;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Flow")
    public Integer flow;

    @NameInMap("From")
    public String from;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("SecureToken")
    public String secureToken;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("StatusList")
    public String statusList;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("WebGroupId")
    public Long webGroupId;

    public static DescribeAllRegionsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllRegionsStatisticsRequest self = new DescribeAllRegionsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllRegionsStatisticsRequest setAction1(Integer action1) {
        this.action1 = action1;
        return this;
    }
    public Integer getAction1() {
        return this.action1;
    }

    public DescribeAllRegionsStatisticsRequest setAllRegion(Boolean allRegion) {
        this.allRegion = allRegion;
        return this;
    }
    public Boolean getAllRegion() {
        return this.allRegion;
    }

    public DescribeAllRegionsStatisticsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAllRegionsStatisticsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeAllRegionsStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAllRegionsStatisticsRequest setFlow(Integer flow) {
        this.flow = flow;
        return this;
    }
    public Integer getFlow() {
        return this.flow;
    }

    public DescribeAllRegionsStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeAllRegionsStatisticsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeAllRegionsStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAllRegionsStatisticsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeAllRegionsStatisticsRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public DescribeAllRegionsStatisticsRequest setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public DescribeAllRegionsStatisticsRequest setSecureToken(String secureToken) {
        this.secureToken = secureToken;
        return this;
    }
    public String getSecureToken() {
        return this.secureToken;
    }

    public DescribeAllRegionsStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAllRegionsStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeAllRegionsStatisticsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeAllRegionsStatisticsRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeAllRegionsStatisticsRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeAllRegionsStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeAllRegionsStatisticsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeAllRegionsStatisticsRequest setWebGroupId(Long webGroupId) {
        this.webGroupId = webGroupId;
        return this;
    }
    public Long getWebGroupId() {
        return this.webGroupId;
    }

}
