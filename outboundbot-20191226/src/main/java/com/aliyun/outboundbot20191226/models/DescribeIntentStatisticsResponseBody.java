// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeIntentStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("GlobalIntentNum")
    public Integer globalIntentNum;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("GlobalIntents")
    public java.util.List<DescribeIntentStatisticsResponseBodyGlobalIntents> globalIntents;

    /**
     * <strong>example:</strong>
     * <p>0c3f352f-d045-491d-9ce7-11f2d2b7775d</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IntentsAfterNoAnswer")
    public java.util.List<DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer> intentsAfterNoAnswer;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProcessIntentNum")
    public Integer processIntentNum;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ProcessIntents")
    public java.util.List<DescribeIntentStatisticsResponseBodyProcessIntents> processIntents;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>0c3f352f-d045-491d-9ce7-11f2d2b7775d</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitAfterNoAnswer")
        public Integer hitAfterNoAnswer;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("HitNum")
        public Integer hitNum;

        /**
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>21343425</p>
         */
        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("IntentName")
        public String intentName;

        /**
         * <strong>example:</strong>
         * <p>GlobalIntent</p>
         */
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
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("HitAfterNoAnswer")
        public Integer hitAfterNoAnswer;

        /**
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("IntentName")
        public String intentName;

        public static DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer self = new DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer();
            return TeaModel.build(map, self);
        }

        public DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer setHitAfterNoAnswer(Integer hitAfterNoAnswer) {
            this.hitAfterNoAnswer = hitAfterNoAnswer;
            return this;
        }
        public Integer getHitAfterNoAnswer() {
            return this.hitAfterNoAnswer;
        }

        public DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public DescribeIntentStatisticsResponseBodyIntentsAfterNoAnswer setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

    }

    public static class DescribeIntentStatisticsResponseBodyProcessIntents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0c3f352f-d045-491d-9ce7-11f2d2b7775d</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HitAfterNoAnswer")
        public Integer hitAfterNoAnswer;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HitNum")
        public Integer hitNum;

        /**
         * <strong>example:</strong>
         * <p>a4274627-265f-4e14-b2d6-4ee7d4f8593e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>12343</p>
         */
        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("RateDisplay")
        public String rateDisplay;

        /**
         * <strong>example:</strong>
         * <p>ProcessIntent</p>
         */
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

        public DescribeIntentStatisticsResponseBodyProcessIntents setRateDisplay(String rateDisplay) {
            this.rateDisplay = rateDisplay;
            return this;
        }
        public String getRateDisplay() {
            return this.rateDisplay;
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
