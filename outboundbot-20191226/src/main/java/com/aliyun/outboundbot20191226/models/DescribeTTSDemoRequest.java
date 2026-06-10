// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSDemoRequest extends TeaModel {
    /**
     * <p>The AccessKey (AK) for this namespace.</p>
     * <blockquote>
     * <p>Enter the AK when the engine is xunfei.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5d0f37******<strong><strong>ef56db601</strong></strong></p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>Alibaba Cloud custom voice ID</p>
     * 
     * <strong>example:</strong>
     * <p>voice-e1be3a6</p>
     */
    @NameInMap("AliCustomizedVoice")
    public String aliCustomizedVoice;

    /**
     * <p>Speech service type</p>
     * <ul>
     * <li><p>When using <strong>ali</strong> as a custom service, enter the appKey of your Intelligent Speech Interaction project.</p>
     * </li>
     * <li><p>When using <strong>xunfei</strong> as a custom service, enter its appKey.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xusi*******RnP7</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>Storage engine. Choose from ali, volc, or xunfei.</p>
     * <ul>
     * <li><p>Enter <strong>ali</strong> when using the default service or Alibaba Cloud as a custom service.</p>
     * </li>
     * <li><p>Enter <strong>volc</strong> when using the doubao service.</p>
     * </li>
     * <li><p>Enter <strong>xunfei</strong> when using iFLYTEK as a service provider. This option is only available for small-model scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ali</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a8eccb3c-2b26-4b6d-a54f-696b953e33a6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Service type
     * Managed: The default Intelligent Speech Interaction service for Intelligent Outbound Calling (public service).
     * Authorized: An Intelligent Speech Interaction service you purchased on Alibaba Cloud public cloud (your private service). You can grant authorization by going to Scenario Management &gt; Edit &gt; Call Service &gt; Custom Service.</p>
     * <blockquote>
     * <p>Set this parameter to Authorized when using Alibaba Cloud\&quot;s Intelligent Speech Interaction as your custom service provider.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Authorized</p>
     */
    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <p>Pitch. An integer between -500 and 500. Default is 0.</p>
     * <p>A value greater than 0 raises pitch.</p>
     * <p>A value less than 0 lowers pitch.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PitchRate")
    public Integer pitchRate;

    /**
     * <p>Scenario ID</p>
     * 
     * <strong>example:</strong>
     * <p>5ab2d935-306c-478a-88bf-d08e4e25c1b7</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The AccessKey secret (SK) for this namespace.</p>
     * <blockquote>
     * <p>Enter the SK when the engine is xunfei.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OTdhNDE3Z****<strong><strong>zQ</strong></strong></p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>Speech rate. An integer between -500 and 500. Default is 0.</p>
     * <p>A value greater than 0 increases speech speed.</p>
     * <p>A value less than 0 decreases speech speed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpeechRate")
    public Integer speechRate;

    /**
     * <p>Text to convert to speech</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>Voice ID. Examples include aixia, siyue, and xiaoyun. For the full list of available voices, see the voice list below.</p>
     * <blockquote>
     * <p>Cloned voices use dynamic Voice IDs that are generated during voice cloning. Therefore, specific Voice IDs for cloned voices are not listed here. To get a cloned voice’s Voice ID, call ListVoiceClone from the voice cloning page.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <p>Volume. An integer between 0 and 100. Default is 50.</p>
     * <p>A value greater than 50 increases volume.</p>
     * <p>A value less than 50 decreases volume.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Volume")
    public Integer volume;

    public static DescribeTTSDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSDemoRequest self = new DescribeTTSDemoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTTSDemoRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public DescribeTTSDemoRequest setAliCustomizedVoice(String aliCustomizedVoice) {
        this.aliCustomizedVoice = aliCustomizedVoice;
        return this;
    }
    public String getAliCustomizedVoice() {
        return this.aliCustomizedVoice;
    }

    public DescribeTTSDemoRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeTTSDemoRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeTTSDemoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTTSDemoRequest setNlsServiceType(String nlsServiceType) {
        this.nlsServiceType = nlsServiceType;
        return this;
    }
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

    public DescribeTTSDemoRequest setPitchRate(Integer pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    public DescribeTTSDemoRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public DescribeTTSDemoRequest setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public DescribeTTSDemoRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public DescribeTTSDemoRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public DescribeTTSDemoRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public DescribeTTSDemoRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}
