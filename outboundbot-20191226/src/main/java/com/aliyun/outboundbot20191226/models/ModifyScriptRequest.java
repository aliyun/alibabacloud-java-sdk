// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyScriptRequest extends TeaModel {
    /**
     * <p>The ID of the robot workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>1198938</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>The access key for the robot workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Indicates whether the robot workspace is a Large Language Model (LLM) workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AgentLlm")
    public Boolean agentLlm;

    /**
     * <p>The ASR configuration. Parameter definitions:</p>
     * <ul>
     * <li><p><strong>appKey</strong>: The Alibaba Cloud account appKey.</p>
     * </li>
     * <li><p><strong>maxEndSilence</strong>: The duration for voice endpoint detection.</p>
     * </li>
     * <li><p><strong>silenceTimeout</strong>: The silence timeout. Unit: seconds. The system times out after the user is silent for N seconds.</p>
     * </li>
     * <li><p><strong>engine</strong>: The service to invoke. Valid values: ali, xunfei.</p>
     * </li>
     * <li><p><strong>nlsServiceType</strong>: The type of the invoked service.</p>
     * <ul>
     * <li><p>Managed: Public cloud NLS service.</p>
     * </li>
     * <li><p>Authorized: Authorized NLS service.</p>
     * </li>
     * <li><p>Provided: NLS service provided by the customer through AS/SK.</p>
     * </li>
     * <li><p>Apes: Private cloud service.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>engineXunfei</strong>: If the caller is xunfei, fill in the corresponding configuration.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If engine is set to ali and nlsServiceType is set to Authorized, a custom service is used, and the service provider is ali. If engine is set to ali and nlsServiceType is set to Managed, the default service is used. If engine is set to xunfei and nlsServiceType is set to Authorized, the service provider is xunfei. You must fill in the xunfei configuration, such as {&quot;uuid&quot;:&quot;ed2xxxxxxxxx&quot;,&quot;globalMaxEndSilence&quot;:700,&quot;globalMaxEndSilenceEnable&quot;:true}.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>globalMaxEndSilence</strong>: Silence detection. Unit: milliseconds.</p>
     * </li>
     * <li><p><strong>globalMaxEndSilenceEnable</strong>: The switch for silence detection. Default value: enabled.</p>
     * </li>
     * <li><p><strong>speechNoiseThreshold</strong>: The noise filtering threshold.</p>
     * </li>
     * </ul>
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
     * <p>The call configuration.</p>
     * <ul>
     * <li><p>silenceConfig: Silence configuration.</p>
     * <ul>
     * <li><p>silenceReplyTimeout: The timeout period for silence replies, in milliseconds.</p>
     * </li>
     * <li><p>silenceTimeoutMaxCount: Hang up after several rounds of silence timeout.</p>
     * </li>
     * <li><p>silenceTimeoutMaxCountEnable: Indicates whether to hang up on silence.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>hangupConfig: Hang-up configuration.</p>
     * <ul>
     * <li><p>aiHangupEnable: AI hang-up. Valid values: true, false.</p>
     * </li>
     * <li><p>delayHangup: Delayed hang-up. Maximum value: 10.</p>
     * </li>
     * <li><p>hangupMaxRounds: Interaction rounds. Maximum value: 100.</p>
     * </li>
     * <li><p>hangupMaxRoundsBroadcast: The script for hang-up broadcast.</p>
     * </li>
     * <li><p>hangupMaxRoundsEnable: Determine the maximum number of interaction rounds. Valid values: true, false.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>securityInterceptConfig: Security block configuration.</p>
     * <ul>
     * <li>broadcast: The script for block broadcast.</li>
     * </ul>
     * </li>
     * <li><p>specialInterceptConfig: Special case block.</p>
     * <ul>
     * <li><p>specialInterceptEnable: The switch for special case block.</p>
     * </li>
     * <li><p>specialIntercepts: Special cases.</p>
     * <ul>
     * <li><p>voiceAssistant: Voice assistant.</p>
     * </li>
     * <li><p>extensionNumberTransfer: Extension number transfer.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>transitionConfig: Transition phrase model configuration.</p>
     * <ul>
     * <li>transitionSwitch: The switch for the transition phrase model.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;silenceConfig&quot;:{&quot;silenceReplyTimeout&quot;:499,&quot;silenceTimeoutMaxCount&quot;:10,&quot;silenceTimeoutMaxCountEnable&quot;:true},&quot;hangupConfig&quot;:{&quot;aiHangupEnable&quot;:false,&quot;delayHangup&quot;:0,&quot;hangupMaxRounds&quot;:20,&quot;hangupMaxRoundsBroadcast&quot;:&quot;感谢您的接听，祝您生活愉快，再见!&quot;,&quot;hangupMaxRoundsEnable&quot;:false},&quot;securityInterceptConfig&quot;:{&quot;broadcast&quot;:&quot;您说的这个问题我不能回答您，您可以尝试询问其他问题。&quot;},&quot;specialInterceptConfig&quot;:{&quot;specialInterceptEnable&quot;:false,&quot;specialIntercepts&quot;:[{&quot;code&quot;:&quot;voiceAssistant&quot;},{&quot;code&quot;:&quot;extensionNumberTransfer&quot;}]},&quot;transitionConfig&quot;:{&quot;transitionSwitch&quot;:false}}</p>
     */
    @NameInMap("ChatConfig")
    public String chatConfig;

    /**
     * <p>The ID of the chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-iFZfi7eq6e</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <p>The switch for emotion detection configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EmotionEnable")
    public Boolean emotionEnable;

    /**
     * <p>The industry.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>电商</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LabelConfig")
    public String labelConfig;

    /**
     * <p>The switch for intelligent sentence segmentation configuration (small model).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LongWaitEnable")
    public Boolean longWaitEnable;

    /**
     * <p>The configuration for transition phrases. Customization is not supported temporarily. Do not pass this parameter by default. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("MiniPlaybackConfigListJsonString")
    public String miniPlaybackConfigListJsonString;

    /**
     * <p>The switch for transition phrase configuration (small model).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MiniPlaybackEnable")
    public Boolean miniPlaybackEnable;

    /**
     * <p>The switch for graceful barge-in configuration (small model).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewBargeInEnable")
    public Boolean newBargeInEnable;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("NlsConfig")
    public String nlsConfig;

    /**
     * <p>The NLU access method (applicable only to Large Language Model (LLM) scenarios).</p>
     * <p>Enumeration:</p>
     * <ul>
     * <li><p>Managed: Access using an Alibaba Cloud public account.</p>
     * </li>
     * <li><p>This parameter is empty for non-LLM scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Managed</p>
     */
    @NameInMap("NluAccessType")
    public String nluAccessType;

    /**
     * <p>The NLU engine (applicable only to Large Language Model (LLM) scenarios).</p>
     * <blockquote>
     * <p>After a scenario is created, you cannot modify the scenario mode.</p>
     * </blockquote>
     * <p>Enumeration:</p>
     * <ul>
     * <li><p>Prompts: Text filling mode.</p>
     * </li>
     * <li><p>SSE_FUNCTION: Function Compute mode.</p>
     * </li>
     * <li><p>This parameter is empty for non-LLM scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prompts</p>
     */
    @NameInMap("NluEngine")
    public String nluEngine;

    /**
     * <p>The scenario information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>回访</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>For notification instances, pass in the script list. This parameter is deprecated.</p>
     */
    @NameInMap("ScriptContent")
    public java.util.List<String> scriptContent;

    /**
     * <p>The description of the script.</p>
     * 
     * <strong>example:</strong>
     * <p>返工回访话术</p>
     */
    @NameInMap("ScriptDescription")
    public String scriptDescription;

    /**
     * <p>The ID of the script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c153d0d8-ba04-41c0-8632-453944c9dd0b</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The name of the script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>续费提醒</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    /**
     * <p>For notification instances, pass in the script voice list. This parameter is deprecated.</p>
     */
    @NameInMap("ScriptWaveform")
    public java.util.List<String> scriptWaveform;

    /**
     * <p>The TTS configuration. Parameter definitions:</p>
     * <ul>
     * <li><p><strong>voice</strong>: The voice actor.</p>
     * </li>
     * <li><p><strong>volume</strong>: The volume. Valid values: 0 to 100. Default value: 50.</p>
     * </li>
     * <li><p><strong>speechRate</strong>: The speech rate. Valid values: -500 to 500. Default value: 0.</p>
     * </li>
     * <li><p><strong>pitchRate</strong>: The pitch rate. Valid values: -500 to 500. Default value: 0.</p>
     * </li>
     * <li><p><strong>globalInterruptible</strong>: The voice interruption configuration.</p>
     * </li>
     * <li><p><strong>engine</strong></p>
     * <p><strong>nlsServiceType</strong>: The type of the invoked service.</p>
     * <ul>
     * <li><p>Managed: Public cloud NLS service.</p>
     * </li>
     * <li><p>Authorized: Authorized NLS service.</p>
     * </li>
     * <li><p>Provided: NLS service provided by the customer through AS/SK.</p>
     * </li>
     * <li><p>Apes: Private cloud service.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>engineXunfei</strong>: The configuration when the service provider is xunfei.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>1\. If engine is set to ali and nlsServiceType is set to Authorized, a custom service is used. 2. If the service provider is ali, and engine is set to ali and nlsServiceType is set to Managed, the default service is used. 3. If engine is set to xunfei (applicable to small model scenarios) and nlsServiceType is set to Authorized, the service provider is xunfei. You must fill in the engineXunfei configuration, such as {&quot;pitchRate&quot;:50,&quot;speechRate&quot;:50,&quot;voice&quot;:&quot;aisjiuxu&quot;,&quot;volume&quot;:50}. 4. If engine is set to volc and nlsServiceType is set to Authorized, it indicates that Doubao is applicable.</p>
     * </blockquote>
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

    public static ModifyScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScriptRequest self = new ModifyScriptRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScriptRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public ModifyScriptRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ModifyScriptRequest setAgentLlm(Boolean agentLlm) {
        this.agentLlm = agentLlm;
        return this;
    }
    public Boolean getAgentLlm() {
        return this.agentLlm;
    }

    public ModifyScriptRequest setAsrConfig(String asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public String getAsrConfig() {
        return this.asrConfig;
    }

    public ModifyScriptRequest setChatConfig(String chatConfig) {
        this.chatConfig = chatConfig;
        return this;
    }
    public String getChatConfig() {
        return this.chatConfig;
    }

    public ModifyScriptRequest setChatbotId(String chatbotId) {
        this.chatbotId = chatbotId;
        return this;
    }
    public String getChatbotId() {
        return this.chatbotId;
    }

    public ModifyScriptRequest setEmotionEnable(Boolean emotionEnable) {
        this.emotionEnable = emotionEnable;
        return this;
    }
    public Boolean getEmotionEnable() {
        return this.emotionEnable;
    }

    public ModifyScriptRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ModifyScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyScriptRequest setLabelConfig(String labelConfig) {
        this.labelConfig = labelConfig;
        return this;
    }
    public String getLabelConfig() {
        return this.labelConfig;
    }

    public ModifyScriptRequest setLongWaitEnable(Boolean longWaitEnable) {
        this.longWaitEnable = longWaitEnable;
        return this;
    }
    public Boolean getLongWaitEnable() {
        return this.longWaitEnable;
    }

    public ModifyScriptRequest setMiniPlaybackConfigListJsonString(String miniPlaybackConfigListJsonString) {
        this.miniPlaybackConfigListJsonString = miniPlaybackConfigListJsonString;
        return this;
    }
    public String getMiniPlaybackConfigListJsonString() {
        return this.miniPlaybackConfigListJsonString;
    }

    public ModifyScriptRequest setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
        this.miniPlaybackEnable = miniPlaybackEnable;
        return this;
    }
    public Boolean getMiniPlaybackEnable() {
        return this.miniPlaybackEnable;
    }

    public ModifyScriptRequest setNewBargeInEnable(Boolean newBargeInEnable) {
        this.newBargeInEnable = newBargeInEnable;
        return this;
    }
    public Boolean getNewBargeInEnable() {
        return this.newBargeInEnable;
    }

    public ModifyScriptRequest setNlsConfig(String nlsConfig) {
        this.nlsConfig = nlsConfig;
        return this;
    }
    public String getNlsConfig() {
        return this.nlsConfig;
    }

    public ModifyScriptRequest setNluAccessType(String nluAccessType) {
        this.nluAccessType = nluAccessType;
        return this;
    }
    public String getNluAccessType() {
        return this.nluAccessType;
    }

    public ModifyScriptRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
    }

    public ModifyScriptRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ModifyScriptRequest setScriptContent(java.util.List<String> scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public java.util.List<String> getScriptContent() {
        return this.scriptContent;
    }

    public ModifyScriptRequest setScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
        return this;
    }
    public String getScriptDescription() {
        return this.scriptDescription;
    }

    public ModifyScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public ModifyScriptRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public ModifyScriptRequest setScriptWaveform(java.util.List<String> scriptWaveform) {
        this.scriptWaveform = scriptWaveform;
        return this;
    }
    public java.util.List<String> getScriptWaveform() {
        return this.scriptWaveform;
    }

    public ModifyScriptRequest setTtsConfig(String ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public String getTtsConfig() {
        return this.ttsConfig;
    }

}
