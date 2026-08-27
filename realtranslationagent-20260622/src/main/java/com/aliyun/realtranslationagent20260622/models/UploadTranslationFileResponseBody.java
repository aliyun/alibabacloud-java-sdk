// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class UploadTranslationFileResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public UploadTranslationFileResponseBodyData data;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F60AC23C-27A7-5376-9A68-0B6EF2D4F9E4</p>
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

    public static UploadTranslationFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadTranslationFileResponseBody self = new UploadTranslationFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadTranslationFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadTranslationFileResponseBody setData(UploadTranslationFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadTranslationFileResponseBodyData getData() {
        return this.data;
    }

    public UploadTranslationFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadTranslationFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadTranslationFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadTranslationFileResponseBodyData extends TeaModel {
        /**
         * <p>The description of the estimated Credits billing and time consumption for the task.</p>
         * 
         * <strong>example:</strong>
         * <p>docx: 0.002 creadits/word × 1000 words (original 2 characters rounded up to nearest thousand) / 1000 = 0.002</p>
         */
        @NameInMap("CreditBreakdown")
        public String creditBreakdown;

        /**
         * <p>Indicates whether the available Credits are sufficient for this translation task.</p>
         * <ul>
         * <li>The estimate may be affected by various factors and may deviate. The actual result is based on the task submission operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("CreditsAvailable")
        public Boolean creditsAvailable;

        /**
         * <p>The detected language type.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("DetectedLang")
        public String detectedLang;

        /**
         * <p>The estimated Credits consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0021</p>
         */
        @NameInMap("EstimatedCostCredits")
        public Double estimatedCostCredits;

        /**
         * <p>The estimated translation time in <strong>seconds</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("EstimatedTime")
        public Long estimatedTime;

        /**
         * <p>The languages that support font modification and the corresponding font lists. The key of the map identifies the language type.</p>
         * <ul>
         * <li>Currently supported fonts include: English, French, Indonesian, and Japanese.</li>
         * </ul>
         */
        @NameInMap("Fonts")
        public java.util.Map<String, java.util.List<String>> fonts;

        /**
         * <p>The page count of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageCount")
        public Long pageCount;

        /**
         * <p>Indicates whether sensitive information was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SensitiveDetected")
        public Boolean sensitiveDetected;

        /**
         * <p>The keywords that matched sensitive information.</p>
         */
        @NameInMap("SensitiveTags")
        public java.util.List<String> sensitiveTags;

        /**
         * <p>The translation task ID, used for subsequent task submission.</p>
         * 
         * <strong>example:</strong>
         * <p>f9c35b0453b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The word count of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("WordCount")
        public Long wordCount;

        public static UploadTranslationFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadTranslationFileResponseBodyData self = new UploadTranslationFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadTranslationFileResponseBodyData setCreditBreakdown(String creditBreakdown) {
            this.creditBreakdown = creditBreakdown;
            return this;
        }
        public String getCreditBreakdown() {
            return this.creditBreakdown;
        }

        public UploadTranslationFileResponseBodyData setCreditsAvailable(Boolean creditsAvailable) {
            this.creditsAvailable = creditsAvailable;
            return this;
        }
        public Boolean getCreditsAvailable() {
            return this.creditsAvailable;
        }

        public UploadTranslationFileResponseBodyData setDetectedLang(String detectedLang) {
            this.detectedLang = detectedLang;
            return this;
        }
        public String getDetectedLang() {
            return this.detectedLang;
        }

        public UploadTranslationFileResponseBodyData setEstimatedCostCredits(Double estimatedCostCredits) {
            this.estimatedCostCredits = estimatedCostCredits;
            return this;
        }
        public Double getEstimatedCostCredits() {
            return this.estimatedCostCredits;
        }

        public UploadTranslationFileResponseBodyData setEstimatedTime(Long estimatedTime) {
            this.estimatedTime = estimatedTime;
            return this;
        }
        public Long getEstimatedTime() {
            return this.estimatedTime;
        }

        public UploadTranslationFileResponseBodyData setFonts(java.util.Map<String, java.util.List<String>> fonts) {
            this.fonts = fonts;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getFonts() {
            return this.fonts;
        }

        public UploadTranslationFileResponseBodyData setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public UploadTranslationFileResponseBodyData setSensitiveDetected(Boolean sensitiveDetected) {
            this.sensitiveDetected = sensitiveDetected;
            return this;
        }
        public Boolean getSensitiveDetected() {
            return this.sensitiveDetected;
        }

        public UploadTranslationFileResponseBodyData setSensitiveTags(java.util.List<String> sensitiveTags) {
            this.sensitiveTags = sensitiveTags;
            return this;
        }
        public java.util.List<String> getSensitiveTags() {
            return this.sensitiveTags;
        }

        public UploadTranslationFileResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UploadTranslationFileResponseBodyData setWordCount(Long wordCount) {
            this.wordCount = wordCount;
            return this;
        }
        public Long getWordCount() {
            return this.wordCount;
        }

    }

}
