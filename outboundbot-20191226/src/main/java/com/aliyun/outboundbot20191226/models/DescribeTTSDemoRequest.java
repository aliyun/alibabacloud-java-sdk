// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSDemoRequest extends TeaModel {
    /**
     * <p>The AccessKey (AK) for this namespace.</p>
     * <blockquote>
     * <p>When the engine is set to xunfei, you must enter the AK.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5d0f37******<strong><strong>ef56db601</strong></strong></p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>Alibaba Cloud customized voice, which is the voice call ID.</p>
     * 
     * <strong>example:</strong>
     * <p>voice-e1be3a6</p>
     */
    @NameInMap("AliCustomizedVoice")
    public String aliCustomizedVoice;

    /**
     * <p>Voice service type.</p>
     * <ul>
     * <li><p>When using <strong>ali</strong> as the custom service, this field stores the appKey of the Intelligent Speech Interaction product project.</p>
     * </li>
     * <li><p>When using <strong>xunfei</strong> as the custom service provider, this field stores the corresponding appKey.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xusi*******RnP7</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>Storage engine. Valid values: ali, volc, and xunfei.</p>
     * <ul>
     * <li><p>When using the default service or selecting Alibaba Cloud as the custom service, set this parameter to <strong>ali</strong>.</p>
     * </li>
     * <li><p>When using the Doubao service, set this parameter to <strong>volc</strong>.</p>
     * </li>
     * <li><p>When using xunfei as the service provider, set this parameter to <strong>xunfei</strong>. This value can only be used in small model scenarios.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ali</p>
     */
    @NameInMap("Engine")
    public String engine;

    @NameInMap("ExtParams")
    public String extParams;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a8eccb3c-2b26-4b6d-a54f-696b953e33a6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Service type.
     * Managed: The default Intelligent Speech Interaction product service of the Outbound Bot product (public service).
     * Authorized: The Intelligent Speech Interaction product service purchased by the public cloud customer (customer\&quot;s private service), authorized through Script Management &gt; Edit &gt; Call Service &gt; Custom Service.</p>
     * <blockquote>
     * <p>When using Alibaba Cloud Intelligent Speech Interaction, that is, when using Alibaba Cloud as the custom service provider, set this parameter to Authorized.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Authorized</p>
     */
    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    /**
     * <p>Pitch.
     * An integer between [-500, 500]. Default value: 0.</p>
     * <p>A value greater than 0 indicates a higher pitch.</p>
     * <p>A value less than 0 indicates a lower pitch.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PitchRate")
    public Integer pitchRate;

    /**
     * <p>Script ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5ab2d935-306c-478a-88bf-d08e4e25c1b7</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <p>The AccessKey Secret (SK) for this namespace.</p>
     * <blockquote>
     * <p>When the engine is set to xunfei, you must enter the SK.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OTdhNDE3Z****<strong><strong>zQ</strong></strong></p>
     */
    @NameInMap("SecretKey")
    public String secretKey;

    /**
     * <p>Speech rate.
     * An integer between [-500, 500]. Default value: 0.</p>
     * <p>A value greater than 0 indicates a faster speech rate.</p>
     * <p>A value less than 0 indicates a slower speech rate.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SpeechRate")
    public Integer speechRate;

    /**
     * <p>Text content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>Voice information, such as aixia, siyue, or xiaoyun. For the complete list of available voices, refer to the voice list below.</p>
     * <blockquote>
     * <p>Because the Voice value of a cloned voice is a unique, non-fixed value generated during voice cloning, the specific Voice value cannot be provided at this stage. You must obtain the specific VoiceID from the voice cloning page by calling the ListVoiceClone API.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aixia</p>
     */
    @NameInMap("Voice")
    public String voice;

    /**
     * <p>Volume.
     * An integer between [0, 100]. Default value: 50.</p>
     * <p>A value greater than 50 indicates a higher volume.</p>
     * <p>A value less than 50 indicates a lower volume.</p>
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
