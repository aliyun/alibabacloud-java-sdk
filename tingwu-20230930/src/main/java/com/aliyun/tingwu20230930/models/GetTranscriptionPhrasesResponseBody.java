// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class GetTranscriptionPhrasesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTranscriptionPhrasesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>35124E1C-AE99-5D6C-A52E-BD689D8D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTranscriptionPhrasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranscriptionPhrasesResponseBody self = new GetTranscriptionPhrasesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranscriptionPhrasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTranscriptionPhrasesResponseBody setData(GetTranscriptionPhrasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTranscriptionPhrasesResponseBodyData getData() {
        return this.data;
    }

    public GetTranscriptionPhrasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTranscriptionPhrasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTranscriptionPhrasesResponseBodyDataPhrases extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>custom fruit phrases list</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>fruit_phrase</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>a93b91141c0f422fa114af203f8b****</p>
         */
        @NameInMap("PhraseId")
        public String phraseId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;苹果&quot;:3,&quot;西瓜&quot;:3}</p>
         */
        @NameInMap("WordWeights")
        public String wordWeights;

        public static GetTranscriptionPhrasesResponseBodyDataPhrases build(java.util.Map<String, ?> map) throws Exception {
            GetTranscriptionPhrasesResponseBodyDataPhrases self = new GetTranscriptionPhrasesResponseBodyDataPhrases();
            return TeaModel.build(map, self);
        }

        public GetTranscriptionPhrasesResponseBodyDataPhrases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTranscriptionPhrasesResponseBodyDataPhrases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTranscriptionPhrasesResponseBodyDataPhrases setPhraseId(String phraseId) {
            this.phraseId = phraseId;
            return this;
        }
        public String getPhraseId() {
            return this.phraseId;
        }

        public GetTranscriptionPhrasesResponseBodyDataPhrases setWordWeights(String wordWeights) {
            this.wordWeights = wordWeights;
            return this;
        }
        public String getWordWeights() {
            return this.wordWeights;
        }

    }

    public static class GetTranscriptionPhrasesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Phrases")
        public java.util.List<GetTranscriptionPhrasesResponseBodyDataPhrases> phrases;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetTranscriptionPhrasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTranscriptionPhrasesResponseBodyData self = new GetTranscriptionPhrasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTranscriptionPhrasesResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetTranscriptionPhrasesResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetTranscriptionPhrasesResponseBodyData setPhrases(java.util.List<GetTranscriptionPhrasesResponseBodyDataPhrases> phrases) {
            this.phrases = phrases;
            return this;
        }
        public java.util.List<GetTranscriptionPhrasesResponseBodyDataPhrases> getPhrases() {
            return this.phrases;
        }

        public GetTranscriptionPhrasesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
