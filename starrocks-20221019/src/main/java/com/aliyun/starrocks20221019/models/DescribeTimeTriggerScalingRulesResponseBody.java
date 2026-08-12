// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeTimeTriggerScalingRulesResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeTimeTriggerScalingRulesResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeTimeTriggerScalingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTimeTriggerScalingRulesResponseBody self = new DescribeTimeTriggerScalingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTimeTriggerScalingRulesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeTimeTriggerScalingRulesResponseBody setData(java.util.List<DescribeTimeTriggerScalingRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeTimeTriggerScalingRulesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeTimeTriggerScalingRulesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeTimeTriggerScalingRulesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeTimeTriggerScalingRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTimeTriggerScalingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTimeTriggerScalingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule extends TeaModel {
        /**
         * <p>The day of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <p>The hour of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>The minute of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <p>The month of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>The trigger interval. Its meaning depends on the RecurrenceType value:</p>
         * <ul>
         * <li><p>DAILY: The interval in days.</p>
         * </li>
         * <li><p>WEEKLY: The interval in weeks.</p>
         * </li>
         * <li><p>MONTHLY: The interval in months.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("RecurrenceInterval")
        public Integer recurrenceInterval;

        /**
         * <p>The trigger method. Valid values:</p>
         * <ul>
         * <li><p>ONCE: One-time</p>
         * </li>
         * <li><p>DAILY: Daily</p>
         * </li>
         * <li><p>WEEKLY: Weekly</p>
         * </li>
         * <li><p>MONTHLY: Monthly</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The trigger values. Their meaning depends on the RecurrenceType value:</p>
         * <p>-WEEKLY: The days of the week for execution.</p>
         * <p>-MONTHLY: The days of the month for execution.</p>
         */
        @NameInMap("RecurrenceValues")
        public java.util.List<String> recurrenceValues;

        /**
         * <p>The second of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Second")
        public Integer second;

        /**
         * <p>The year of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule self = new DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule();
            return TeaModel.build(map, self);
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setRecurrenceInterval(Integer recurrenceInterval) {
            this.recurrenceInterval = recurrenceInterval;
            return this;
        }
        public Integer getRecurrenceInterval() {
            return this.recurrenceInterval;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setRecurrenceValues(java.util.List<String> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public java.util.List<String> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule extends TeaModel {
        /**
         * <p>The day of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Day")
        public Integer day;

        /**
         * <p>The hour of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Hour")
        public Integer hour;

        /**
         * <p>The minute of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Minute")
        public Integer minute;

        /**
         * <p>The month of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Month")
        public Integer month;

        /**
         * <p>The trigger interval. Its meaning depends on the RecurrenceType value:</p>
         * <ul>
         * <li><p>DAILY: The interval in days.</p>
         * </li>
         * <li><p>WEEKLY: The interval in weeks.</p>
         * </li>
         * <li><p>MONTHLY: The interval in months.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecurrenceInterval")
        public Integer recurrenceInterval;

        /**
         * <p>The trigger method. Valid values:</p>
         * <ul>
         * <li><p>ONCE: One-time</p>
         * </li>
         * <li><p>DAILY: Daily</p>
         * </li>
         * <li><p>WEEKLY: Weekly</p>
         * </li>
         * <li><p>MONTHLY: Monthly</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONCE</p>
         */
        @NameInMap("RecurrenceType")
        public String recurrenceType;

        /**
         * <p>The trigger values. Their meaning depends on the RecurrenceType value:</p>
         * <p>-WEEKLY: The days of the week for execution.</p>
         * <p>-MONTHLY: The days of the month for execution.</p>
         */
        @NameInMap("RecurrenceValues")
        public java.util.List<String> recurrenceValues;

        /**
         * <p>The second of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Second")
        public Integer second;

        /**
         * <p>The year of the execution time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024</p>
         */
        @NameInMap("Year")
        public Integer year;

        public static DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule self = new DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule();
            return TeaModel.build(map, self);
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setDay(Integer day) {
            this.day = day;
            return this;
        }
        public Integer getDay() {
            return this.day;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setHour(Integer hour) {
            this.hour = hour;
            return this;
        }
        public Integer getHour() {
            return this.hour;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setMinute(Integer minute) {
            this.minute = minute;
            return this;
        }
        public Integer getMinute() {
            return this.minute;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setRecurrenceInterval(Integer recurrenceInterval) {
            this.recurrenceInterval = recurrenceInterval;
            return this;
        }
        public Integer getRecurrenceInterval() {
            return this.recurrenceInterval;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setRecurrenceType(String recurrenceType) {
            this.recurrenceType = recurrenceType;
            return this;
        }
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setRecurrenceValues(java.util.List<String> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }
        public java.util.List<String> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setSecond(Integer second) {
            this.second = second;
            return this;
        }
        public Integer getSecond() {
            return this.second;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

    }

    public static class DescribeTimeTriggerScalingRulesResponseBodyData extends TeaModel {
        /**
         * <p>The number of elastic nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NodeNumber")
        public String nodeNumber;

        /**
         * <p>The scale-in rule.</p>
         */
        @NameInMap("ScalingInRule")
        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule scalingInRule;

        /**
         * <p>The scale-out rule.</p>
         */
        @NameInMap("ScalingOutRule")
        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule scalingOutRule;

        /**
         * <p>The ID of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>r-d1775b776110****</p>
         */
        @NameInMap("ScalingRuleId")
        public String scalingRuleId;

        /**
         * <p>The name of the Auto Scaling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-test1</p>
         */
        @NameInMap("ScalingRuleName")
        public String scalingRuleName;

        /**
         * <p>The current status of the rule. Valid values:</p>
         * <ul>
         * <li><p>INACTIVE: The rule is not triggered.</p>
         * </li>
         * <li><p>ACTIVE: The rule is triggered.</p>
         * </li>
         * <li><p>DISABLED: The rule is disabled due to an overdue payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeTimeTriggerScalingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTimeTriggerScalingRulesResponseBodyData self = new DescribeTimeTriggerScalingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeTimeTriggerScalingRulesResponseBodyData setNodeNumber(String nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public String getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyData setScalingInRule(DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule scalingInRule) {
            this.scalingInRule = scalingInRule;
            return this;
        }
        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingInRule getScalingInRule() {
            return this.scalingInRule;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyData setScalingOutRule(DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule scalingOutRule) {
            this.scalingOutRule = scalingOutRule;
            return this;
        }
        public DescribeTimeTriggerScalingRulesResponseBodyDataScalingOutRule getScalingOutRule() {
            return this.scalingOutRule;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyData setScalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyData setScalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        public DescribeTimeTriggerScalingRulesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
