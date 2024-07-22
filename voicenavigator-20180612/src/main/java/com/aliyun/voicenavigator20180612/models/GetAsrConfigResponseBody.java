// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetAsrConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAsrConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Not Found</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        @NameInMap("AsrAcousticModelId")
        public String asrAcousticModelId;

        /**
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        @NameInMap("AsrClassVocabularyId")
        public String asrClassVocabularyId;

        /**
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        @NameInMap("AsrCustomizationId")
        public String asrCustomizationId;

        /**
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
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
