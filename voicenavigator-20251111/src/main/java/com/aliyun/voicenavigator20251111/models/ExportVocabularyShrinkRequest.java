// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ExportVocabularyShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VocabularyIds")
    public String vocabularyIdsShrink;

    public static ExportVocabularyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportVocabularyShrinkRequest self = new ExportVocabularyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExportVocabularyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportVocabularyShrinkRequest setVocabularyIdsShrink(String vocabularyIdsShrink) {
        this.vocabularyIdsShrink = vocabularyIdsShrink;
        return this;
    }
    public String getVocabularyIdsShrink() {
        return this.vocabularyIdsShrink;
    }

}
