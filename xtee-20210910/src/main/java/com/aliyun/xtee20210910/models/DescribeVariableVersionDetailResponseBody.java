// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableVersionDetailResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public DescribeVariableVersionDetailResponseBodyResultObject resultObject;

    public static DescribeVariableVersionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableVersionDetailResponseBody self = new DescribeVariableVersionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVariableVersionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVariableVersionDetailResponseBody setResultObject(DescribeVariableVersionDetailResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVariableVersionDetailResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVariableVersionDetailResponseBodyResultObject extends TeaModel {
        /**
         * <p>Condition value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;currentId&quot;:1,&quot;deepCount&quot;:0,&quot;list&quot;:[{&quot;currentId&quot;:2,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;accountId&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:false,&quot;name&quot;:&quot;accountId&quot;},&quot;operatorCode&quot;:&quot;isNotEmptyWrapper&quot;,&quot;parentId&quot;:1,&quot;right&quot;:{&quot;code&quot;:&quot;\&quot;A\nB\nC\&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;name&quot;:&quot;&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;}}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;}</p>
         */
        @NameInMap("condition")
        public String condition;

        /**
         * <p>Data version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dataVersion")
        public Long dataVersion;

        /**
         * <p>Variable description information.</p>
         * 
         * <strong>example:</strong>
         * <p>变量描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Event code.</p>
         * 
         * <strong>example:</strong>
         * <p>de_awkhwh0314</p>
         */
        @NameInMap("eventCodes")
        public String eventCodes;

        /**
         * <p>Global cumulative. Not currently available externally.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("global")
        public Boolean global;

        /**
         * <p>Historical value parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>COUNT</p>
         */
        @NameInMap("historyValueType")
        public String historyValueType;

        /**
         * <p>Primary key ID of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>3434</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Subordinate attribute (single selection, sourced from the event attribute list code).</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("object")
        public String object;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Main attribute (multiple separated by commas, up to 5, sourced from the event attribute list code).</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>Time slice type.</p>
         * 
         * <strong>example:</strong>
         * <p>CURRENT</p>
         */
        @NameInMap("timeType")
        public String timeType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>累计个数</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Top N.</p>
         * 
         * <strong>example:</strong>
         * <p>topN累计</p>
         */
        @NameInMap("topN")
        public Long topN;

        /**
         * <p>Number of time slices.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("twCount")
        public Long twCount;

        /**
         * <p>Cumulative indicator processing function.</p>
         * 
         * <strong>example:</strong>
         * <p>COUNT</p>
         */
        @NameInMap("velocityFC")
        public String velocityFC;

        /**
         * <p>Cumulative indicator time window.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTH_1</p>
         */
        @NameInMap("velocityTW")
        public String velocityTW;

        public static DescribeVariableVersionDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVariableVersionDetailResponseBodyResultObject self = new DescribeVariableVersionDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setDataVersion(Long dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public Long getDataVersion() {
            return this.dataVersion;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setEventCodes(String eventCodes) {
            this.eventCodes = eventCodes;
            return this;
        }
        public String getEventCodes() {
            return this.eventCodes;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setGlobal(Boolean global) {
            this.global = global;
            return this;
        }
        public Boolean getGlobal() {
            return this.global;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setHistoryValueType(String historyValueType) {
            this.historyValueType = historyValueType;
            return this;
        }
        public String getHistoryValueType() {
            return this.historyValueType;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setTopN(Long topN) {
            this.topN = topN;
            return this;
        }
        public Long getTopN() {
            return this.topN;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setTwCount(Long twCount) {
            this.twCount = twCount;
            return this;
        }
        public Long getTwCount() {
            return this.twCount;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setVelocityFC(String velocityFC) {
            this.velocityFC = velocityFC;
            return this;
        }
        public String getVelocityFC() {
            return this.velocityFC;
        }

        public DescribeVariableVersionDetailResponseBodyResultObject setVelocityTW(String velocityTW) {
            this.velocityTW = velocityTW;
            return this;
        }
        public String getVelocityTW() {
            return this.velocityTW;
        }

    }

}
