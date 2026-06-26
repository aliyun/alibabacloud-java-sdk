// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeNavigationConfigResponseBody extends TeaModel {
    /**
     * <p>The greeting configuration.</p>
     */
    @NameInMap("GreetingConfig")
    public DescribeNavigationConfigResponseBodyGreetingConfig greetingConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The silence timeout configuration.</p>
     */
    @NameInMap("SilenceTimeoutConfig")
    public DescribeNavigationConfigResponseBodySilenceTimeoutConfig silenceTimeoutConfig;

    /**
     * <p>The configuration for handling unrecognized input.</p>
     */
    @NameInMap("UnrecognizingConfig")
    public DescribeNavigationConfigResponseBodyUnrecognizingConfig unrecognizingConfig;

    public static DescribeNavigationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNavigationConfigResponseBody self = new DescribeNavigationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNavigationConfigResponseBody setGreetingConfig(DescribeNavigationConfigResponseBodyGreetingConfig greetingConfig) {
        this.greetingConfig = greetingConfig;
        return this;
    }
    public DescribeNavigationConfigResponseBodyGreetingConfig getGreetingConfig() {
        return this.greetingConfig;
    }

    public DescribeNavigationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNavigationConfigResponseBody setSilenceTimeoutConfig(DescribeNavigationConfigResponseBodySilenceTimeoutConfig silenceTimeoutConfig) {
        this.silenceTimeoutConfig = silenceTimeoutConfig;
        return this;
    }
    public DescribeNavigationConfigResponseBodySilenceTimeoutConfig getSilenceTimeoutConfig() {
        return this.silenceTimeoutConfig;
    }

    public DescribeNavigationConfigResponseBody setUnrecognizingConfig(DescribeNavigationConfigResponseBodyUnrecognizingConfig unrecognizingConfig) {
        this.unrecognizingConfig = unrecognizingConfig;
        return this;
    }
    public DescribeNavigationConfigResponseBodyUnrecognizingConfig getUnrecognizingConfig() {
        return this.unrecognizingConfig;
    }

    public static class DescribeNavigationConfigResponseBodyGreetingConfig extends TeaModel {
        /**
         * <p>The greeting message.</p>
         * 
         * <strong>example:</strong>
         * <p>您好，欢迎致电智能导航</p>
         */
        @NameInMap("GreetingWords")
        public String greetingWords;

        /**
         * <p>The intent trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("IntentTrigger")
        public String intentTrigger;

        /**
         * <p>The source of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbotIntent</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeNavigationConfigResponseBodyGreetingConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNavigationConfigResponseBodyGreetingConfig self = new DescribeNavigationConfigResponseBodyGreetingConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNavigationConfigResponseBodyGreetingConfig setGreetingWords(String greetingWords) {
            this.greetingWords = greetingWords;
            return this;
        }
        public String getGreetingWords() {
            return this.greetingWords;
        }

        public DescribeNavigationConfigResponseBodyGreetingConfig setIntentTrigger(String intentTrigger) {
            this.intentTrigger = intentTrigger;
            return this;
        }
        public String getIntentTrigger() {
            return this.intentTrigger;
        }

        public DescribeNavigationConfigResponseBodyGreetingConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class DescribeNavigationConfigResponseBodySilenceTimeoutConfig extends TeaModel {
        /**
         * <p>The action to perform after the final silence prompt is played. Valid values: <code>TransferToAgent</code>, <code>TransferToIVR</code>, <code>RedirectToPage</code>, or <code>HangUp</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>HangUp</p>
         */
        @NameInMap("FinalAction")
        public String finalAction;

        /**
         * <p>Parameters for the final action, such as a redirection target.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("FinalActionParams")
        public String finalActionParams;

        /**
         * <p>The prompt that is played when the silence timeout threshold is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>抱歉，听不到您说话，请您稍后致电</p>
         */
        @NameInMap("FinalPrompt")
        public String finalPrompt;

        /**
         * <p>&quot;&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("IntentTrigger")
        public String intentTrigger;

        /**
         * <p>The prompt that is played when a silence timeout occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>抱歉，我没听到您说话</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The source of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbotIntent</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The maximum number of silence timeouts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        /**
         * <p>The duration of the silence timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        public static DescribeNavigationConfigResponseBodySilenceTimeoutConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNavigationConfigResponseBodySilenceTimeoutConfig self = new DescribeNavigationConfigResponseBodySilenceTimeoutConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setFinalAction(String finalAction) {
            this.finalAction = finalAction;
            return this;
        }
        public String getFinalAction() {
            return this.finalAction;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setFinalActionParams(String finalActionParams) {
            this.finalActionParams = finalActionParams;
            return this;
        }
        public String getFinalActionParams() {
            return this.finalActionParams;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setFinalPrompt(String finalPrompt) {
            this.finalPrompt = finalPrompt;
            return this;
        }
        public String getFinalPrompt() {
            return this.finalPrompt;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setIntentTrigger(String intentTrigger) {
            this.intentTrigger = intentTrigger;
            return this;
        }
        public String getIntentTrigger() {
            return this.intentTrigger;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class DescribeNavigationConfigResponseBodyUnrecognizingConfig extends TeaModel {
        /**
         * <p>The action to take when the number of unrecognized inputs reaches the threshold. Valid values: <code>TransferToAgent</code>, <code>TransferToIVR</code>, <code>RedirectToPage</code>, or <code>HangUp</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TransferToAgent</p>
         */
        @NameInMap("FinalAction")
        public String finalAction;

        /**
         * <p>Parameters for the final action, such as a redirection target.</p>
         * 
         * <strong>example:</strong>
         * <p>{ \&quot;skillGroupId\&quot;: \&quot;fallbackSkillGroup\&quot; }</p>
         */
        @NameInMap("FinalActionParams")
        public String finalActionParams;

        /**
         * <p>The prompt that is played when the unrecognized input threshold is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>抱歉，我暂时无法处理您的问题，即将为您转接人工</p>
         */
        @NameInMap("FinalPrompt")
        public String finalPrompt;

        /**
         * <p>The prompt that is played when user input is not recognized.</p>
         * 
         * <strong>example:</strong>
         * <p>抱歉，我无法理解您的意思</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The maximum number of times the user\&quot;s input is not recognized.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        public static DescribeNavigationConfigResponseBodyUnrecognizingConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNavigationConfigResponseBodyUnrecognizingConfig self = new DescribeNavigationConfigResponseBodyUnrecognizingConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setFinalAction(String finalAction) {
            this.finalAction = finalAction;
            return this;
        }
        public String getFinalAction() {
            return this.finalAction;
        }

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setFinalActionParams(String finalActionParams) {
            this.finalActionParams = finalActionParams;
            return this;
        }
        public String getFinalActionParams() {
            return this.finalActionParams;
        }

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setFinalPrompt(String finalPrompt) {
            this.finalPrompt = finalPrompt;
            return this;
        }
        public String getFinalPrompt() {
            return this.finalPrompt;
        }

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

    }

}
