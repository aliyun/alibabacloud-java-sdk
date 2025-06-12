// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("NlsConfig")
    public String nlsConfig;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Script")
    public DescribeScriptResponseBodyScript script;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    public static class DescribeScriptResponseBodyScriptNluProfile extends TeaModel {
        @NameInMap("FcFunction")
        public String fcFunction;

        @NameInMap("FcHttpTriggerUrl")
        public String fcHttpTriggerUrl;

        @NameInMap("FcRegion")
        public String fcRegion;

        public static DescribeScriptResponseBodyScriptNluProfile build(java.util.Map<String, ?> map) throws Exception {
            DescribeScriptResponseBodyScriptNluProfile self = new DescribeScriptResponseBodyScriptNluProfile();
            return TeaModel.build(map, self);
        }

        public DescribeScriptResponseBodyScriptNluProfile setFcFunction(String fcFunction) {
            this.fcFunction = fcFunction;
            return this;
        }
        public String getFcFunction() {
            return this.fcFunction;
        }

        public DescribeScriptResponseBodyScriptNluProfile setFcHttpTriggerUrl(String fcHttpTriggerUrl) {
            this.fcHttpTriggerUrl = fcHttpTriggerUrl;
            return this;
        }
        public String getFcHttpTriggerUrl() {
            return this.fcHttpTriggerUrl;
        }

        public DescribeScriptResponseBodyScriptNluProfile setFcRegion(String fcRegion) {
            this.fcRegion = fcRegion;
            return this;
        }
        public String getFcRegion() {
            return this.fcRegion;
        }

    }

    public static class DescribeScriptResponseBodyScript extends TeaModel {
        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("AgentKey")
        public String agentKey;

        @NameInMap("AgentLlm")
        public Boolean agentLlm;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;AppKey\&quot;:\&quot;3GHttnsvir1FeWWb\&quot;}</p>
         */
        @NameInMap("AsrConfig")
        public String asrConfig;

        @NameInMap("ChatConfig")
        public String chatConfig;

        /**
         * <strong>example:</strong>
         * <p>chatbot-cn-EJfqqa***</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmotionEnable")
        public Boolean emotionEnable;

        @NameInMap("Industry")
        public String industry;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("LabelConfig")
        public String labelConfig;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LongWaitEnable")
        public Boolean longWaitEnable;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MiniPlaybackEnable")
        public Boolean miniPlaybackEnable;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NewBargeInEnable")
        public Boolean newBargeInEnable;

        @NameInMap("NluEngine")
        public String nluEngine;

        @NameInMap("NluProfile")
        public DescribeScriptResponseBodyScriptNluProfile nluProfile;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <strong>example:</strong>
         * <p>810b5872-57f0-4b27-80ab-7b3f4d8a6374</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;voice\&quot;:\&quot;xiaobei\&quot;,\&quot;volume\&quot;:\&quot;50\&quot;,\&quot;speechRate\&quot;:\&quot;-150\&quot;,\&quot;pitchRate\&quot;:\&quot;0\&quot;}</p>
         */
        @NameInMap("TtsConfig")
        public String ttsConfig;

        /**
         * <strong>example:</strong>
         * <p>1578881227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeScriptResponseBodyScript build(java.util.Map<String, ?> map) throws Exception {
            DescribeScriptResponseBodyScript self = new DescribeScriptResponseBodyScript();
            return TeaModel.build(map, self);
        }

        public DescribeScriptResponseBodyScript setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public DescribeScriptResponseBodyScript setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public DescribeScriptResponseBodyScript setAgentLlm(Boolean agentLlm) {
            this.agentLlm = agentLlm;
            return this;
        }
        public Boolean getAgentLlm() {
            return this.agentLlm;
        }

        public DescribeScriptResponseBodyScript setAsrConfig(String asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }
        public String getAsrConfig() {
            return this.asrConfig;
        }

        public DescribeScriptResponseBodyScript setChatConfig(String chatConfig) {
            this.chatConfig = chatConfig;
            return this;
        }
        public String getChatConfig() {
            return this.chatConfig;
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

        public DescribeScriptResponseBodyScript setLabelConfig(String labelConfig) {
            this.labelConfig = labelConfig;
            return this;
        }
        public String getLabelConfig() {
            return this.labelConfig;
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

        public DescribeScriptResponseBodyScript setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public DescribeScriptResponseBodyScript setNluProfile(DescribeScriptResponseBodyScriptNluProfile nluProfile) {
            this.nluProfile = nluProfile;
            return this;
        }
        public DescribeScriptResponseBodyScriptNluProfile getNluProfile() {
            return this.nluProfile;
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
