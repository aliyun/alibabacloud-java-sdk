// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSDemoRequest extends TeaModel {
    /**
     * <p>The AccessKey ID of the namespace.</p>
     * <blockquote>
     * <p>When the engine is xunfei, you must enter the AccessKey ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5d0f37******<strong><strong>ef56db601</strong></strong></p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>The Alibaba Cloud custom voice, which is the voice invocation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>voice-e1be3a6</p>
     */
    @NameInMap("AliCustomizedVoice")
    public String aliCustomizedVoice;

    /**
     * <p>The speech service type. </p>
     * <ul>
     * <li><p>When <strong>ali</strong> is used as the custom service, this field stores the appKey of the interactive voice response product project.</p>
     * </li>
     * <li><p>When <strong>xunfei</strong> is used as the custom service provider, this field stores the corresponding appKey.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xusi*******RnP7</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The storage engine. Valid values: <strong>ali</strong>, <strong>volc</strong>, and <strong>xunfei</strong>.</p>
     * <ul>
     * <li>To use traditional voices, CosyVoice, or Alibaba Cloud as the custom service, enter <strong>ali</strong>.</li>
     * <li>To use the doubao service, enter <strong>volc</strong>.</li>
     * <li>To use xunfei as the service provider, enter <strong>xunfei</strong>. This option is only available for small model scenarios.</li>
     * <li>To use a self-managed service, enter <strong>dock</strong> and set NlsServiceType to Authorized.</li>
     * <li>To use CV-v3-flash and Qwen voices, enter <strong>bailian</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ali</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The extended parameters. When Engine is set to <strong>dock</strong>, you must enter the configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;thirdVoiceConfigUuid&quot;:&quot;3cd82813ece049c4aff3ea3d***********&quot;}</p>
     */
    @NameInMap("ExtParams")
    public String extParams;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a8eccb3c-2b26-4b6d-a54f-696b953e33a6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The service type.
     * Managed: the default service (public service) for the outbound robot product.
     * Authorized: the interactive voice response service purchased by public cloud customers (custom service). You can configure it in system administration &gt; Third-party Speech Configuration.</p>
     * <blockquote>
     * <p>When you need to use Alibaba Cloud interactive voice response, that is, when you use Alibaba Cloud as the custom service provider, you must enter Authorized.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Authorized</p>
     */
    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <p>The intonation.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PitchRate")
    public Integer pitchRate;

    /**
     * <p>The sample rate.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("SampleRate")
    public Integer sampleRate;

    /**
     * <p>The scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5ab2d935-306c-478a-88bf-d08e4e25c1b7</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The AccessKey secret of the namespace.</p>
     * <blockquote>
     * <p>When the engine is xunfei, you must enter the AccessKey secret.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OTdhNDE3Z****<strong><strong>zQ</strong></strong></p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>The speech rate.
     * Valid values: integers from -500 to 500. Default value: 0.</p>
     * <p>A value greater than 0 increases the pitch.</p>
     * <p>A value less than 0 decreases the pitch.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpeechRate")
    public Integer speechRate;

    /**
     * <p>The text content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The voice information, such as aixia, siyue, or xiaoyun. For the complete list of voices, refer to the voice list below.</p>
     * <blockquote>
     * <p>Because the Voice value for cloned voices is not fixed and is generated during voice cloning, a specific Voice value cannot be provided at this stage. You must obtain the specific Voice ID from the ListVoiceClone request on the voice cloning page.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <p>The volume.
     * Valid values: integers from 0 to 100. Default value: 50.</p>
     * <p>A value greater than 50 increases the volume.</p>
     * <p>A value less than 50 decreases the volume.</p>
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

    public DescribeTTSDemoRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
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

    public DescribeTTSDemoRequest setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Integer getSampleRate() {
        return this.sampleRate;
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
