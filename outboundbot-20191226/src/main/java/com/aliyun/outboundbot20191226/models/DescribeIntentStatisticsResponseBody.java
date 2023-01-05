// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeIntentStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GlobalIntentNum")
    public Integer globalIntentNum;

    @NameInMap("GlobalIntents")
    public java.util.List<DescribeIntentStatisticsResponseBodyGlobalIntents> globalIntents;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentsAfterNoAnswer")
    public java.util.List<DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer> intentsAfterNoAnswer;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProcessIntentNum")
    public Integer processIntentNum;

    @NameInMap("ProcessIntents")
    public java.util.List<DescribeIntentStatisticsResponseBodyProcessIntents> processIntents;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeIntentStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentStatisticsResponseBody self = new DescribeIntentStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntentStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeIntentStatisticsResponseBody setGlobalIntentNum(Integer globalIntentNum) {
        this.globalIntentNum = globalIntentNum;
        return this;
    }
    public Integer getGlobalIntentNum() {
        return this.globalIntentNum;
    }

    public DescribeIntentStatisticsResponseBody setGlobalIntents(java.util.List<DescribeIntentStatisticsResponseBodyGlobalIntents> globalIntents) {
        this.globalIntents = globalIntents;
        return this;
    }
    public java.util.List<DescribeIntentStatisticsResponseBodyGlobalIntents> getGlobalIntents() {
        return this.globalIntents;
    }

    public DescribeIntentStatisticsResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeIntentStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeIntentStatisticsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeIntentStatisticsResponseBody setIntentsAfterNoAnswer(java.util.List<DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer> intentsAfterNoAnswer) {
        this.intentsAfterNoAnswer = intentsAfterNoAnswer;
        return this;
    }
    public java.util.List<DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer> getIntentsAfterNoAnswer() {
        return this.intentsAfterNoAnswer;
    }

    public DescribeIntentStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIntentStatisticsResponseBody setProcessIntentNum(Integer processIntentNum) {
        this.processIntentNum = processIntentNum;
        return this;
    }
    public Integer getProcessIntentNum() {
        return this.processIntentNum;
    }

    public DescribeIntentStatisticsResponseBody setProcessIntents(java.util.List<DescribeIntentStatisticsResponseBodyProcessIntents> processIntents) {
        this.processIntents = processIntents;
        return this;
    }
    public java.util.List<DescribeIntentStatisticsResponseBodyProcessIntents> getProcessIntents() {
        return this.processIntents;
    }

    public DescribeIntentStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntentStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeIntentStatisticsResponseBodyGlobalIntents extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("HitAfterNoAnswer")
        public Integer hitAfterNoAnswer;

        @NameInMap("HitNum")
        public Integer hitNum;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("Type")
        public String type;

        public static DescribeIntentStatisticsResponseBodyGlobalIntents build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentStatisticsResponseBodyGlobalIntents self = new DescribeIntentStatisticsResponseBodyGlobalIntents();
            return TeaModel.build(map, self);
        }

        public DescribeIntentStatisticsResponseBodyGlobalIntents setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeIntentStatisticsResponseBodyGlobalIntents setHitAfterNoAnswer(Integer hitAfterNoAnswer) {
            this.hitAfterNoAnswer = hitAfterNoAnswer;
            return this;
        }
        public Integer getHitAfterNoAnswer() {
            return this.hitAfterNoAnswer;
        }

        public DescribeIntentStatisticsResponseBodyGlobalIntents setHitNum(Integer hitNum) {
            this.hitNum = hitNum;
            return this;
        }
        public Integer getHitNum() {
            return this.hitNum;
        }

        public DescribeIntentStatisticsResponseBodyGlobalIntents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIntentStatisticsResponseBodyGlobalIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public DescribeIntentStatisticsResponseBodyGlobalIntents setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public DescribeIntentStatisticsResponseBodyGlobalIntents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer self = new DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer();
            return TeaModel.build(map, self);
        }

        public DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeIntentStatisticsResponseBodyProcessIntents extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("HitAfterNoAnswer")
        public Integer hitAfterNoAnswer;

        @NameInMap("HitNum")
        public Integer hitNum;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("Type")
        public String type;

        public static DescribeIntentStatisticsResponseBodyProcessIntents build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentStatisticsResponseBodyProcessIntents self = new DescribeIntentStatisticsResponseBodyProcessIntents();
            return TeaModel.build(map, self);
        }

        public DescribeIntentStatisticsResponseBodyProcessIntents setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeIntentStatisticsResponseBodyProcessIntents setHitAfterNoAnswer(Integer hitAfterNoAnswer) {
            this.hitAfterNoAnswer = hitAfterNoAnswer;
            return this;
        }
        public Integer getHitAfterNoAnswer() {
            return this.hitAfterNoAnswer;
        }

        public DescribeIntentStatisticsResponseBodyProcessIntents setHitNum(Integer hitNum) {
            this.hitNum = hitNum;
            return this;
        }
        public Integer getHitNum() {
            return this.hitNum;
        }

        public DescribeIntentStatisticsResponseBodyProcessIntents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIntentStatisticsResponseBodyProcessIntents setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public DescribeIntentStatisticsResponseBodyProcessIntents setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public DescribeIntentStatisticsResponseBodyProcessIntents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
