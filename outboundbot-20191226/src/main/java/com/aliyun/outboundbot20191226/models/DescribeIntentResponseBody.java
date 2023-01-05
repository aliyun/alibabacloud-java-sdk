// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeIntentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Intent")
    public DescribeIntentResponseBodyIntent intent;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntentResponseBody self = new DescribeIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeIntentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeIntentResponseBody setIntent(DescribeIntentResponseBodyIntent intent) {
        this.intent = intent;
        return this;
    }
    public DescribeIntentResponseBodyIntent getIntent() {
        return this.intent;
    }

    public DescribeIntentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIntentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeIntentResponseBodyIntent extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("IntentDescription")
        public String intentDescription;

        @NameInMap("IntentId")
        public String intentId;

        @NameInMap("IntentName")
        public String intentName;

        @NameInMap("Keywords")
        public String keywords;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Utterances")
        public String utterances;

        public static DescribeIntentResponseBodyIntent build(java.util.Map<String, ?> map) throws Exception {
            DescribeIntentResponseBodyIntent self = new DescribeIntentResponseBodyIntent();
            return TeaModel.build(map, self);
        }

        public DescribeIntentResponseBodyIntent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeIntentResponseBodyIntent setIntentDescription(String intentDescription) {
            this.intentDescription = intentDescription;
            return this;
        }
        public String getIntentDescription() {
            return this.intentDescription;
        }

        public DescribeIntentResponseBodyIntent setIntentId(String intentId) {
            this.intentId = intentId;
            return this;
        }
        public String getIntentId() {
            return this.intentId;
        }

        public DescribeIntentResponseBodyIntent setIntentName(String intentName) {
            this.intentName = intentName;
            return this;
        }
        public String getIntentName() {
            return this.intentName;
        }

        public DescribeIntentResponseBodyIntent setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public DescribeIntentResponseBodyIntent setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public DescribeIntentResponseBodyIntent setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeIntentResponseBodyIntent setUtterances(String utterances) {
            this.utterances = utterances;
            return this;
        }
        public String getUtterances() {
            return this.utterances;
        }

    }

}
