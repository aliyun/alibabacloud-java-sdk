// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskCheckSummary")
    public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary riskCheckSummary;

    public static DescribeRiskCheckSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckSummaryResponseBody self = new DescribeRiskCheckSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskCheckSummaryResponseBody setRiskCheckSummary(DescribeRiskCheckSummaryResponseBodyRiskCheckSummary riskCheckSummary) {
        this.riskCheckSummary = riskCheckSummary;
        return this;
    }
    public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary getRiskCheckSummary() {
        return this.riskCheckSummary;
    }

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Count")
        public Integer count;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Count")
        public Integer count;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups extends TeaModel {
        @NameInMap("RemainingTime")
        public Integer remainingTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Sort")
        public Integer sort;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        @NameInMap("CountByStatus")
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus> countByStatus;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setCountByStatus(java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus> countByStatus) {
            this.countByStatus = countByStatus;
            return this;
        }
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus> getCountByStatus() {
            return this.countByStatus;
        }

    }

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummary extends TeaModel {
        @NameInMap("ItemCount")
        public Integer itemCount;

        @NameInMap("AffectedAssetCount")
        public Integer affectedAssetCount;

        @NameInMap("DisabledRiskCount")
        public Integer disabledRiskCount;

        @NameInMap("RiskCount")
        public Integer riskCount;

        @NameInMap("RiskRate")
        public Float riskRate;

        @NameInMap("PreviousCount")
        public Integer previousCount;

        @NameInMap("PreviousTime")
        public Long previousTime;

        @NameInMap("EnabledRiskCount")
        public Integer enabledRiskCount;

        @NameInMap("RiskLevelCount")
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount> riskLevelCount;

        @NameInMap("Groups")
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups> groups;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummary self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummary();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setItemCount(Integer itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Integer getItemCount() {
            return this.itemCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setAffectedAssetCount(Integer affectedAssetCount) {
            this.affectedAssetCount = affectedAssetCount;
            return this;
        }
        public Integer getAffectedAssetCount() {
            return this.affectedAssetCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setDisabledRiskCount(Integer disabledRiskCount) {
            this.disabledRiskCount = disabledRiskCount;
            return this;
        }
        public Integer getDisabledRiskCount() {
            return this.disabledRiskCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setRiskRate(Float riskRate) {
            this.riskRate = riskRate;
            return this;
        }
        public Float getRiskRate() {
            return this.riskRate;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setPreviousCount(Integer previousCount) {
            this.previousCount = previousCount;
            return this;
        }
        public Integer getPreviousCount() {
            return this.previousCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setPreviousTime(Long previousTime) {
            this.previousTime = previousTime;
            return this;
        }
        public Long getPreviousTime() {
            return this.previousTime;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setEnabledRiskCount(Integer enabledRiskCount) {
            this.enabledRiskCount = enabledRiskCount;
            return this;
        }
        public Integer getEnabledRiskCount() {
            return this.enabledRiskCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setRiskLevelCount(java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount> riskLevelCount) {
            this.riskLevelCount = riskLevelCount;
            return this;
        }
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount> getRiskLevelCount() {
            return this.riskLevelCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setGroups(java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups> getGroups() {
            return this.groups;
        }

    }

}
