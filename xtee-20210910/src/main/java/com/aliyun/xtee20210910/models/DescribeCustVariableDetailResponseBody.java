// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariableDetailResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeCustVariableDetailResponseBodyResultObject> resultObject;

    public static DescribeCustVariableDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariableDetailResponseBody self = new DescribeCustVariableDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariableDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustVariableDetailResponseBody setResultObject(java.util.List<DescribeCustVariableDetailResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeCustVariableDetailResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public static class DescribeCustVariableDetailResponseBodyResultObject extends TeaModel {
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
         * <p>Description information.</p>
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
         * <p>de_ahespg8137</p>
         */
        @NameInMap("eventCodes")
        public String eventCodes;

        /**
         * <p>Value type</p>
         * 
         * <strong>example:</strong>
         * <p>EARLIEST</p>
         */
        @NameInMap("historyValueType")
        public String historyValueType;

        /**
         * <p>Primary key ID of the cumulative variable</p>
         * 
         * <strong>example:</strong>
         * <p>2793</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Cumulative object</p>
         * 
         * <strong>example:</strong>
         * <p>DEpage</p>
         */
        @NameInMap("object")
        public String object;

        /**
         * <p>Variable return type</p>
         * 
         * <strong>example:</strong>
         * <p>DOUBLE</p>
         */
        @NameInMap("outputs")
        public String outputs;

        /**
         * <p>Main object</p>
         * 
         * <strong>example:</strong>
         * <p>DEpname</p>
         */
        @NameInMap("subject")
        public String subject;

        /**
         * <p>Time slice type</p>
         * 
         * <strong>example:</strong>
         * <p>NEAR</p>
         */
        @NameInMap("timeType")
        public String timeType;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>累计变量求平均值</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Time count</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("twCount")
        public String twCount;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>DISTINCT</p>
         */
        @NameInMap("velocityFC")
        public String velocityFC;

        /**
         * <p>Time slice unit</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR_1</p>
         */
        @NameInMap("velocityTW")
        public String velocityTW;

        public static DescribeCustVariableDetailResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustVariableDetailResponseBodyResultObject self = new DescribeCustVariableDetailResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeCustVariableDetailResponseBodyResultObject setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setDataVersion(Long dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public Long getDataVersion() {
            return this.dataVersion;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setEventCodes(String eventCodes) {
            this.eventCodes = eventCodes;
            return this;
        }
        public String getEventCodes() {
            return this.eventCodes;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setHistoryValueType(String historyValueType) {
            this.historyValueType = historyValueType;
            return this;
        }
        public String getHistoryValueType() {
            return this.historyValueType;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setTwCount(String twCount) {
            this.twCount = twCount;
            return this;
        }
        public String getTwCount() {
            return this.twCount;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setVelocityFC(String velocityFC) {
            this.velocityFC = velocityFC;
            return this;
        }
        public String getVelocityFC() {
            return this.velocityFC;
        }

        public DescribeCustVariableDetailResponseBodyResultObject setVelocityTW(String velocityTW) {
            this.velocityTW = velocityTW;
            return this;
        }
        public String getVelocityTW() {
            return this.velocityTW;
        }

    }

}
