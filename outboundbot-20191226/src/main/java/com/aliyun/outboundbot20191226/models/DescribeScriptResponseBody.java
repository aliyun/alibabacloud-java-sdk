// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("NlsConfig")
    public String nlsConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Script")
    public DescribeScriptResponseBodyScript script;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScriptResponseBody self = new DescribeScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScriptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeScriptResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeScriptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeScriptResponseBody setNlsConfig(String nlsConfig) {
        this.nlsConfig = nlsConfig;
        return this;
    }
    public String getNlsConfig() {
        return this.nlsConfig;
    }

    public DescribeScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScriptResponseBody setScript(DescribeScriptResponseBodyScript script) {
        this.script = script;
        return this;
    }
    public DescribeScriptResponseBodyScript getScript() {
        return this.script;
    }

    public DescribeScriptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeScriptResponseBodyScript extends TeaModel {
        @NameInMap("AsrConfig")
        public String asrConfig;

        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("EmotionEnable")
        public Boolean emotionEnable;

        @NameInMap("Industry")
        public String industry;

        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("LongWaitEnable")
        public Boolean longWaitEnable;

        @NameInMap("MiniPlaybackEnable")
        public Boolean miniPlaybackEnable;

        @NameInMap("NewBargeInEnable")
        public Boolean newBargeInEnable;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("Status")
        public String status;

        @NameInMap("TtsConfig")
        public String ttsConfig;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeScriptResponseBodyScript build(java.util.Map<String, ?> map) throws Exception {
            DescribeScriptResponseBodyScript self = new DescribeScriptResponseBodyScript();
            return TeaModel.build(map, self);
        }

        public DescribeScriptResponseBodyScript setAsrConfig(String asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }
        public String getAsrConfig() {
            return this.asrConfig;
        }

        public DescribeScriptResponseBodyScript setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public DescribeScriptResponseBodyScript setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public DescribeScriptResponseBodyScript setEmotionEnable(Boolean emotionEnable) {
            this.emotionEnable = emotionEnable;
            return this;
        }
        public Boolean getEmotionEnable() {
            return this.emotionEnable;
        }

        public DescribeScriptResponseBodyScript setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public DescribeScriptResponseBodyScript setIsDebugDrafted(Boolean isDebugDrafted) {
            this.isDebugDrafted = isDebugDrafted;
            return this;
        }
        public Boolean getIsDebugDrafted() {
            return this.isDebugDrafted;
        }

        public DescribeScriptResponseBodyScript setIsDrafted(Boolean isDrafted) {
            this.isDrafted = isDrafted;
            return this;
        }
        public Boolean getIsDrafted() {
            return this.isDrafted;
        }

        public DescribeScriptResponseBodyScript setLongWaitEnable(Boolean longWaitEnable) {
            this.longWaitEnable = longWaitEnable;
            return this;
        }
        public Boolean getLongWaitEnable() {
            return this.longWaitEnable;
        }

        public DescribeScriptResponseBodyScript setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
            this.miniPlaybackEnable = miniPlaybackEnable;
            return this;
        }
        public Boolean getMiniPlaybackEnable() {
            return this.miniPlaybackEnable;
        }

        public DescribeScriptResponseBodyScript setNewBargeInEnable(Boolean newBargeInEnable) {
            this.newBargeInEnable = newBargeInEnable;
            return this;
        }
        public Boolean getNewBargeInEnable() {
            return this.newBargeInEnable;
        }

        public DescribeScriptResponseBodyScript setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeScriptResponseBodyScript setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public DescribeScriptResponseBodyScript setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public DescribeScriptResponseBodyScript setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public DescribeScriptResponseBodyScript setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScriptResponseBodyScript setTtsConfig(String ttsConfig) {
            this.ttsConfig = ttsConfig;
            return this;
        }
        public String getTtsConfig() {
            return this.ttsConfig;
        }

        public DescribeScriptResponseBodyScript setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
