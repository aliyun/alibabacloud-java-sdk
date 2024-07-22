// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyAsrConfigRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>6cc9f5ca-2cb6-4cc7-a46b-2bbfd3e61b22</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    public static ModifyAsrConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAsrConfigRequest self = new ModifyAsrConfigRequest();
        return TeaModel.build(map, self);
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

    public ModifyAsrConfigRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

}
