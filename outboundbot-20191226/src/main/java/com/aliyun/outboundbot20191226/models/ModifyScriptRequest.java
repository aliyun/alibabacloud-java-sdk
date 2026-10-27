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
     * <p>Specifies whether the robot workspace is a large model workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AgentLlm")
    public Boolean agentLlm;

    /**
     * <p>The ASR configuration. Parameter definitions:</p>
     * <ul>
     * <li><p><strong>appKey</strong>: The appKey of the Alibaba Cloud account.</p>
     * </li>
     * <li><p><strong>maxEndSilence</strong>: The duration of voice endpoint detection.</p>
     * </li>
     * <li><p><strong>silenceTimeout</strong>: The silence timeout in seconds. The timeout occurs after the user is silent for N seconds.</p>
     * </li>
     * <li><p><strong>engine</strong>: The service to call. Valid values: ali and xunfei.</p>
     * </li>
     * <li><p><strong>nlsServiceType</strong>: The type of the service to call. Valid values: </p>
     * <ul>
     * <li>Managed: The NLS service on the public cloud. </li>
     * <li>Authorized: The authorized NLS service.</li>
     * <li>Provided: The NLS service provided by the customer through AccessKey ID and AccessKey secret.</li>
     * <li>Apes: The private cloud service.</li>
     * </ul>
     * </li>
     * <li><p><strong>engineXunfei</strong>: The configuration required when the caller is xunfei.</p>
     * <blockquote>
     * <p>When engine is set to ali and nlsServiceType is set to Authorized, a custom service is used, and the service provider is ali. When engine is set to ali and nlsServiceType is set to Managed, the default service is used. When engine is set to xunfei and nlsServiceType is set to Authorized, the service provider is xunfei, and you must enter the xunfei configuration: {&quot;uuid&quot;:&quot;ed2xxxxxxxxx&quot;,&quot;globalMaxEndSilence&quot;:700,&quot;globalMaxEndSilenceEnable&quot;:true}.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>globalMaxEndSilence</strong>: The silence detection duration in milliseconds.</p>
     * </li>
     * <li><p><strong>globalMaxEndSilenceEnable</strong>: The silence detection switch. Enabled by default.</p>
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
     * <li>silenceConfig: The silence configuration.<ul>
     * <li>silenceReplyTimeout: The silence reply timeout in milliseconds.</li>
     * <li>silenceTimeoutMaxCount: The maximum number of silence timeout rounds before hanging up.</li>
     * <li>silenceTimeoutMaxCountEnable: Specifies whether to hang up after silence timeouts.</li>
     * </ul>
     * </li>
     * <li>hangupConfig: The hang-up configuration.<ul>
     * <li>aiHangupEnable: Specifies whether to enable AI hang-up. Valid values: true and false.</li>
     * <li>delayHangup: The delayed hang-up time. Maximum value: 10.</li>
     * <li>hangupMaxRounds: The maximum number of interaction rounds. Maximum value: 100.</li>
     * <li>hangupMaxRoundsBroadcast: The broadcast script for hanging up.</li>
     * <li>hangupMaxRoundsEnable: Specifies whether to enable the maximum interaction rounds check. Valid values: true and false.</li>
     * </ul>
     * </li>
     * <li>securityInterceptConfig: The security interception configuration.<ul>
     * <li>broadcast: The interception broadcast script.</li>
     * </ul>
     * </li>
     * <li>specialInterceptConfig: The special case interception configuration.<ul>
     * <li>specialInterceptEnable: Specifies whether to enable special case interception.</li>
     * <li>specialIntercepts: The special cases.<ul>
     * <li>voiceAssistant: Voice assistant.</li>
     * <li>extensionNumberTransfer: Extension number transfer.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>transitionConfig: The backchannel model configuration.<ul>
     * <li>transitionSwitch: Specifies whether to enable the backchannel model.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;silenceConfig&quot;:{&quot;silenceReplyTimeout&quot;:499,&quot;silenceTimeoutMaxCount&quot;:10,&quot;silenceTimeoutMaxCountEnable&quot;:true},&quot;hangupConfig&quot;:{&quot;aiHangupEnable&quot;:false,&quot;delayHangup&quot;:0,&quot;hangupMaxRounds&quot;:20,&quot;hangupMaxRoundsBroadcast&quot;:&quot;Thank you for taking my call. Have a great day. Goodbye!&quot;,&quot;hangupMaxRoundsEnable&quot;:false},&quot;securityInterceptConfig&quot;:{&quot;broadcast&quot;:&quot;I cannot answer this question. You can try asking other questions.&quot;},&quot;specialInterceptConfig&quot;:{&quot;specialInterceptEnable&quot;:false,&quot;specialIntercepts&quot;:[{&quot;code&quot;:&quot;voiceAssistant&quot;},{&quot;code&quot;:&quot;extensionNumberTransfer&quot;}]},&quot;transitionConfig&quot;:{&quot;transitionSwitch&quot;:false}}</p>
     */
    @NameInMap("ChatConfig")
    public String chatConfig;

    /**
     * <p>The robot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-iFZfi7eq6e</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <p>Specifies whether to enable the emotion recognition configuration.</p>
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
     * <p>E-commerce</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The label definition.</p>
     * <blockquote>
     * <p>Used in large model flow canvas scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;labels&quot;: [{
     *         &quot;description&quot;: &quot;The customer\&quot;s final repayment intention after the conversation is completed&quot;,
     *         &quot;name&quot;: &quot;Whether promised to repay&quot;,
     *         &quot;valueList&quot;: &quot;[\&quot;Yes\&quot;,\&quot;No\&quot;]&quot;
     *     }]
     * }</p>
     */
    @NameInMap("LabelConfig")
    public String labelConfig;

    /**
     * <p>Specifies whether to enable the intelligent sentence segmentation configuration for small models.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LongWaitEnable")
    public Boolean longWaitEnable;

    /**
     * <p>The backchannel configuration. Customization is not supported at the moment. You do not need to pass this parameter by default. <strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MiniPlaybackConfigListJsonString")
    public String miniPlaybackConfigListJsonString;

    /**
     * <p>Specifies whether to enable the backchannel configuration for small models.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MiniPlaybackEnable")
    public Boolean miniPlaybackEnable;

    /**
     * <p>Specifies whether to enable the graceful interruption configuration for small models.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewBargeInEnable")
    public Boolean newBargeInEnable;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("NlsConfig")
    public String nlsConfig;

    /**
     * <p>The NLU access method. This parameter is applicable only to large model scenarios.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Managed: Uses the Alibaba Cloud public account for access.</li>
     * <li>Empty: For non-large model scenarios.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Managed</p>
     */
    @NameInMap("NluAccessType")
    public String nluAccessType;

    /**
     * <p>The NLU engine. This parameter is applicable only to large model scenarios.</p>
     * <blockquote>
     * <p>After a scenario is created, the scenario mode cannot be modified.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>Prompts: The text input mode.</li>
     * <li>SSE_FUNCTION: The Function Compute mode.</li>
     * <li>Empty: For non-large model scenarios.</li>
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
     * <p>Follow-up visit</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>The script list for notification instances. <strong>[Deprecated]</strong></p>
     */
    @NameInMap("ScriptContent")
    public java.util.List<String> scriptContent;

    /**
     * <p>The script description.</p>
     * 
     * <strong>example:</strong>
     * <p>Rework callback script</p>
     */
    @NameInMap("ScriptDescription")
    public String scriptDescription;

    /**
     * <p>The script ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c153d0d8-ba04-41c0-8632-453944c9dd0b</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The script name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Renewal reminder</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    /**
     * <p>The script voice list for notification instances. <strong>[Deprecated]</strong></p>
     */
    @NameInMap("ScriptWaveform")
    public java.util.List<String> scriptWaveform;

    /**
     * <p>The TTS configuration. Parameter definitions:</p>
     * <ul>
     * <li><p><strong>voice</strong>: The speaker.</p>
     * </li>
     * <li><p><strong>volume</strong>: The volume. Valid values: 0 to 100. Default value: 50.</p>
     * </li>
     * <li><p><strong>speechRate</strong>: The speech rate. Valid values: -500 to 500. Default value: 0.</p>
     * </li>
     * <li><p><strong>pitchRate</strong>: The pitch. Valid values: -500 to 500. Default value: 0.</p>
     * </li>
     * <li><p><strong>openingPromptInterruptible</strong>: The interruption configuration for the opening prompt.</p>
     * </li>
     * <li><p><strong>closingStatementInterruptible</strong>: The interruption configuration for the closing statement.</p>
     * </li>
     * <li><p><strong>globalInterruptible</strong>: The voice interruption configuration.</p>
     * </li>
     * <li><p><strong>engine</strong>: The service to call. Valid values: ali, volc, and xunfei. xunfei is not supported in large model scenarios.</p>
     * </li>
     * <li><p><strong>nlsServiceType</strong>: The type of the service to call. Valid values: </p>
     * <ul>
     * <li>Managed: The NLS service on the public cloud. </li>
     * <li>Authorized: The authorized NLS service.</li>
     * <li>Provided: The NLS service provided by the customer through AccessKey ID and AccessKey secret.</li>
     * <li>Apes: The private cloud service.</li>
     * </ul>
     * </li>
     * <li><p><strong>engineXunfei</strong>: The configuration when the service provider is xunfei.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ol>
     * <li>When engine is set to ali and nlsServiceType is set to Authorized, a custom service is used. 2. When the service provider is ali, engine is set to ali, and nlsServiceType is set to Managed, the default service is used. 3. When engine is set to xunfei (applicable to small model scenarios) and nlsServiceType is set to Authorized, the service provider is xunfei, and you must enter the engineXunfei configuration: {&quot;pitchRate&quot;:50,&quot;speechRate&quot;:50,&quot;voice&quot;:&quot;aisjiuxu&quot;,&quot;volume&quot;:50}. 4. When engine is set to volc and nlsServiceType is set to Authorized, the applicable service is doubao.</li>
     * </ol>
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
