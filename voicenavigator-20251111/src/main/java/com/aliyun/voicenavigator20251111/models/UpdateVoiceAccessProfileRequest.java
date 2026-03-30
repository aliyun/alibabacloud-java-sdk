// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateVoiceAccessProfileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>VOLC</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

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
         * <strong>example:</strong>
         * <p>HwRnTXgwnQOlsj68URDS5_VMm4Wtapq9</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <strong>example:</strong>
         * <p>sk-12341e259b1049e8872b47981e545f78</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>c0358c6e51c1013b446fdeb21a3a1234</p>
         */
        @NameInMap("ApiSecret")
        public String apiSecret;

        /**
         * <strong>example:</strong>
         * <p>5b123bfb</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>2541370123</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AsrAppKey")
        public String asrAppKey;

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

        public UpdateVoiceAccessProfileRequestProfile setTtsApiKey(String ttsApiKey) {
            this.ttsApiKey = ttsApiKey;
            return this;
        }
        public String getTtsApiKey() {
            return this.ttsApiKey;
        }

    }

}
