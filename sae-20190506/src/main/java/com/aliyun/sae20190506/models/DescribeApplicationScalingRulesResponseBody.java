// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeApplicationScalingRulesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeApplicationScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationScalingRulesResponseBody self = new DescribeApplicationScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationScalingRulesResponseBody setData(DescribeApplicationScalingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationScalingRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationScalingRulesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules extends TeaModel {
        @NameInMap("AtTime")
        public String atTime;

        @NameInMap("MaxReplicas")
        public Long maxReplicas;

        @NameInMap("MinReplicas")
        public Long minReplicas;

        @NameInMap("TargetReplicas")
        public Integer targetReplicas;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setAtTime(String atTime) {
            this.atTime = atTime;
            return this;
        }
        public String getAtTime() {
            return this.atTime;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setMaxReplicas(Long maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setMinReplicas(Long minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Long getMinReplicas() {
            return this.minReplicas;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules setTargetReplicas(Integer targetReplicas) {
            this.targetReplicas = targetReplicas;
            return this;
        }
        public Integer getTargetReplicas() {
            return this.targetReplicas;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer extends TeaModel {
        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Period")
        public String period;

        @NameInMap("Schedules")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules> schedules;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer setSchedules(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules> schedules) {
            this.schedules = schedules;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimerSchedules> getSchedules() {
            return this.schedules;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ScaleRuleEnabled")
        public Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        public String scaleRuleName;

        @NameInMap("ScaleRuleType")
        public String scaleRuleType;

        @NameInMap("Timer")
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer timer;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules self = new DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setScaleRuleEnabled(Boolean scaleRuleEnabled) {
            this.scaleRuleEnabled = scaleRuleEnabled;
            return this;
        }
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setScaleRuleName(String scaleRuleName) {
            this.scaleRuleName = scaleRuleName;
            return this;
        }
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setScaleRuleType(String scaleRuleType) {
            this.scaleRuleType = scaleRuleType;
            return this;
        }
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setTimer(DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer timer) {
            this.timer = timer;
            return this;
        }
        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRulesTimer getTimer() {
            return this.timer;
        }

        public DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeApplicationScalingRulesResponseBodyData extends TeaModel {
        @NameInMap("ApplicationScalingRules")
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> applicationScalingRules;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static DescribeApplicationScalingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationScalingRulesResponseBodyData self = new DescribeApplicationScalingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationScalingRulesResponseBodyData setApplicationScalingRules(java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> applicationScalingRules) {
            this.applicationScalingRules = applicationScalingRules;
            return this;
        }
        public java.util.List<DescribeApplicationScalingRulesResponseBodyDataApplicationScalingRules> getApplicationScalingRules() {
            return this.applicationScalingRules;
        }

        public DescribeApplicationScalingRulesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeApplicationScalingRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeApplicationScalingRulesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
