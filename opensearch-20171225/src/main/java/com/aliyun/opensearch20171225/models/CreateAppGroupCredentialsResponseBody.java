// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupCredentialsResponseBody extends TeaModel {
    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1-2-3-4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the operation result.</p>
     */
    @NameInMap("result")
    public CreateAppGroupCredentialsResponseBodyResult result;

    public static CreateAppGroupCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupCredentialsResponseBody self = new CreateAppGroupCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppGroupCredentialsResponseBody setResult(CreateAppGroupCredentialsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAppGroupCredentialsResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAppGroupCredentialsResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>app_group_123</p>
         */
        @NameInMap("appGroupId")
        public Long appGroupId;

        /**
         * <p>Indicates whether the credential is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The generated credential token.</p>
         * 
         * <strong>example:</strong>
         * <p>generated_token_string</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>The credential type.</p>
         * 
         * <strong>example:</strong>
         * <p>api-token</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateAppGroupCredentialsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupCredentialsResponseBodyResult self = new CreateAppGroupCredentialsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupCredentialsResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public CreateAppGroupCredentialsResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateAppGroupCredentialsResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public CreateAppGroupCredentialsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
