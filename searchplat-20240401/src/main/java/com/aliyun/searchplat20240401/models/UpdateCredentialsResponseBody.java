// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class UpdateCredentialsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CC93E65-6734-5060-BEF7-0EB0A4862BCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public UpdateCredentialsResponseBodyResult result;

    public static UpdateCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialsResponseBody self = new UpdateCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCredentialsResponseBody setResult(UpdateCredentialsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateCredentialsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateCredentialsResponseBodyResult extends TeaModel {
        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12321321</p>
         */
        @NameInMap("appGroupId")
        public Long appGroupId;

        /**
         * <p>Specifies whether the credential is enabled. Valid values:</p>
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
         * <p>The access credential token.</p>
         * 
         * <strong>example:</strong>
         * <p>OS-****</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>The credential type. Valid values:</p>
         * <ul>
         * <li>api-token.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>api-token</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateCredentialsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateCredentialsResponseBodyResult self = new UpdateCredentialsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateCredentialsResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public UpdateCredentialsResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateCredentialsResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public UpdateCredentialsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
