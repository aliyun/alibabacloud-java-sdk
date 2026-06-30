// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAsrVocabResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> means success. Any other value means failure. Use this field to identify the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetAsrVocabResponseBodyData data;

    /**
     * <p>Error details if the request fails. If successful, the value is <strong>successful</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Use this field to check the result:</p>
     * <ul>
     * <li><p><strong>true</strong> means success</p>
     * </li>
     * <li><p>false or <strong>null</strong> means failure</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAsrVocabResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsrVocabResponseBody self = new GetAsrVocabResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsrVocabResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAsrVocabResponseBody setData(GetAsrVocabResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsrVocabResponseBodyData getData() {
        return this.data;
    }

    public GetAsrVocabResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAsrVocabResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsrVocabResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsrVocabResponseBodyDataWordsWord extends TeaModel {
        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Word")
        public String word;

        public static GetAsrVocabResponseBodyDataWordsWord build(java.util.Map<String, ?> map) throws Exception {
            GetAsrVocabResponseBodyDataWordsWord self = new GetAsrVocabResponseBodyDataWordsWord();
            return TeaModel.build(map, self);
        }

        public GetAsrVocabResponseBodyDataWordsWord setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public GetAsrVocabResponseBodyDataWordsWord setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class GetAsrVocabResponseBodyDataWords extends TeaModel {
        @NameInMap("Word")
        public java.util.List<GetAsrVocabResponseBodyDataWordsWord> word;

        public static GetAsrVocabResponseBodyDataWords build(java.util.Map<String, ?> map) throws Exception {
            GetAsrVocabResponseBodyDataWords self = new GetAsrVocabResponseBodyDataWords();
            return TeaModel.build(map, self);
        }

        public GetAsrVocabResponseBodyDataWords setWord(java.util.List<GetAsrVocabResponseBodyDataWordsWord> word) {
            this.word = word;
            return this;
        }
        public java.util.List<GetAsrVocabResponseBodyDataWordsWord> getWord() {
            return this.word;
        }

    }

    public static class GetAsrVocabResponseBodyData extends TeaModel {
        /**
         * <p>The ASR version.</p>
         * <ul>
         * <li><p>2 or <strong>null</strong>: V2 (Intelligent Speech Interaction ASR)</p>
         * </li>
         * <li><p><strong>3</strong>: V3 (Paraformer ASR)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AsrVersion")
        public Integer asrVersion;

        /**
         * <p>The language model ID. This field appears only for V3.</p>
         * 
         * <strong>example:</strong>
         * <p>paraformer-8k-v2</p>
         */
        @NameInMap("ModelCustomizationId")
        public String modelCustomizationId;

        /**
         * <p>The hotword group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Words")
        public GetAsrVocabResponseBodyDataWords words;

        public static GetAsrVocabResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsrVocabResponseBodyData self = new GetAsrVocabResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsrVocabResponseBodyData setAsrVersion(Integer asrVersion) {
            this.asrVersion = asrVersion;
            return this;
        }
        public Integer getAsrVersion() {
            return this.asrVersion;
        }

        public GetAsrVocabResponseBodyData setModelCustomizationId(String modelCustomizationId) {
            this.modelCustomizationId = modelCustomizationId;
            return this;
        }
        public String getModelCustomizationId() {
            return this.modelCustomizationId;
        }

        public GetAsrVocabResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAsrVocabResponseBodyData setWords(GetAsrVocabResponseBodyDataWords words) {
            this.words = words;
            return this;
        }
        public GetAsrVocabResponseBodyDataWords getWords() {
            return this.words;
        }

    }

}
