// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateScriptRequest extends TeaModel {
    /**
     * <p>Robot workspace ID</p>
     * 
     * <strong>example:</strong>
     * <p>1198938</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>Robot workspace access Key</p>
     * 
     * <strong>example:</strong>
     * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>Is the robot workspace a Large Language Model (LLM) workspace?</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AgentLlm")
    public Boolean agentLlm;

    /**
     * <p>ASR configuration. Parameter definitions:</p>
     * <ul>
     * <li><p><strong>appKey</strong>: Alibaba Cloud account appKey.</p>
     * </li>
     * <li><p><strong>maxEndSilence</strong>: Voice endpoint detection duration.</p>
     * </li>
     * <li><p><strong>silenceTimeout</strong>: Silence timeout. Unit: seconds. The user times out after N seconds of silence.</p>
     * </li>
     * <li><p><strong>engine</strong>: Invoke service; [ali, xunfei]</p>
     * </li>
     * <li><p><strong>nlsServiceType</strong>: Invoke service type [Managed, Authorized]</p>
     * </li>
     * <li><p><strong>engineXunfei</strong>: If the caller is xunfei, enter the corresponding configuration.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you select ali as the engine and Authorized as the nlsServiceType, a custom service is used, and the service provider is ali. If you select ali as the engine and Managed as the nlsServiceType, the default service is used. If you select xunfei as the engine and Authorized as the nlsServiceType, xunfei is the service provider. You must enter the xunfei configuration: {&quot;uuid&quot;:&quot;ed2xxxxxxxxx&quot;,&quot;globalMaxEndSilence&quot;:700,&quot;globalMaxEndSilenceEnable&quot;:true}</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>globalMaxEndSilence</strong>: Silence detection. Unit: milliseconds.</p>
     * </li>
     * <li><p><strong>globalMaxEndSilenceEnable</strong>: Silence detection switch. Enabled by default.</p>
     * </li>
     * <li><p><strong>speechNoiseThreshold</strong>: Noise filtering threshold</p>
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
     * <p>If the NluServiceType of the instance is Authorized or Provided, specify the ID of the chatbot instance to which the script needs to be attached using this field.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-IfaUfqaUnb</p>
     */
    @NameInMap("ChatbotId")
    public String chatbotId;

    /**
     * <p>Emotion detection configuration switch (applicable to small models)</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EmotionEnable")
    public Boolean emotionEnable;

    /**
     * <p>Industry</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>教育</p>
     */
    @NameInMap("Industry")
    public String industry;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c46001bc-3ead-4bfd-9a69-4b5b66a4a3f4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Intelligent sentence segmentation configuration switch (applicable to small models)</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LongWaitEnable")
    public Boolean longWaitEnable;

    /**
     * <p>Connective phrase configuration switch (applicable to small models)</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MiniPlaybackEnable")
    public Boolean miniPlaybackEnable;

    /**
     * <p>Graceful interruption configuration switch (applicable to small models)</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NewBargeInEnable")
    public Boolean newBargeInEnable;

    /**
     * <p>NLU access method (applicable only to Large Language Model (LLM) scenarios). Enumeration: Managed - Access using an Alibaba public account. This field is empty for non-LLM scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>Managed</p>
     */
    @NameInMap("NluAccessType")
    public String nluAccessType;

    /**
     * <p>NLU engine (applicable only to Large Language Model (LLM) scenarios). This field is empty for non-LLM scenarios.</p>
     * <ul>
     * <li><p>Prompts - Large Language Model (LLM) scenario,</p>
     * </li>
     * <li><p>SSE_FUNCTION - Function Compute pattern.</p>
     * </li>
     * <li><p>BeeBot - Workflow pattern.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prompts</p>
     */
    @NameInMap("NluEngine")
    public String nluEngine;

    /**
     * <p>Scenario</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>回访</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>For notification instances, pass in the script list. Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ScriptContent")
    public java.util.List<String> scriptContent;

    /**
     * <p>Script description</p>
     * 
     * <strong>example:</strong>
     * <p>课程回复话术</p>
     */
    @NameInMap("ScriptDescription")
    public String scriptDescription;

    /**
     * <p>Script name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>课程满意度回访</p>
     */
    @NameInMap("ScriptName")
    public String scriptName;

    /**
     * <blockquote>
     * <p>If nluEngine is SSE_FUNCTION, you must pass in the corresponding configuration.</p>
     * </blockquote>
     * <p>Function Compute service pattern configuration</p>
     * <ul>
     * <li><p>fcRegion: Function service region</p>
     * </li>
     * <li><p>fcFunction: Function service name</p>
     * </li>
     * <li><p>fcHttpTriggerUrl Function service trigger</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fcRegion&quot;:&quot;cn-shanghai&quot;,&quot;fcFunction&quot;:&quot;waihu_test&quot;,&quot;fcHttpTriggerUrl&quot;:&quot;<a href="https://waihu-test.xxxxxxxxxxx.cn-shanghai-vpc.fcapp.run%22%7D">https://waihu-test.xxxxxxxxxxx.cn-shanghai-vpc.fcapp.run&quot;}</a></p>
     */
    @NameInMap("ScriptNluProfileJsonString")
    public String scriptNluProfileJsonString;

    /**
     * <p>For notification instances, pass in the script voice list. Deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("ScriptWaveform")
    public java.util.List<String> scriptWaveform;

    /**
     * <p>TTS configuration. Parameter definitions:</p>
     * <ul>
     * <li><p><strong>voice</strong>: Speaker.</p>
     * </li>
     * <li><p><strong>volume</strong>: Volume. Value range: 0 to 100. Default value: 50.</p>
     * </li>
     * <li><p><strong>speechRate</strong>: Speech rate. Value range: -500 to 500. Default value: 0.</p>
     * </li>
     * <li><p><strong>pitchRate</strong>: Pitch rate. Value range: -500 to 500. Default value: 0.</p>
     * </li>
     * <li><p><strong>globalInterruptible</strong>: Voice interruption configuration.
     * -<strong>engine</strong>: Invoke service; [ali, volc, xunfei]. Large Language Model (LLM) scenarios do not support xunfei.</p>
     * </li>
     * <li><p><strong>nlsServiceType</strong>: Service type. [Managed, Authorized]</p>
     * </li>
     * <li><p><strong>engineXunfei</strong>: Configuration when the service provider is xunfei.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>1\. If you select ali as the engine and Authorized as the nlsServiceType, a custom service is used. 2. If the service provider is ali, and you select ali as the engine and Managed as the nlsServiceType, the default service is used. 3. If you select xunfei as the engine (applicable to small model scenarios) and Authorized as the nlsServiceType, xunfei is the service provider. You must enter the engineXunfei configuration: {&quot;pitchRate&quot;:50,&quot;speechRate&quot;:50,&quot;voice&quot;:&quot;aisjiuxu&quot;,&quot;volume&quot;:50}. 4. If you select volc as the engine and Authorized as the nlsServiceType, it applies to doubao.</p>
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

    public static CreateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScriptRequest self = new CreateScriptRequest();
        return TeaModel.build(map, self);
    }

    public CreateScriptRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CreateScriptRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateScriptRequest setAgentLlm(Boolean agentLlm) {
        this.agentLlm = agentLlm;
        return this;
    }
    public Boolean getAgentLlm() {
        return this.agentLlm;
    }

    public CreateScriptRequest setAsrConfig(String asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public String getAsrConfig() {
        return this.asrConfig;
    }

    public CreateScriptRequest setChatbotId(String chatbotId) {
        this.chatbotId = chatbotId;
        return this;
    }
    public String getChatbotId() {
        return this.chatbotId;
    }

    public CreateScriptRequest setEmotionEnable(Boolean emotionEnable) {
        this.emotionEnable = emotionEnable;
        return this;
    }
    public Boolean getEmotionEnable() {
        return this.emotionEnable;
    }

    public CreateScriptRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CreateScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateScriptRequest setLongWaitEnable(Boolean longWaitEnable) {
        this.longWaitEnable = longWaitEnable;
        return this;
    }
    public Boolean getLongWaitEnable() {
        return this.longWaitEnable;
    }

    public CreateScriptRequest setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
        this.miniPlaybackEnable = miniPlaybackEnable;
        return this;
    }
    public Boolean getMiniPlaybackEnable() {
        return this.miniPlaybackEnable;
    }

    public CreateScriptRequest setNewBargeInEnable(Boolean newBargeInEnable) {
        this.newBargeInEnable = newBargeInEnable;
        return this;
    }
    public Boolean getNewBargeInEnable() {
        return this.newBargeInEnable;
    }

    public CreateScriptRequest setNluAccessType(String nluAccessType) {
        this.nluAccessType = nluAccessType;
        return this;
    }
    public String getNluAccessType() {
        return this.nluAccessType;
    }

    public CreateScriptRequest setNluEngine(String nluEngine) {
        this.nluEngine = nluEngine;
        return this;
    }
    public String getNluEngine() {
        return this.nluEngine;
    }

    public CreateScriptRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateScriptRequest setScriptContent(java.util.List<String> scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }
    public java.util.List<String> getScriptContent() {
        return this.scriptContent;
    }

    public CreateScriptRequest setScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
        return this;
    }
    public String getScriptDescription() {
        return this.scriptDescription;
    }

    public CreateScriptRequest setScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }
    public String getScriptName() {
        return this.scriptName;
    }

    public CreateScriptRequest setScriptNluProfileJsonString(String scriptNluProfileJsonString) {
        this.scriptNluProfileJsonString = scriptNluProfileJsonString;
        return this;
    }
    public String getScriptNluProfileJsonString() {
        return this.scriptNluProfileJsonString;
    }

    public CreateScriptRequest setScriptWaveform(java.util.List<String> scriptWaveform) {
        this.scriptWaveform = scriptWaveform;
        return this;
    }
    public java.util.List<String> getScriptWaveform() {
        return this.scriptWaveform;
    }

    public CreateScriptRequest setTtsConfig(String ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public String getTtsConfig() {
        return this.ttsConfig;
    }

}
