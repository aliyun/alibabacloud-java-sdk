// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetAsrConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAsrConfigResponseBodyData data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAsrConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAsrConfigResponseBody self = new GetAsrConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAsrConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAsrConfigResponseBody setData(GetAsrConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAsrConfigResponseBodyData getData() {
        return this.data;
    }

    public GetAsrConfigResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetAsrConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAsrConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAsrConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAsrConfigResponseBodyData extends TeaModel {
        @NameInMap("AsrAcousticModelId")
        public String asrAcousticModelId;

        @NameInMap("AsrClassVocabularyId")
        public String asrClassVocabularyId;

        @NameInMap("AsrCustomizationId")
        public String asrCustomizationId;

        @NameInMap("AsrVocabularyId")
        public String asrVocabularyId;

        public static GetAsrConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsrConfigResponseBodyData self = new GetAsrConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsrConfigResponseBodyData setAsrAcousticModelId(String asrAcousticModelId) {
            this.asrAcousticModelId = asrAcousticModelId;
            return this;
        }
        public String getAsrAcousticModelId() {
            return this.asrAcousticModelId;
        }

        public GetAsrConfigResponseBodyData setAsrClassVocabularyId(String asrClassVocabularyId) {
            this.asrClassVocabularyId = asrClassVocabularyId;
            return this;
        }
        public String getAsrClassVocabularyId() {
            return this.asrClassVocabularyId;
        }

        public GetAsrConfigResponseBodyData setAsrCustomizationId(String asrCustomizationId) {
            this.asrCustomizationId = asrCustomizationId;
            return this;
        }
        public String getAsrCustomizationId() {
            return this.asrCustomizationId;
        }

        public GetAsrConfigResponseBodyData setAsrVocabularyId(String asrVocabularyId) {
            this.asrVocabularyId = asrVocabularyId;
            return this;
        }
        public String getAsrVocabularyId() {
            return this.asrVocabularyId;
        }

    }

}
