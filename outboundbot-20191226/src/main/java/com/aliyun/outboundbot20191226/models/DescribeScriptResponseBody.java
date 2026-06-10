// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeScriptResponseBody extends TeaModel {
    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>API message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Deprecated</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("NlsConfig")
    public String nlsConfig;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Script details</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Script")
    public DescribeScriptResponseBodyScript script;

    /**
     * <p>Indicates whether the call succeeded</p>
     * 
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
        /**
         * <p>Function service name</p>
         * 
         * <strong>example:</strong>
         * <p>sanfang_test</p>
         */
        @NameInMap("FcFunction")
        public String fcFunction;

        /**
         * <p>Function service trigger URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://sanfang_test-xxxxxx.cn-shanghai-vpc.fcapp.run">http://sanfang_test-xxxxxx.cn-shanghai-vpc.fcapp.run</a></p>
         */
        @NameInMap("FcHttpTriggerUrl")
        public String fcHttpTriggerUrl;

        /**
         * <p>Function service region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("FcRegion")
        public String fcRegion;

        @NameInMap("SupportBeebotPrompts")
        public Boolean supportBeebotPrompts;

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

        public DescribeScriptResponseBodyScriptNluProfile setSupportBeebotPrompts(Boolean supportBeebotPrompts) {
            this.supportBeebotPrompts = supportBeebotPrompts;
            return this;
        }
        public Boolean getSupportBeebotPrompts() {
            return this.supportBeebotPrompts;
        }

    }

    public static class DescribeScriptResponseBodyScript extends TeaModel {
        /**
         * <p>Robot workspace access key</p>
         * 
         * <strong>example:</strong>
         * <p>1218333</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>Robot workspace access key</p>
         * 
         * <strong>example:</strong>
         * <p>14791f5f226b4878b3d9b676a0291234</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>Indicates whether the robot workspace uses a Large Language Model (LLM)</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AgentLlm")
        public Boolean agentLlm;

        /**
         * <p>ASR configuration</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;appKey&quot;: &quot;oQDVNlE6fZ5mg46X&quot;,
         *     &quot;engine&quot;: &quot;ali&quot;,
         *     &quot;engineXunfei&quot;: &quot;&quot;,
         *     &quot;globalMaxEndSilence&quot;: 700,
         *     &quot;globalMaxEndSilenceEnable&quot;: true,
         *     &quot;maxEndSilence&quot;: &quot;500&quot;,
         *     &quot;nlsServiceType&quot;: &quot;Managed&quot;,
         *     &quot;silenceTimeout&quot;: &quot;5000&quot;,
         *     &quot;speechNoiseThreshold&quot;: &quot;0&quot;
         * }</p>
         */
        @NameInMap("AsrConfig")
        public String asrConfig;

        /**
         * <p>Call configuration</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;silenceConfig&quot;:{&quot;silenceReplyTimeout&quot;:499,&quot;silenceTimeoutMaxCount&quot;:10,&quot;silenceTimeoutMaxCountEnable&quot;:true},&quot;hangupConfig&quot;:{&quot;aiHangupEnable&quot;:false,&quot;delayHangup&quot;:0,&quot;hangupMaxRounds&quot;:20,&quot;hangupMaxRoundsBroadcast&quot;:&quot;感谢您的接听，祝您生活愉快，再见!&quot;,&quot;hangupMaxRoundsEnable&quot;:false},&quot;securityInterceptConfig&quot;:{&quot;broadcast&quot;:&quot;您说的这个问题我不能回答您，您可以尝试询问其他问题。&quot;},&quot;specialInterceptConfig&quot;:{&quot;specialInterceptEnable&quot;:false,&quot;specialIntercepts&quot;:[{&quot;code&quot;:&quot;voiceAssistant&quot;},{&quot;code&quot;:&quot;extensionNumberTransfer&quot;}]},&quot;transitionConfig&quot;:{&quot;transitionSwitch&quot;:false}}</p>
         */
        @NameInMap("ChatConfig")
        public String chatConfig;

        /**
         * <p>Chatbot ID</p>
         * 
         * <strong>example:</strong>
         * <p>d31794e2a51f47d2901b4094d88311d7</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>Status of the debug script</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("DebugStatus")
        public String debugStatus;

        /**
         * <p>Enables emotion detection</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmotionEnable")
        public Boolean emotionEnable;

        /**
         * <p>Industry</p>
         * 
         * <strong>example:</strong>
         * <p>金融</p>
         */
        @NameInMap("Industry")
        public String industry;

        /**
         * <p>Indicates whether the debug version is in draft status</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDebugDrafted")
        public Boolean isDebugDrafted;

        /**
         * <p>Indicates whether the script is in draft status</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDrafted")
        public Boolean isDrafted;

        @NameInMap("LabelConfig")
        public String labelConfig;

        /**
         * <p>Enables intelligent sentence break</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LongWaitEnable")
        public Boolean longWaitEnable;

        /**
         * <p>Enables tone continuity</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MiniPlaybackEnable")
        public Boolean miniPlaybackEnable;

        /**
         * <p>Enables graceful barge-in</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NewBargeInEnable")
        public Boolean newBargeInEnable;

        /**
         * <p>NLU engine (applies only to LLM scenarios)</p>
         * <ul>
         * <li><p>Prompts — Text entry mode</p>
         * </li>
         * <li><p>SSE_FUNCTION — Function Compute service mode</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prompts</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>Function Compute service mode configuration</p>
         */
        @NameInMap("NluProfile")
        public DescribeScriptResponseBodyScriptNluProfile nluProfile;

        /**
         * <p>Scenario</p>
         * 
         * <strong>example:</strong>
         * <p>催收</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Script description</p>
         * 
         * <strong>example:</strong>
         * <p>催收话术</p>
         */
        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <p>Script ID</p>
         * 
         * <strong>example:</strong>
         * <p>810b5872-57f0-4b27-80ab-7b3f4d8a6374</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>Script name</p>
         * 
         * <strong>example:</strong>
         * <p>催收话术</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>Script status</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>TTS configuration for the script</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;appKey&quot;: &quot;oQDVNlE6fZ5mg46X&quot;,
         *     &quot;engine&quot;: &quot;ali&quot;,
         *     &quot;engineXunfei&quot;: &quot;&quot;,
         *     &quot;globalInterruptible&quot;: true,
         *     &quot;nlsServiceType&quot;: &quot;Managed&quot;,
         *     &quot;pitchRate&quot;: &quot;0&quot;,
         *     &quot;speechRate&quot;: &quot;0&quot;,
         *     &quot;voice&quot;: &quot;zhiyuan&quot;,
         *     &quot;volume&quot;: &quot;50&quot;
         * }</p>
         */
        @NameInMap("TtsConfig")
        public String ttsConfig;

        /**
         * <p>Time when the script was last updated</p>
         * 
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
