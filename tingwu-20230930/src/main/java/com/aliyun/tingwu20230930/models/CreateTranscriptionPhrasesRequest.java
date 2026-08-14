// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class CreateTranscriptionPhrasesRequest extends TeaModel {
    /**
     * <p>The description of the phrases list.</p>
     * 
     * <strong>example:</strong>
     * <p>custom fruit phrases list</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the phrases list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fruit_phrase</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A JSON-formatted string that represents a map of words and their corresponding weights.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;苹果&quot;:3,&quot;西瓜&quot;:3}</p>
     */
    @NameInMap("WordWeights")
    public String wordWeights;

    public static CreateTranscriptionPhrasesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTranscriptionPhrasesRequest self = new CreateTranscriptionPhrasesRequest();
        return TeaModel.build(map, self);
    }

    public CreateTranscriptionPhrasesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTranscriptionPhrasesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTranscriptionPhrasesRequest setWordWeights(String wordWeights) {
        this.wordWeights = wordWeights;
        return this;
    }
    public String getWordWeights() {
        return this.wordWeights;
    }

}
