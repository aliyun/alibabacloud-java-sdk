// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetAsrConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAsrConfigResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Not Found</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>The engine.</p>
         * 
         * <strong>example:</strong>
         * <p>your-app-key</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>The ASR acoustic model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        @NameInMap("AsrAcousticModelId")
        public String asrAcousticModelId;

        /**
         * <p>The ASR hotword ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        @NameInMap("AsrClassVocabularyId")
        public String asrClassVocabularyId;

        /**
         * <p>The ASR dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        @NameInMap("AsrCustomizationId")
        public String asrCustomizationId;

        @NameInMap("AsrOverrides")
        public String asrOverrides;

        /**
         * <p>The hotword ID. You can view the ASR hotword ID on the <a href="https://aiccs.console.aliyun.com/sentence/vocab?spm=a2c4g.11186623.0.0.7f9bf965IKBpsi">ASR Hotword Management page</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        @NameInMap("AsrVocabularyId")
        public String asrVocabularyId;

        /**
         * <p>The speech engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ali</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The iFLYTEK engine parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>EngineXufei</p>
         */
        @NameInMap("EngineXufei")
        public String engineXufei;

        /**
         * <p>NluServiceType</p>
         * 
         * <strong>example:</strong>
         * <p>Authorized</p>
         */
        @NameInMap("NlsServiceType")
        public String nlsServiceType;

        public static GetAsrConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAsrConfigResponseBodyData self = new GetAsrConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAsrConfigResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
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

        public GetAsrConfigResponseBodyData setAsrOverrides(String asrOverrides) {
            this.asrOverrides = asrOverrides;
            return this;
        }
        public String getAsrOverrides() {
            return this.asrOverrides;
        }

        public GetAsrConfigResponseBodyData setAsrVocabularyId(String asrVocabularyId) {
            this.asrVocabularyId = asrVocabularyId;
            return this;
        }
        public String getAsrVocabularyId() {
            return this.asrVocabularyId;
        }

        public GetAsrConfigResponseBodyData setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetAsrConfigResponseBodyData setEngineXufei(String engineXufei) {
            this.engineXufei = engineXufei;
            return this;
        }
        public String getEngineXufei() {
            return this.engineXufei;
        }

        public GetAsrConfigResponseBodyData setNlsServiceType(String nlsServiceType) {
            this.nlsServiceType = nlsServiceType;
            return this;
        }
        public String getNlsServiceType() {
            return this.nlsServiceType;
        }

    }

}
