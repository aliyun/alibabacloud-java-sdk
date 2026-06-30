// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class UploadTranslationFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadTranslationFileResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreditBreakdown")
        public String creditBreakdown;

        @NameInMap("CreditsAvailable")
        public Boolean creditsAvailable;

        @NameInMap("DetectedLang")
        public String detectedLang;

        @NameInMap("EstimatedCostCredits")
        public Double estimatedCostCredits;

        @NameInMap("EstimatedTime")
        public Long estimatedTime;

        @NameInMap("Fonts")
        public java.util.Map<String, java.util.List<String>> fonts;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("SensitiveDetected")
        public Boolean sensitiveDetected;

        @NameInMap("SensitiveTags")
        public java.util.List<String> sensitiveTags;

        @NameInMap("TaskId")
        public String taskId;

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
