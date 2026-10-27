// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateVocabularyRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Contains professional terms for finance scenarios</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the hot word.</p>
     * 
     * <strong>example:</strong>
     * <p>Finance scenario hot words</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The hot word ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4061</p>
     */
    @NameInMap("VocabularyId")
    public String vocabularyId;

    /**
     * <p>The list of hot words.</p>
     */
    @NameInMap("Words")
    public java.util.Map<String, String> words;

    public static UpdateVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVocabularyRequest self = new UpdateVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVocabularyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVocabularyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateVocabularyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVocabularyRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public UpdateVocabularyRequest setWords(java.util.Map<String, String> words) {
        this.words = words;
        return this;
    }
    public java.util.Map<String, String> getWords() {
        return this.words;
    }

}
