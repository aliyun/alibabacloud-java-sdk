// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeNavigationConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SilenceTimeoutConfig")
    public DescribeNavigationConfigResponseBodySilenceTimeoutConfig silenceTimeoutConfig;

    @NameInMap("GreetingConfig")
    public DescribeNavigationConfigResponseBodyGreetingConfig greetingConfig;

    @NameInMap("UnrecognizingConfig")
    public DescribeNavigationConfigResponseBodyUnrecognizingConfig unrecognizingConfig;

    public static DescribeNavigationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNavigationConfigResponseBody self = new DescribeNavigationConfigResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeNavigationConfigResponseBody setGreetingConfig(DescribeNavigationConfigResponseBodyGreetingConfig greetingConfig) {
        this.greetingConfig = greetingConfig;
        return this;
    }
    public DescribeNavigationConfigResponseBodyGreetingConfig getGreetingConfig() {
        return this.greetingConfig;
    }

    public DescribeNavigationConfigResponseBody setUnrecognizingConfig(DescribeNavigationConfigResponseBodyUnrecognizingConfig unrecognizingConfig) {
        this.unrecognizingConfig = unrecognizingConfig;
        return this;
    }
    public DescribeNavigationConfigResponseBodyUnrecognizingConfig getUnrecognizingConfig() {
        return this.unrecognizingConfig;
    }

    public static class DescribeNavigationConfigResponseBodySilenceTimeoutConfig extends TeaModel {
        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("IntentTrigger")
        public String intentTrigger;

        @NameInMap("FinalPrompt")
        public String finalPrompt;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("FinalAction")
        public String finalAction;

        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("Threshold")
        public Integer threshold;

        @NameInMap("FinalActionParams")
        public String finalActionParams;

        public static DescribeNavigationConfigResponseBodySilenceTimeoutConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNavigationConfigResponseBodySilenceTimeoutConfig self = new DescribeNavigationConfigResponseBodySilenceTimeoutConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setIntentTrigger(String intentTrigger) {
            this.intentTrigger = intentTrigger;
            return this;
        }
        public String getIntentTrigger() {
            return this.intentTrigger;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setFinalPrompt(String finalPrompt) {
            this.finalPrompt = finalPrompt;
            return this;
        }
        public String getFinalPrompt() {
            return this.finalPrompt;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setFinalAction(String finalAction) {
            this.finalAction = finalAction;
            return this;
        }
        public String getFinalAction() {
            return this.finalAction;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeNavigationConfigResponseBodySilenceTimeoutConfig setFinalActionParams(String finalActionParams) {
            this.finalActionParams = finalActionParams;
            return this;
        }
        public String getFinalActionParams() {
            return this.finalActionParams;
        }

    }

    public static class DescribeNavigationConfigResponseBodyGreetingConfig extends TeaModel {
        @NameInMap("IntentTrigger")
        public String intentTrigger;

        @NameInMap("GreetingWords")
        public String greetingWords;

        @NameInMap("SourceType")
        public String sourceType;

        public static DescribeNavigationConfigResponseBodyGreetingConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNavigationConfigResponseBodyGreetingConfig self = new DescribeNavigationConfigResponseBodyGreetingConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNavigationConfigResponseBodyGreetingConfig setIntentTrigger(String intentTrigger) {
            this.intentTrigger = intentTrigger;
            return this;
        }
        public String getIntentTrigger() {
            return this.intentTrigger;
        }

        public DescribeNavigationConfigResponseBodyGreetingConfig setGreetingWords(String greetingWords) {
            this.greetingWords = greetingWords;
            return this;
        }
        public String getGreetingWords() {
            return this.greetingWords;
        }

        public DescribeNavigationConfigResponseBodyGreetingConfig setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class DescribeNavigationConfigResponseBodyUnrecognizingConfig extends TeaModel {
        @NameInMap("FinalPrompt")
        public String finalPrompt;

        @NameInMap("FinalAction")
        public String finalAction;

        @NameInMap("FinalActionParams")
        public String finalActionParams;

        @NameInMap("Threshold")
        public Integer threshold;

        @NameInMap("Prompt")
        public String prompt;

        public static DescribeNavigationConfigResponseBodyUnrecognizingConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNavigationConfigResponseBodyUnrecognizingConfig self = new DescribeNavigationConfigResponseBodyUnrecognizingConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setFinalPrompt(String finalPrompt) {
            this.finalPrompt = finalPrompt;
            return this;
        }
        public String getFinalPrompt() {
            return this.finalPrompt;
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

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeNavigationConfigResponseBodyUnrecognizingConfig setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

    }

}
