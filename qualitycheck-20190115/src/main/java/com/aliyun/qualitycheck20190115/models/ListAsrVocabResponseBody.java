// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListAsrVocabResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAsrVocabResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>66E1ACB8-17B2-4BE8-8581-954A8EE1324B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAsrVocabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsrVocabResponseBody self = new ListAsrVocabResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsrVocabResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAsrVocabResponseBody setData(ListAsrVocabResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAsrVocabResponseBodyData getData() {
        return this.data;
    }

    public ListAsrVocabResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAsrVocabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsrVocabResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAsrVocabResponseBodyDataAsrVocab extends TeaModel {
        @NameInMap("AsrVersion")
        public Integer asrVersion;

        /**
         * <strong>example:</strong>
         * <p>2019-04-15T14:57Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("ModelCustomizationId")
        public String modelCustomizationId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2019-04-15T14:57Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>a01daaaxxxxxxxxx</p>
         */
        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static ListAsrVocabResponseBodyDataAsrVocab build(java.util.Map<String, ?> map) throws Exception {
            ListAsrVocabResponseBodyDataAsrVocab self = new ListAsrVocabResponseBodyDataAsrVocab();
            return TeaModel.build(map, self);
        }

        public ListAsrVocabResponseBodyDataAsrVocab setAsrVersion(Integer asrVersion) {
            this.asrVersion = asrVersion;
            return this;
        }
        public Integer getAsrVersion() {
            return this.asrVersion;
        }

        public ListAsrVocabResponseBodyDataAsrVocab setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAsrVocabResponseBodyDataAsrVocab setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAsrVocabResponseBodyDataAsrVocab setModelCustomizationId(String modelCustomizationId) {
            this.modelCustomizationId = modelCustomizationId;
            return this;
        }
        public String getModelCustomizationId() {
            return this.modelCustomizationId;
        }

        public ListAsrVocabResponseBodyDataAsrVocab setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAsrVocabResponseBodyDataAsrVocab setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAsrVocabResponseBodyDataAsrVocab setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

    public static class ListAsrVocabResponseBodyData extends TeaModel {
        @NameInMap("AsrVocab")
        public java.util.List<ListAsrVocabResponseBodyDataAsrVocab> asrVocab;

        public static ListAsrVocabResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAsrVocabResponseBodyData self = new ListAsrVocabResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAsrVocabResponseBodyData setAsrVocab(java.util.List<ListAsrVocabResponseBodyDataAsrVocab> asrVocab) {
            this.asrVocab = asrVocab;
            return this;
        }
        public java.util.List<ListAsrVocabResponseBodyDataAsrVocab> getAsrVocab() {
            return this.asrVocab;
        }

    }

}
