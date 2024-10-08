// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckSummaryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>291B49F9-1685-4005-9D34-606B6F78740F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The summary information about the check results of cloud service configurations.</p>
     */
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

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus extends TeaModel {
        /**
         * <p>The number of detected risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The status of the check item after the check is finished. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The check item passed the check, which indicates that the check item is normal.</li>
         * <li><strong>failed</strong>: The check item failed the check, which indicates that risks are detected based on the check item.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups extends TeaModel {
        /**
         * <p>An array that consists of the statistics about check results.</p>
         */
        @NameInMap("CountByStatus")
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus> countByStatus;

        /**
         * <p>The ID of the check item type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The remaining time before the check is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingTime")
        public Integer remainingTime;

        /**
         * <p>The sequence number of the check item type in the <strong>All Types</strong> drop-down list in the Security Center console.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sort")
        public Integer sort;

        /**
         * <p>The status of the check. Valid values:</p>
         * <ul>
         * <li><strong>finish</strong>: The check is finished.</li>
         * <li><strong>running</strong>: The check is in progress.</li>
         * <li><strong>waiting</strong>: The check is pending.</li>
         * <li><strong>notStart</strong>: The check is not started.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the check item type.</p>
         * 
         * <strong>example:</strong>
         * <p>Identity authentication and permissions</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setCountByStatus(java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus> countByStatus) {
            this.countByStatus = countByStatus;
            return this;
        }
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroupsCountByStatus> getCountByStatus() {
            return this.countByStatus;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount extends TeaModel {
        /**
         * <p>The number of check items at the specified risk level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The risk level of the check items. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Key")
        public String key;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class DescribeRiskCheckSummaryResponseBodyRiskCheckSummary extends TeaModel {
        /**
         * <p>The number of affected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AffectedAssetCount")
        public Integer affectedAssetCount;

        /**
         * <p>The number of the check items that failed the check.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DisabledRiskCount")
        public Integer disabledRiskCount;

        /**
         * <p>The number of the check items that passed the check.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EnabledRiskCount")
        public Integer enabledRiskCount;

        /**
         * <p>An array that consists of the statistics for each type of check item.</p>
         */
        @NameInMap("Groups")
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups> groups;

        /**
         * <p>The number of check items.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ItemCount")
        public Integer itemCount;

        /**
         * <p>The number of risk items detected in the last check.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviousCount")
        public Integer previousCount;

        /**
         * <p>The timestamp of the last check. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1545012926000</p>
         */
        @NameInMap("PreviousTime")
        public Long previousTime;

        /**
         * <p>The number of detected risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskCount")
        public Integer riskCount;

        /**
         * <p>An array that consists of the number of check items at each risk level.</p>
         */
        @NameInMap("RiskLevelCount")
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount> riskLevelCount;

        /**
         * <p>The proportion of risk items to all check items.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("RiskRate")
        public Float riskRate;

        public static DescribeRiskCheckSummaryResponseBodyRiskCheckSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckSummaryResponseBodyRiskCheckSummary self = new DescribeRiskCheckSummaryResponseBodyRiskCheckSummary();
            return TeaModel.build(map, self);
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

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setEnabledRiskCount(Integer enabledRiskCount) {
            this.enabledRiskCount = enabledRiskCount;
            return this;
        }
        public Integer getEnabledRiskCount() {
            return this.enabledRiskCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setGroups(java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryGroups> getGroups() {
            return this.groups;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setItemCount(Integer itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Integer getItemCount() {
            return this.itemCount;
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

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setRiskLevelCount(java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount> riskLevelCount) {
            this.riskLevelCount = riskLevelCount;
            return this;
        }
        public java.util.List<DescribeRiskCheckSummaryResponseBodyRiskCheckSummaryRiskLevelCount> getRiskLevelCount() {
            return this.riskLevelCount;
        }

        public DescribeRiskCheckSummaryResponseBodyRiskCheckSummary setRiskRate(Float riskRate) {
            this.riskRate = riskRate;
            return this;
        }
        public Float getRiskRate() {
            return this.riskRate;
        }

    }

}
