// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateLlmAccessProfileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Profile")
    public CreateLlmAccessProfileRequestProfile profile;

    public static CreateLlmAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLlmAccessProfileRequest self = new CreateLlmAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public CreateLlmAccessProfileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateLlmAccessProfileRequest setProfile(CreateLlmAccessProfileRequestProfile profile) {
        this.profile = profile;
        return this;
    }
    public CreateLlmAccessProfileRequestProfile getProfile() {
        return this.profile;
    }

    public static class CreateLlmAccessProfileRequestProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>70tKleNtMGaaIem7us7Miw-Tf3kPzE6l</p>
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

        public static CreateLlmAccessProfileRequestProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateLlmAccessProfileRequestProfile self = new CreateLlmAccessProfileRequestProfile();
            return TeaModel.build(map, self);
        }

        public CreateLlmAccessProfileRequestProfile setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateLlmAccessProfileRequestProfile setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateLlmAccessProfileRequestProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
