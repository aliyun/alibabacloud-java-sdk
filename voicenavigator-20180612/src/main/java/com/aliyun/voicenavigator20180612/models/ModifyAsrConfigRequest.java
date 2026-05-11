// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyAsrConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>your_app_key</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrAcousticModelId")
    public String asrAcousticModelId;

    /**
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrClassVocabularyId")
    public String asrClassVocabularyId;

    /**
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrCustomizationId")
    public String asrCustomizationId;

    @NameInMap("AsrOverrides")
    public String asrOverrides;

    /**
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("AsrVocabularyId")
    public String asrVocabularyId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <strong>example:</strong>
     * <p>语音识别</p>
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
