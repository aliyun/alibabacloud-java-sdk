// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetCredentialsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B7C901ED-2BC1-5CFB-BE23-242DE5E3BA5C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("result")
    public GetCredentialsResponseBodyResult result;

    public static GetCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialsResponseBody self = new GetCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCredentialsResponseBody setResult(GetCredentialsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCredentialsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetCredentialsResponseBodyResult extends TeaModel {
        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("appGroupId")
        public Long appGroupId;

        /**
         * <p>Indicates whether the credential is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The access credential token.</p>
         * 
         * <strong>example:</strong>
         * <p>OS-********</p>
         */
        @NameInMap("token")
        public String token;

        /**
         * <p>The credential type.</p>
         * <ul>
         * <li>api-token.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>api-token</p>
         */
        @NameInMap("type")
        public String type;

        public static GetCredentialsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialsResponseBodyResult self = new GetCredentialsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCredentialsResponseBodyResult setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public GetCredentialsResponseBodyResult setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetCredentialsResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetCredentialsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
