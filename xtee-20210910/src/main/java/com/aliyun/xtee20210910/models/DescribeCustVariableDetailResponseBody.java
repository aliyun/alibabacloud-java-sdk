// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariableDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("condition")
        public String condition;

        @NameInMap("dataVersion")
        public Long dataVersion;

        @NameInMap("description")
        public String description;

        @NameInMap("eventCodes")
        public String eventCodes;

        @NameInMap("historyValueType")
        public String historyValueType;

        @NameInMap("id")
        public Long id;

        @NameInMap("object")
        public String object;

        @NameInMap("outputs")
        public String outputs;

        @NameInMap("subject")
        public String subject;

        @NameInMap("timeType")
        public String timeType;

        @NameInMap("title")
        public String title;

        @NameInMap("twCount")
        public String twCount;

        @NameInMap("velocityFC")
        public String velocityFC;

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
