// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateVocabularyShrinkRequest extends TeaModel {
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
    public String wordsShrink;

    public static UpdateVocabularyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVocabularyShrinkRequest self = new UpdateVocabularyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVocabularyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVocabularyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateVocabularyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVocabularyShrinkRequest setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public UpdateVocabularyShrinkRequest setWordsShrink(String wordsShrink) {
        this.wordsShrink = wordsShrink;
        return this;
    }
    public String getWordsShrink() {
        return this.wordsShrink;
    }

}
