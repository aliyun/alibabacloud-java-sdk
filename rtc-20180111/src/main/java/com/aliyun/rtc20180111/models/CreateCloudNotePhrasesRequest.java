// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateCloudNotePhrasesRequest extends TeaModel {
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
         * <strong>example:</strong>
         * <p>水果描述</p>
         */
        @NameInMap("Description")
        public String description;

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
