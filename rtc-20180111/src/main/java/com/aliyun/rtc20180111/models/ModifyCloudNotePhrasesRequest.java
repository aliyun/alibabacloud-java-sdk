// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyCloudNotePhrasesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ac7N****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>苹果</p>
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
         * <strong>example:</strong>
         * <p>水果描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1qasw23ezcsrfsawq</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>水果</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
