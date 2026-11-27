// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateCloudNotePhrasesRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query application IDs in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The hotword parameter.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Phrase")
    public CreateCloudNotePhrasesRequestPhrase phrase;

    public static CreateCloudNotePhrasesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudNotePhrasesRequest self = new CreateCloudNotePhrasesRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudNotePhrasesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCloudNotePhrasesRequest setPhrase(CreateCloudNotePhrasesRequestPhrase phrase) {
        this.phrase = phrase;
        return this;
    }
    public CreateCloudNotePhrasesRequestPhrase getPhrase() {
        return this.phrase;
    }

    public static class CreateCloudNotePhrasesRequestPhraseWordWeights extends TeaModel {
        /**
         * <p>The weight must be an integer in the range of [-6, 5].</p>
         * <ul>
         * <li>A value greater than 0 increases the probability of the word being recognized, and a value less than 0 decreases the probability.</li>
         * <li>A value of -6 indicates that the word should not be recognized if possible.</li>
         * <li>A value of 2 is a common value.
         * If the effect is not obvious, you can increase the weight. However, a large weight may cause negative effects and lead to inaccurate recognition of other words.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <p>The hotword.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple</p>
         */
        @NameInMap("Word")
        public String word;

        public static CreateCloudNotePhrasesRequestPhraseWordWeights build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudNotePhrasesRequestPhraseWordWeights self = new CreateCloudNotePhrasesRequestPhraseWordWeights();
            return TeaModel.build(map, self);
        }

        public CreateCloudNotePhrasesRequestPhraseWordWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateCloudNotePhrasesRequestPhraseWordWeights setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class CreateCloudNotePhrasesRequestPhrase extends TeaModel {
        /**
         * <p>The description. The description must be encoded in UTF-8 and be 1 to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Fruit description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the hotword table. The name must be encoded in UTF-8 and be 1 to 30 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Fruits</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Each hotword table can contain up to 300 hotwords, and each hotword can be up to 10 Chinese characters in length.</p>
         * <p>Hotwords must be encoded in UTF-8 and cannot contain punctuation marks or special characters. Otherwise, the hotwords do not take effect.</p>
         * <p>The weight of a hotword must be an integer in the range of [-6, 5].</p>
         * <p>Numbers in the text must be replaced with the corresponding Chinese characters based on their pronunciation. For example, &quot;59.9元&quot; must be replaced with &quot;五十九点九元&quot;.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("WordWeights")
        public java.util.List<CreateCloudNotePhrasesRequestPhraseWordWeights> wordWeights;

        public static CreateCloudNotePhrasesRequestPhrase build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudNotePhrasesRequestPhrase self = new CreateCloudNotePhrasesRequestPhrase();
            return TeaModel.build(map, self);
        }

        public CreateCloudNotePhrasesRequestPhrase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateCloudNotePhrasesRequestPhrase setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCloudNotePhrasesRequestPhrase setWordWeights(java.util.List<CreateCloudNotePhrasesRequestPhraseWordWeights> wordWeights) {
            this.wordWeights = wordWeights;
            return this;
        }
        public java.util.List<CreateCloudNotePhrasesRequestPhraseWordWeights> getWordWeights() {
            return this.wordWeights;
        }

    }

}
