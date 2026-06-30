// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class SubmitTranslationTaskRequest extends TeaModel {
    @NameInMap("APIKey")
    public String APIKey;

    @NameInMap("BaseTaskId")
    public String baseTaskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public SubmitTranslationTaskRequestConfig config;

    @NameInMap("CustomTerms")
    public java.util.List<SubmitTranslationTaskRequestCustomTerms> customTerms;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitTranslationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTranslationTaskRequest self = new SubmitTranslationTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTranslationTaskRequest setAPIKey(String APIKey) {
        this.APIKey = APIKey;
        return this;
    }
    public String getAPIKey() {
        return this.APIKey;
    }

    public SubmitTranslationTaskRequest setBaseTaskId(String baseTaskId) {
        this.baseTaskId = baseTaskId;
        return this;
    }
    public String getBaseTaskId() {
        return this.baseTaskId;
    }

    public SubmitTranslationTaskRequest setConfig(SubmitTranslationTaskRequestConfig config) {
        this.config = config;
        return this;
    }
    public SubmitTranslationTaskRequestConfig getConfig() {
        return this.config;
    }

    public SubmitTranslationTaskRequest setCustomTerms(java.util.List<SubmitTranslationTaskRequestCustomTerms> customTerms) {
        this.customTerms = customTerms;
        return this;
    }
    public java.util.List<SubmitTranslationTaskRequestCustomTerms> getCustomTerms() {
        return this.customTerms;
    }

    public SubmitTranslationTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class SubmitTranslationTaskRequestConfig extends TeaModel {
        @NameInMap("Font")
        public String font;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        @NameInMap("Style")
        public String style;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("TargetLanguage")
        public String targetLanguage;

        public static SubmitTranslationTaskRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranslationTaskRequestConfig self = new SubmitTranslationTaskRequestConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranslationTaskRequestConfig setFont(String font) {
            this.font = font;
            return this;
        }
        public String getFont() {
            return this.font;
        }

        public SubmitTranslationTaskRequestConfig setSourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
            return this;
        }
        public String getSourceLanguage() {
            return this.sourceLanguage;
        }

        public SubmitTranslationTaskRequestConfig setStyle(String style) {
            this.style = style;
            return this;
        }
        public String getStyle() {
            return this.style;
        }

        public SubmitTranslationTaskRequestConfig setTargetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
            return this;
        }
        public String getTargetLanguage() {
            return this.targetLanguage;
        }

    }

    public static class SubmitTranslationTaskRequestCustomTerms extends TeaModel {
        @NameInMap("SourceTerm")
        public String sourceTerm;

        @NameInMap("TargetTerm")
        public String targetTerm;

        public static SubmitTranslationTaskRequestCustomTerms build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranslationTaskRequestCustomTerms self = new SubmitTranslationTaskRequestCustomTerms();
            return TeaModel.build(map, self);
        }

        public SubmitTranslationTaskRequestCustomTerms setSourceTerm(String sourceTerm) {
            this.sourceTerm = sourceTerm;
            return this;
        }
        public String getSourceTerm() {
            return this.sourceTerm;
        }

        public SubmitTranslationTaskRequestCustomTerms setTargetTerm(String targetTerm) {
            this.targetTerm = targetTerm;
            return this;
        }
        public String getTargetTerm() {
            return this.targetTerm;
        }

    }

}
