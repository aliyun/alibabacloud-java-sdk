// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ExportVocabularyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VocabularyIds")
    public java.util.List<String> vocabularyIds;

    public static ExportVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportVocabularyRequest self = new ExportVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public ExportVocabularyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportVocabularyRequest setVocabularyIds(java.util.List<String> vocabularyIds) {
        this.vocabularyIds = vocabularyIds;
        return this;
    }
    public java.util.List<String> getVocabularyIds() {
        return this.vocabularyIds;
    }

}
