// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class CreateVoiceAccessProfileRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The voice service provider.
     * BAILIAN: Bailian.
     * VOLC: Doubao.
     * IFLYTEK: iFLYTEK.
     * TENCENT: Tencent.</p>
     * 
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    /**
     * <p>The provider configuration information.</p>
     */
    @NameInMap("Profile")
    public CreateVoiceAccessProfileRequestProfile profile;

    public static CreateVoiceAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceAccessProfileRequest self = new CreateVoiceAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateVoiceAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVoiceAccessProfileRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public CreateVoiceAccessProfileRequest setProfile(CreateVoiceAccessProfileRequestProfile profile) {
        this.profile = profile;
        return this;
    }
    public CreateVoiceAccessProfileRequestProfile getProfile() {
        return this.profile;
    }

    public static class CreateVoiceAccessProfileRequestProfile extends TeaModel {
        /**
         * <p>Required when NlsEngine=VOLC.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>Required when NlsEngine=IFLYTEK or NlsEngine=BAILIAN.</p>
         * 
         * <strong>example:</strong>
         * <p>a9872e2342952e248727798f642936c7</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>Required when NlsEngine=IFLYTEK.</p>
         * 
         * <strong>example:</strong>
         * <p>c0358c6e51c1013b446fdeb21a3a5d2e</p>
         */
        @NameInMap("ApiSecret")
        public String apiSecret;

        /**
         * <p>Required when NlsEngine=IFLYTEK or NlsEngine=TENCENT.</p>
         * 
         * <strong>example:</strong>
         * <p>9479688350</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Required when NlsEngine=VOLC.</p>
         * 
         * <strong>example:</strong>
         * <p>DW0yKRHQEe1nAd8c</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>Not currently in use.</p>
         * 
         * <strong>example:</strong>
         * <p>Not currently in use</p>
         */
        @NameInMap("AsrAppKey")
        public String asrAppKey;

        /**
         * <p>Required when NlsEngine=TENCENT.</p>
         * 
         * <strong>example:</strong>
         * <p>sci_r3b3e62udqcujnkerrorqztnpu</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>Required when NlsEngine=TENCENT.</p>
         * 
         * <strong>example:</strong>
         * <p>y5MZfFdW6yBZgJdKonHZBA</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>Not currently in use.</p>
         * 
         * <strong>example:</strong>
         * <p>Not currently in use</p>
         */
        @NameInMap("TtsApiKey")
        public String ttsApiKey;

        public static CreateVoiceAccessProfileRequestProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateVoiceAccessProfileRequestProfile self = new CreateVoiceAccessProfileRequestProfile();
            return TeaModel.build(map, self);
        }

        public CreateVoiceAccessProfileRequestProfile setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateVoiceAccessProfileRequestProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateVoiceAccessProfileRequestProfile setApiSecret(String apiSecret) {
            this.apiSecret = apiSecret;
            return this;
        }
        public String getApiSecret() {
            return this.apiSecret;
        }

        public CreateVoiceAccessProfileRequestProfile setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateVoiceAccessProfileRequestProfile setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public CreateVoiceAccessProfileRequestProfile setAsrAppKey(String asrAppKey) {
            this.asrAppKey = asrAppKey;
            return this;
        }
        public String getAsrAppKey() {
            return this.asrAppKey;
        }

        public CreateVoiceAccessProfileRequestProfile setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public CreateVoiceAccessProfileRequestProfile setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public CreateVoiceAccessProfileRequestProfile setTtsApiKey(String ttsApiKey) {
            this.ttsApiKey = ttsApiKey;
            return this;
        }
        public String getTtsApiKey() {
            return this.ttsApiKey;
        }

    }

}
