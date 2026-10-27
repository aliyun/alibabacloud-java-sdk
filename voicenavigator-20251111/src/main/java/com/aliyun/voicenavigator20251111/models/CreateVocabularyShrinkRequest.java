// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateVocabularyShrinkRequest extends TeaModel {
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
    public String wordsShrink;

    public static CreateVocabularyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVocabularyShrinkRequest self = new CreateVocabularyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVocabularyShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVocabularyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVocabularyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVocabularyShrinkRequest setWordsShrink(String wordsShrink) {
        this.wordsShrink = wordsShrink;
        return this;
    }
    public String getWordsShrink() {
        return this.wordsShrink;
    }

}
