// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateLlmAccessProfileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <strong>example:</strong>
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4060</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Profile")
    public UpdateLlmAccessProfileRequestProfile profile;

    public static UpdateLlmAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLlmAccessProfileRequest self = new UpdateLlmAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLlmAccessProfileRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public UpdateLlmAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLlmAccessProfileRequest setProfile(UpdateLlmAccessProfileRequestProfile profile) {
        this.profile = profile;
        return this;
    }
    public UpdateLlmAccessProfileRequestProfile getProfile() {
        return this.profile;
    }

    public static class UpdateLlmAccessProfileRequestProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>akm-091e4c2c-9938-4a0d-ade2-b9c477fbcbdb</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>api.llm.enpoint.example.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Name")
        public String name;

        public static UpdateLlmAccessProfileRequestProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateLlmAccessProfileRequestProfile self = new UpdateLlmAccessProfileRequestProfile();
            return TeaModel.build(map, self);
        }

        public UpdateLlmAccessProfileRequestProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateLlmAccessProfileRequestProfile setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateLlmAccessProfileRequestProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
