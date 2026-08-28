// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class SubmitTranslationTaskRequest extends TeaModel {
    /**
     * <p>The API key that identifies the identity of the member account. You can obtain this from the RuiYiBao console.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("APIKey")
    public String APIKey;

    /**
     * <p>The translation task ID of a previously submitted translation task. Pass in this parameter when resubmitting a translation task.</p>
     * <ul>
     * <li>You must pass in either this parameter or TaskId.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
    @NameInMap("BaseTaskId")
    public String baseTaskId;

    /**
     * <p>The translation configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;SourceLanguage&quot;: &quot;zh&quot;,
     *         &quot;TargetLanguage&quot;: &quot;en&quot;,
     *         &quot;Style&quot;: &quot;minimal&quot;,
     *         &quot;Font&quot;: &quot;Arial&quot;
     *     }</p>
     */
    @NameInMap("Config")
    public SubmitTranslationTaskRequestConfig config;

    /**
     * <p>The custom terms.</p>
     * <blockquote>
     * <p>Notice: Custom terms are for reference only. Actual translation results may differ. Refer to the final output for the definitive result.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;SourceTerm&quot;:&quot;dog&quot;, &quot;TargetTerm&quot;:&quot;dog&quot;}]</p>
     */
    @NameInMap("CustomTerms")
    public java.util.List<SubmitTranslationTaskRequestCustomTerms> customTerms;

    /**
     * <p>The translation task ID.</p>
     * <ul>
     * <li>Obtained from the TaskId returned by UploadTranslationFile.</li>
     * <li>You must pass in either this parameter or BaseTaskId.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>f9c35b0453b</p>
     */
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
        @NameInMap("Agent")
        public String agent;

        /**
         * <p>The agent ID passed to the Agent Console platform.</p>
         * 
         * <strong>example:</strong>
         * <p>app-11111111</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The font.</p>
         * <ul>
         * <li>For new tasks, obtain this from UploadTranslationFile.</li>
         * <li>For retranslation of historical tasks, obtain this from GetTranslationTask.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Arial</p>
         */
        @NameInMap("Font")
        public String font;

        /**
         * <p>The language of the source file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("SourceLanguage")
        public String sourceLanguage;

        /**
         * <p>The translation style. Takes effect only when the translation file is a PPT file.</p>
         * 
         * <strong>example:</strong>
         * <p>minimal</p>
         */
        @NameInMap("Style")
        public String style;

        /**
         * <p>The target language.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("TargetLanguage")
        public String targetLanguage;

        public static SubmitTranslationTaskRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitTranslationTaskRequestConfig self = new SubmitTranslationTaskRequestConfig();
            return TeaModel.build(map, self);
        }

        public SubmitTranslationTaskRequestConfig setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public SubmitTranslationTaskRequestConfig setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
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
        /**
         * <p>The source term.</p>
         * 
         * <strong>example:</strong>
         * <p>dog</p>
         */
        @NameInMap("SourceTerm")
        public String sourceTerm;

        /**
         * <p>The target term.</p>
         * 
         * <strong>example:</strong>
         * <p>dog</p>
         */
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
