// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateVocabularyRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Contains financial industry terminology</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The hotword name.</p>
     * 
     * <strong>example:</strong>
     * <p>Financial industry hotwords</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of hotwords.</p>
     */
    @NameInMap("Words")
    public java.util.Map<String, String> words;

    public static CreateVocabularyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabularyRequest self = new CreateVocabularyRequest();
        return TeaModel.build(map, self);
    }

    public CreateVocabularyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVocabularyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVocabularyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVocabularyRequest setWords(java.util.Map<String, String> words) {
        this.words = words;
        return this;
    }
    public java.util.Map<String, String> getWords() {
        return this.words;
    }

}
