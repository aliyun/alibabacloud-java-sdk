// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyCloudNotePhrasesRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query it in the console. Only a single ID is supported.</p>
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
    public ModifyCloudNotePhrasesRequestPhrase phrase;

    public static ModifyCloudNotePhrasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudNotePhrasesRequest self = new ModifyCloudNotePhrasesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudNotePhrasesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyCloudNotePhrasesRequest setPhrase(ModifyCloudNotePhrasesRequestPhrase phrase) {
        this.phrase = phrase;
        return this;
    }
    public ModifyCloudNotePhrasesRequestPhrase getPhrase() {
        return this.phrase;
    }

    public static class ModifyCloudNotePhrasesRequestPhraseWordWeights extends TeaModel {
        /**
         * <p>The weight. The value must be an integer in the range of [-6, 5].</p>
         * <ul>
         * <li>A value greater than 0 increases the probability of recognizing the word, and a value less than 0 decreases the probability.</li>
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

        public static ModifyCloudNotePhrasesRequestPhraseWordWeights build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudNotePhrasesRequestPhraseWordWeights self = new ModifyCloudNotePhrasesRequestPhraseWordWeights();
            return TeaModel.build(map, self);
        }

        public ModifyCloudNotePhrasesRequestPhraseWordWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ModifyCloudNotePhrasesRequestPhraseWordWeights setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class ModifyCloudNotePhrasesRequestPhrase extends TeaModel {
        /**
         * <p>The description. The description must be encoded in UTF-8 and be 1 to 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Fruit description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the hotword table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1qasw23ezcsrfsawq</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the hotword table. The name must be encoded in UTF-8 and be 1 to 30 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Fruit</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Each vocabulary can contain up to 300 hotwords. Each hotword can be up to 10 Chinese characters or 5 English words in length.</p>
         * <p>Hotwords must be encoded in UTF-8 and cannot contain punctuation marks or special characters. Otherwise, the hotwords do not take effect.</p>
         * <p>The weight of a hotword must be an integer in the range of [-6, 5].</p>
         * <p>Numbers in the text must be replaced with the corresponding Chinese characters based on their pronunciation. For example, &quot;59.9元&quot; must be replaced with &quot;五十九点九元&quot;.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("WordWeights")
        public java.util.List<ModifyCloudNotePhrasesRequestPhraseWordWeights> wordWeights;

        public static ModifyCloudNotePhrasesRequestPhrase build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudNotePhrasesRequestPhrase self = new ModifyCloudNotePhrasesRequestPhrase();
            return TeaModel.build(map, self);
        }

        public ModifyCloudNotePhrasesRequestPhrase setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyCloudNotePhrasesRequestPhrase setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyCloudNotePhrasesRequestPhrase setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyCloudNotePhrasesRequestPhrase setWordWeights(java.util.List<ModifyCloudNotePhrasesRequestPhraseWordWeights> wordWeights) {
            this.wordWeights = wordWeights;
            return this;
        }
        public java.util.List<ModifyCloudNotePhrasesRequestPhraseWordWeights> getWordWeights() {
            return this.wordWeights;
        }

    }

}
