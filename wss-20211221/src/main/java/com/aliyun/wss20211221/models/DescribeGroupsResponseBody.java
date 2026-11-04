// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of groups.</p>
     */
    @NameInMap("Groups")
    public java.util.List<DescribeGroupsResponseBodyGroups> groups;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the <code>nextToken</code> value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68BD3312-53D8-123E-BB32-1A9F25E07A03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsResponseBody self = new DescribeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsResponseBody setGroups(java.util.List<DescribeGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribeGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule extends TeaModel {
        /**
         * <p>The list of contact group names.</p>
         */
        @NameInMap("ContactGroupNames")
        public java.util.List<String> contactGroupNames;

        /**
         * <p>The last trigger time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-23 10:20:30</p>
         */
        @NameInMap("LastTriggeredAt")
        public String lastTriggeredAt;

        /**
         * <p>The percentage of the quota alert threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ThresholdPercent")
        public Integer thresholdPercent;

        public static DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule self = new DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule setContactGroupNames(java.util.List<String> contactGroupNames) {
            this.contactGroupNames = contactGroupNames;
            return this;
        }
        public java.util.List<String> getContactGroupNames() {
            return this.contactGroupNames;
        }

        public DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule setLastTriggeredAt(String lastTriggeredAt) {
            this.lastTriggeredAt = lastTriggeredAt;
            return this;
        }
        public String getLastTriggeredAt() {
            return this.lastTriggeredAt;
        }

        public DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule setThresholdPercent(Integer thresholdPercent) {
            this.thresholdPercent = thresholdPercent;
            return this;
        }
        public Integer getThresholdPercent() {
            return this.thresholdPercent;
        }

    }

    public static class DescribeGroupsResponseBodyGroupsInstances extends TeaModel {
        /**
         * <p>The Alibaba Cloud user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1712418364463000</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The expiration time. The time is in ISO 8601 format and the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-05T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>Specifies whether the instance is on a free trial.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FreeTrial")
        public Boolean freeTrial;

        /**
         * <p>The group resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP_CORE_PACKAGE</p>
         */
        @NameInMap("GroupResourceType")
        public String groupResourceType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chp-0c1g77wmw50b6cXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The purchase period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The end time of the current period. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-01 00:00:00</p>
         */
        @NameInMap("PeriodEndTime")
        public String periodEndTime;

        /**
         * <p>The start time of the current period. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 00:00:00</p>
         */
        @NameInMap("PeriodStartTime")
        public String periodStartTime;

        /**
         * <p>The period unit.</p>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>Specifies whether priority deduction is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PriorityDeduction")
        public Boolean priorityDeduction;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP_CORE_PACKAGE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The start time. The time is in ISO 8601 format and the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-05T02:31Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state.</p>
         * 
         * <strong>example:</strong>
         * <p>DEDUCTING</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The total duration.</p>
         * 
         * <strong>example:</strong>
         * <p>180000000</p>
         */
        @NameInMap("TotalTime")
        public Long totalTime;

        /**
         * <p>The total duration with a precision factor.</p>
         * 
         * <strong>example:</strong>
         * <p>2000.0000</p>
         */
        @NameInMap("TotalTimeDecimal")
        public String totalTimeDecimal;

        /**
         * <p>The usage Threshold Alerting rule.</p>
         */
        @NameInMap("UsageAlertRule")
        public DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule usageAlertRule;

        /**
         * <p>The usage duration.</p>
         * 
         * <strong>example:</strong>
         * <p>26959861</p>
         */
        @NameInMap("UsedTime")
        public Long usedTime;

        /**
         * <p>The usage duration with a precision factor.</p>
         * 
         * <strong>example:</strong>
         * <p>11.0000</p>
         */
        @NameInMap("UsedTimeDecimal")
        public String usedTimeDecimal;

        public static DescribeGroupsResponseBodyGroupsInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroupsInstances self = new DescribeGroupsResponseBodyGroupsInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroupsInstances setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeGroupsResponseBodyGroupsInstances setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGroupsResponseBodyGroupsInstances setFreeTrial(Boolean freeTrial) {
            this.freeTrial = freeTrial;
            return this;
        }
        public Boolean getFreeTrial() {
            return this.freeTrial;
        }

        public DescribeGroupsResponseBodyGroupsInstances setGroupResourceType(String groupResourceType) {
            this.groupResourceType = groupResourceType;
            return this;
        }
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        public DescribeGroupsResponseBodyGroupsInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGroupsResponseBodyGroupsInstances setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeGroupsResponseBodyGroupsInstances setPeriodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }
        public String getPeriodEndTime() {
            return this.periodEndTime;
        }

        public DescribeGroupsResponseBodyGroupsInstances setPeriodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }
        public String getPeriodStartTime() {
            return this.periodStartTime;
        }

        public DescribeGroupsResponseBodyGroupsInstances setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeGroupsResponseBodyGroupsInstances setPriorityDeduction(Boolean priorityDeduction) {
            this.priorityDeduction = priorityDeduction;
            return this;
        }
        public Boolean getPriorityDeduction() {
            return this.priorityDeduction;
        }

        public DescribeGroupsResponseBodyGroupsInstances setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeGroupsResponseBodyGroupsInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeGroupsResponseBodyGroupsInstances setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeGroupsResponseBodyGroupsInstances setTotalTime(Long totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public Long getTotalTime() {
            return this.totalTime;
        }

        public DescribeGroupsResponseBodyGroupsInstances setTotalTimeDecimal(String totalTimeDecimal) {
            this.totalTimeDecimal = totalTimeDecimal;
            return this;
        }
        public String getTotalTimeDecimal() {
            return this.totalTimeDecimal;
        }

        public DescribeGroupsResponseBodyGroupsInstances setUsageAlertRule(DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule usageAlertRule) {
            this.usageAlertRule = usageAlertRule;
            return this;
        }
        public DescribeGroupsResponseBodyGroupsInstancesUsageAlertRule getUsageAlertRule() {
            return this.usageAlertRule;
        }

        public DescribeGroupsResponseBodyGroupsInstances setUsedTime(Long usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Long getUsedTime() {
            return this.usedTime;
        }

        public DescribeGroupsResponseBodyGroupsInstances setUsedTimeDecimal(String usedTimeDecimal) {
            this.usedTimeDecimal = usedTimeDecimal;
            return this;
        }
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

    }

    public static class DescribeGroupsResponseBodyGroups extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group-0c5ambj9yaeqjpXXX</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The list of instance information.</p>
         */
        @NameInMap("Instances")
        public java.util.List<DescribeGroupsResponseBodyGroupsInstances> instances;

        /**
         * <p>The core-hour usage in the last week.</p>
         * 
         * <strong>example:</strong>
         * <p>85949.99</p>
         */
        @NameInMap("LastWeekUsedCoreTime")
        public Float lastWeekUsedCoreTime;

        /**
         * <p>The remaining core-hours.</p>
         * 
         * <strong>example:</strong>
         * <p>92511.15</p>
         */
        @NameInMap("LeftCoreTime")
        public Float leftCoreTime;

        /**
         * <p>The list of resource IDs.</p>
         */
        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        /**
         * <p>The total duration with a precision factor.</p>
         * 
         * <strong>example:</strong>
         * <p>2000.0000</p>
         */
        @NameInMap("TotalTimeDecimal")
        public String totalTimeDecimal;

        /**
         * <p>The used core-hours.</p>
         * 
         * <strong>example:</strong>
         * <p>7488.85</p>
         */
        @NameInMap("UsedCoreTime")
        public Float usedCoreTime;

        /**
         * <p>The usage duration with a precision factor.</p>
         * 
         * <strong>example:</strong>
         * <p>11.0000</p>
         */
        @NameInMap("UsedTimeDecimal")
        public String usedTimeDecimal;

        public static DescribeGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroups self = new DescribeGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeGroupsResponseBodyGroups setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeGroupsResponseBodyGroups setInstances(java.util.List<DescribeGroupsResponseBodyGroupsInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeGroupsResponseBodyGroupsInstances> getInstances() {
            return this.instances;
        }

        public DescribeGroupsResponseBodyGroups setLastWeekUsedCoreTime(Float lastWeekUsedCoreTime) {
            this.lastWeekUsedCoreTime = lastWeekUsedCoreTime;
            return this;
        }
        public Float getLastWeekUsedCoreTime() {
            return this.lastWeekUsedCoreTime;
        }

        public DescribeGroupsResponseBodyGroups setLeftCoreTime(Float leftCoreTime) {
            this.leftCoreTime = leftCoreTime;
            return this;
        }
        public Float getLeftCoreTime() {
            return this.leftCoreTime;
        }

        public DescribeGroupsResponseBodyGroups setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public DescribeGroupsResponseBodyGroups setTotalTimeDecimal(String totalTimeDecimal) {
            this.totalTimeDecimal = totalTimeDecimal;
            return this;
        }
        public String getTotalTimeDecimal() {
            return this.totalTimeDecimal;
        }

        public DescribeGroupsResponseBodyGroups setUsedCoreTime(Float usedCoreTime) {
            this.usedCoreTime = usedCoreTime;
            return this;
        }
        public Float getUsedCoreTime() {
            return this.usedCoreTime;
        }

        public DescribeGroupsResponseBodyGroups setUsedTimeDecimal(String usedTimeDecimal) {
            this.usedTimeDecimal = usedTimeDecimal;
            return this;
        }
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

    }

}
