// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyAsrConfigRequest extends TeaModel {
    /**
     * <p>The AppKey of the engine.</p>
     * 
     * <strong>example:</strong>
     * <p>your_app_key</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The ASR acoustic model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrAcousticModelId")
    public String asrAcousticModelId;

    /**
     * <p>The ASR hotword ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrClassVocabularyId")
    public String asrClassVocabularyId;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrCustomizationId")
    public String asrCustomizationId;

    @NameInMap("AsrOverrides")
    public String asrOverrides;

    /**
     * <p>The ASR error correction dictionary ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94001ae8-72fd-4f93-84dc-e58e2b20363b</p>
     */
    @NameInMap("AsrOverridesUuid")
    public String asrOverridesUuid;

    /**
     * <p>The hotword ID. You can view the ASR hotword ID on the <a href="https://aiccs.console.aliyun.com/sentence/vocab?spm=a2c4g.11186623.0.0.7f9bf965IKBpsi">ASR Hotword Management page</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrVocabularyId")
    public String asrVocabularyId;

    /**
     * <p>The policy level. Valid values:</p>
     * <ul>
     * <li>0: system.</li>
     * <li>1: tenant.</li>
     * <li>2: instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    /**
     * <p>The TTS engine.</p>
     * 
     * <strong>example:</strong>
     * <p>ali</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The iFLYTEK ASR configuration parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Uuid&quot;:&quot;b06c4ed3-a5e3-4c55-92b7-c2d2a88ca37f&quot;}</p>
     */
    @NameInMap("EngineXunfei")
    public String engineXunfei;

    /**
     * <p>The entity ID corresponding to config_level.</p>
     * 
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <p>NluServiceType</p>
     * 
     * <strong>example:</strong>
     * <p>Speech Recognition</p>
     */
    @NameInMap("NlsServiceType")
    public String nlsServiceType;

    public static ModifyAsrConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAsrConfigRequest self = new ModifyAsrConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAsrConfigRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ModifyAsrConfigRequest setAsrAcousticModelId(String asrAcousticModelId) {
        this.asrAcousticModelId = asrAcousticModelId;
        return this;
    }
    public String getAsrAcousticModelId() {
        return this.asrAcousticModelId;
    }

    public ModifyAsrConfigRequest setAsrClassVocabularyId(String asrClassVocabularyId) {
        this.asrClassVocabularyId = asrClassVocabularyId;
        return this;
    }
    public String getAsrClassVocabularyId() {
        return this.asrClassVocabularyId;
    }

    public ModifyAsrConfigRequest setAsrCustomizationId(String asrCustomizationId) {
        this.asrCustomizationId = asrCustomizationId;
        return this;
    }
    public String getAsrCustomizationId() {
        return this.asrCustomizationId;
    }

    public ModifyAsrConfigRequest setAsrOverrides(String asrOverrides) {
        this.asrOverrides = asrOverrides;
        return this;
    }
    public String getAsrOverrides() {
        return this.asrOverrides;
    }

    public ModifyAsrConfigRequest setAsrOverridesUuid(String asrOverridesUuid) {
        this.asrOverridesUuid = asrOverridesUuid;
        return this;
    }
    public String getAsrOverridesUuid() {
        return this.asrOverridesUuid;
    }

    public ModifyAsrConfigRequest setAsrVocabularyId(String asrVocabularyId) {
        this.asrVocabularyId = asrVocabularyId;
        return this;
    }
    public String getAsrVocabularyId() {
        return this.asrVocabularyId;
    }

    public ModifyAsrConfigRequest setConfigLevel(Integer configLevel) {
        this.configLevel = configLevel;
        return this;
    }
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    public ModifyAsrConfigRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ModifyAsrConfigRequest setEngineXunfei(String engineXunfei) {
        this.engineXunfei = engineXunfei;
        return this;
    }
    public String getEngineXunfei() {
        return this.engineXunfei;
    }

    public ModifyAsrConfigRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public ModifyAsrConfigRequest setNlsServiceType(String nlsServiceType) {
        this.nlsServiceType = nlsServiceType;
        return this;
    }
    public String getNlsServiceType() {
        return this.nlsServiceType;
    }

}
