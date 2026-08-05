// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateCredentialsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2E37A447-C010-5A49-9F31-DE12E97710A3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response result.</p>
     */
    @NameInMap("result")
    public CreateCredentialsResponseBodyResult result;

    public static CreateCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialsResponseBody self = new CreateCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCredentialsResponseBody setResult(CreateCredentialsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCredentialsResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateCredentialsResponseBodyResult extends TeaModel {
        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12323</p>
         */
        @NameInMap("appGroupId")
        public Long appGroupId;

        /**
         * <p>Indicates whether the credential is enabled.
         * Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The generated credential token.</p>
         * 
         * <strong>example:</strong>
         * <p>OS-********</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>The credential type.</p>
         * <ul>
         * <li>api-token</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>api-token</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateCredentialsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCredentialsResponseBodyResult self = new CreateCredentialsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCredentialsResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public CreateCredentialsResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateCredentialsResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public CreateCredentialsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
