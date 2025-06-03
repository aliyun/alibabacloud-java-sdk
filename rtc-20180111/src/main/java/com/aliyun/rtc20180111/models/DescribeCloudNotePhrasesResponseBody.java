// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudNotePhrasesResponseBody extends TeaModel {
    @NameInMap("Phrases")
    public java.util.List<DescribeCloudNotePhrasesResponseBodyPhrases> phrases;

    /**
     * <p>Id of the request。</p>
     * 
     * <strong>example:</strong>
     * <p>3A26E1E3-3CBB-599E-AD68-CB78F5A42FA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        /**
         * <strong>example:</strong>
         * <p>苹果</p>
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
         * <strong>example:</strong>
         * <p>2025-03-04T06:22:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>水果描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1qweadca332121212</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>水果</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
