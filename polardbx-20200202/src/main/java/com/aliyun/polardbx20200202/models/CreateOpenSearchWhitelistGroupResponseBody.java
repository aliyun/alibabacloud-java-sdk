// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchWhitelistGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateOpenSearchWhitelistGroupResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6352AC16-76BF-5135-B1EA-ED49293526E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOpenSearchWhitelistGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSearchWhitelistGroupResponseBody self = new CreateOpenSearchWhitelistGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOpenSearchWhitelistGroupResponseBody setAccessDeniedDetail(CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateOpenSearchWhitelistGroupResponseBody setData(CreateOpenSearchWhitelistGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOpenSearchWhitelistGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateOpenSearchWhitelistGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The diagnostic information.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>NoPermissionType</p>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail self = new CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public CreateOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class CreateOpenSearchWhitelistGroupResponseBodyData extends TeaModel {
        /**
         * <p>The group ID, which is a globally unique identifier generated by the system for the group.</p>
         * 
         * <strong>example:</strong>
         * <p>237509538</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the whitelist group.</p>
         * 
         * <strong>example:</strong>
         * <p>special</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static CreateOpenSearchWhitelistGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOpenSearchWhitelistGroupResponseBodyData self = new CreateOpenSearchWhitelistGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOpenSearchWhitelistGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateOpenSearchWhitelistGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
