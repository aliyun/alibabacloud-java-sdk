// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudNotePhrasesResponseBody extends TeaModel {
    /**
     * <p>The hotword lists.</p>
     */
    @NameInMap("Phrases")
    public java.util.List<DescribeCloudNotePhrasesResponseBodyPhrases> phrases;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3A26E1E3-3CBB-599E-AD68-CB78F5A42FA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Long totalPage;

    public static DescribeCloudNotePhrasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudNotePhrasesResponseBody self = new DescribeCloudNotePhrasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudNotePhrasesResponseBody setPhrases(java.util.List<DescribeCloudNotePhrasesResponseBodyPhrases> phrases) {
        this.phrases = phrases;
        return this;
    }
    public java.util.List<DescribeCloudNotePhrasesResponseBodyPhrases> getPhrases() {
        return this.phrases;
    }

    public DescribeCloudNotePhrasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudNotePhrasesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public DescribeCloudNotePhrasesResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights extends TeaModel {
        /**
         * <p>The weight value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <p>The hotword.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple</p>
         */
        @NameInMap("Word")
        public String word;

        public static DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights self = new DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights();
            return TeaModel.build(map, self);
        }

        public DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class DescribeCloudNotePhrasesResponseBodyPhrases extends TeaModel {
        /**
         * <p>The creation time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-04T06:22:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Fruit description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The hotword list ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1qweadca332121212</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The hotword list name.</p>
         * 
         * <strong>example:</strong>
         * <p>Fruit</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The hotword weights.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("WordWeights")
        public java.util.List<DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights> wordWeights;

        public static DescribeCloudNotePhrasesResponseBodyPhrases build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudNotePhrasesResponseBodyPhrases self = new DescribeCloudNotePhrasesResponseBodyPhrases();
            return TeaModel.build(map, self);
        }

        public DescribeCloudNotePhrasesResponseBodyPhrases setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCloudNotePhrasesResponseBodyPhrases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCloudNotePhrasesResponseBodyPhrases setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeCloudNotePhrasesResponseBodyPhrases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCloudNotePhrasesResponseBodyPhrases setWordWeights(java.util.List<DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights> wordWeights) {
            this.wordWeights = wordWeights;
            return this;
        }
        public java.util.List<DescribeCloudNotePhrasesResponseBodyPhrasesWordWeights> getWordWeights() {
            return this.wordWeights;
        }

    }

}
