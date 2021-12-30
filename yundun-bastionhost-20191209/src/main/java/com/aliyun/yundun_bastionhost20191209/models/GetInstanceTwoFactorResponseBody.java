// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceTwoFactorResponseBody extends TeaModel {
    @NameInMap("Config")
    public GetInstanceTwoFactorResponseBodyConfig config;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceTwoFactorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTwoFactorResponseBody self = new GetInstanceTwoFactorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceTwoFactorResponseBody setConfig(GetInstanceTwoFactorResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public GetInstanceTwoFactorResponseBodyConfig getConfig() {
        return this.config;
    }

    public GetInstanceTwoFactorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceTwoFactorResponseBodyConfigDingTalkConfig extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("HasAppSecret")
        public Boolean hasAppSecret;

        public static GetInstanceTwoFactorResponseBodyConfigDingTalkConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTwoFactorResponseBodyConfigDingTalkConfig self = new GetInstanceTwoFactorResponseBodyConfigDingTalkConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceTwoFactorResponseBodyConfigDingTalkConfig setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetInstanceTwoFactorResponseBodyConfigDingTalkConfig setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetInstanceTwoFactorResponseBodyConfigDingTalkConfig setHasAppSecret(Boolean hasAppSecret) {
            this.hasAppSecret = hasAppSecret;
            return this;
        }
        public Boolean getHasAppSecret() {
            return this.hasAppSecret;
        }

    }

    public static class GetInstanceTwoFactorResponseBodyConfig extends TeaModel {
        @NameInMap("DingTalkConfig")
        public GetInstanceTwoFactorResponseBodyConfigDingTalkConfig dingTalkConfig;

        @NameInMap("EnableTwoFactor")
        public Boolean enableTwoFactor;

        @NameInMap("MessageLanguage")
        public String messageLanguage;

        @NameInMap("SkipTwoFactorTime")
        public Long skipTwoFactorTime;

        @NameInMap("TwoFactorMethods")
        public java.util.List<String> twoFactorMethods;

        public static GetInstanceTwoFactorResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTwoFactorResponseBodyConfig self = new GetInstanceTwoFactorResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public GetInstanceTwoFactorResponseBodyConfig setDingTalkConfig(GetInstanceTwoFactorResponseBodyConfigDingTalkConfig dingTalkConfig) {
            this.dingTalkConfig = dingTalkConfig;
            return this;
        }
        public GetInstanceTwoFactorResponseBodyConfigDingTalkConfig getDingTalkConfig() {
            return this.dingTalkConfig;
        }

        public GetInstanceTwoFactorResponseBodyConfig setEnableTwoFactor(Boolean enableTwoFactor) {
            this.enableTwoFactor = enableTwoFactor;
            return this;
        }
        public Boolean getEnableTwoFactor() {
            return this.enableTwoFactor;
        }

        public GetInstanceTwoFactorResponseBodyConfig setMessageLanguage(String messageLanguage) {
            this.messageLanguage = messageLanguage;
            return this;
        }
        public String getMessageLanguage() {
            return this.messageLanguage;
        }

        public GetInstanceTwoFactorResponseBodyConfig setSkipTwoFactorTime(Long skipTwoFactorTime) {
            this.skipTwoFactorTime = skipTwoFactorTime;
            return this;
        }
        public Long getSkipTwoFactorTime() {
            return this.skipTwoFactorTime;
        }

        public GetInstanceTwoFactorResponseBodyConfig setTwoFactorMethods(java.util.List<String> twoFactorMethods) {
            this.twoFactorMethods = twoFactorMethods;
            return this;
        }
        public java.util.List<String> getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

    }

}
