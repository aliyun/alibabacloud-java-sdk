// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class UpdateVoiceAccessProfileRequest extends TeaModel {
    /**
     * <p>The access profile ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b15</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The voice service provider. Valid values:</p>
     * <ul>
     * <li>BAILIAN: Bailian.</li>
     * <li>VOLC: Doubao.</li>
     * <li>IFLYTEK: iFLYTEK.</li>
     * <li>TENCENT: Tencent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    /**
     * <p>The vendor configuration information.</p>
     */
    @NameInMap("Profile")
    public UpdateVoiceAccessProfileRequestProfile profile;

    public static UpdateVoiceAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVoiceAccessProfileRequest self = new UpdateVoiceAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVoiceAccessProfileRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public UpdateVoiceAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateVoiceAccessProfileRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public UpdateVoiceAccessProfileRequest setProfile(UpdateVoiceAccessProfileRequestProfile profile) {
        this.profile = profile;
        return this;
    }
    public UpdateVoiceAccessProfileRequestProfile getProfile() {
        return this.profile;
    }

    public static class UpdateVoiceAccessProfileRequestProfile extends TeaModel {
        /**
         * <p>Required when NlsEngine is set to VOLC.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>Required when NlsEngine is set to IFLYTEK or BAILIAN.</p>
         * 
         * <strong>example:</strong>
         * <p>a9872e2342952e248727798f642936c7</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>Required when NlsEngine is set to IFLYTEK.</p>
         * 
         * <strong>example:</strong>
         * <p>c0358c6e51c1013b446fdeb21a3a5d2e</p>
         */
        @NameInMap("ApiSecret")
        public String apiSecret;

        /**
         * <p>Required when NlsEngine is set to IFLYTEK or TENCENT.</p>
         * 
         * <strong>example:</strong>
         * <p>9479688350</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Required when NlsEngine is set to VOLC.</p>
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
         * <p>Required when NlsEngine is set to TENCENT.</p>
         * 
         * <strong>example:</strong>
         * <p>sci_r3b3e62udqcujnkerrorqztnpu</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>Required when NlsEngine is set to TENCENT.</p>
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

        public static UpdateVoiceAccessProfileRequestProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateVoiceAccessProfileRequestProfile self = new UpdateVoiceAccessProfileRequestProfile();
            return TeaModel.build(map, self);
        }

        public UpdateVoiceAccessProfileRequestProfile setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public UpdateVoiceAccessProfileRequestProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateVoiceAccessProfileRequestProfile setApiSecret(String apiSecret) {
            this.apiSecret = apiSecret;
            return this;
        }
        public String getApiSecret() {
            return this.apiSecret;
        }

        public UpdateVoiceAccessProfileRequestProfile setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateVoiceAccessProfileRequestProfile setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public UpdateVoiceAccessProfileRequestProfile setAsrAppKey(String asrAppKey) {
            this.asrAppKey = asrAppKey;
            return this;
        }
        public String getAsrAppKey() {
            return this.asrAppKey;
        }

        public UpdateVoiceAccessProfileRequestProfile setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public UpdateVoiceAccessProfileRequestProfile setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public UpdateVoiceAccessProfileRequestProfile setTtsApiKey(String ttsApiKey) {
            this.ttsApiKey = ttsApiKey;
            return this;
        }
        public String getTtsApiKey() {
            return this.ttsApiKey;
        }

    }

}
