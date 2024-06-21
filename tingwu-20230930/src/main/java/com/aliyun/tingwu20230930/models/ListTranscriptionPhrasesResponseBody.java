// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class ListTranscriptionPhrasesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTranscriptionPhrasesResponseBodyData data;

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

    public static ListTranscriptionPhrasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTranscriptionPhrasesResponseBody self = new ListTranscriptionPhrasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTranscriptionPhrasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTranscriptionPhrasesResponseBody setData(ListTranscriptionPhrasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTranscriptionPhrasesResponseBodyData getData() {
        return this.data;
    }

    public ListTranscriptionPhrasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTranscriptionPhrasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTranscriptionPhrasesResponseBodyDataPhrases extends TeaModel {
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

        public static ListTranscriptionPhrasesResponseBodyDataPhrases build(java.util.Map<String, ?> map) throws Exception {
            ListTranscriptionPhrasesResponseBodyDataPhrases self = new ListTranscriptionPhrasesResponseBodyDataPhrases();
            return TeaModel.build(map, self);
        }

        public ListTranscriptionPhrasesResponseBodyDataPhrases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTranscriptionPhrasesResponseBodyDataPhrases setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTranscriptionPhrasesResponseBodyDataPhrases setPhraseId(String phraseId) {
            this.phraseId = phraseId;
            return this;
        }
        public String getPhraseId() {
            return this.phraseId;
        }

    }

    public static class ListTranscriptionPhrasesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PHS.Exceed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>The num of the phrase exceeds the upper limit.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Phrases")
        public java.util.List<ListTranscriptionPhrasesResponseBodyDataPhrases> phrases;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListTranscriptionPhrasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTranscriptionPhrasesResponseBodyData self = new ListTranscriptionPhrasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTranscriptionPhrasesResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListTranscriptionPhrasesResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListTranscriptionPhrasesResponseBodyData setPhrases(java.util.List<ListTranscriptionPhrasesResponseBodyDataPhrases> phrases) {
            this.phrases = phrases;
            return this;
        }
        public java.util.List<ListTranscriptionPhrasesResponseBodyDataPhrases> getPhrases() {
            return this.phrases;
        }

        public ListTranscriptionPhrasesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
