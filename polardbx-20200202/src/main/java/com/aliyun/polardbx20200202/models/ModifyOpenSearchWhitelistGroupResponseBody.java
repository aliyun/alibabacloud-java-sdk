// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyOpenSearchWhitelistGroupResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The creation result.</p>
     */
    @NameInMap("Data")
    public ModifyOpenSearchWhitelistGroupResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6A4256F-7B83-5BD7-9AC0-72E1FAC05330</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOpenSearchWhitelistGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenSearchWhitelistGroupResponseBody self = new ModifyOpenSearchWhitelistGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOpenSearchWhitelistGroupResponseBody setAccessDeniedDetail(ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyOpenSearchWhitelistGroupResponseBody setData(ModifyOpenSearchWhitelistGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyOpenSearchWhitelistGroupResponseBodyData getData() {
        return this.data;
    }

    public ModifyOpenSearchWhitelistGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail extends TeaModel {
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
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaKPfwjY0MzMyODRGLUZCQkQtNTA1RS04MUUxLTc5NTkzODk2MUIzMg==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the permission denial.</p>
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

        public static ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail self = new ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class ModifyOpenSearchWhitelistGroupResponseBodyData extends TeaModel {
        /**
         * <p>The group ID, which is a globally unique identifier generated by the system for the group.</p>
         * 
         * <strong>example:</strong>
         * <p>g-00mzurifez86htk8fn90</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the task was last updated, in timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-17T02:27:11Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ModifyOpenSearchWhitelistGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyOpenSearchWhitelistGroupResponseBodyData self = new ModifyOpenSearchWhitelistGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ModifyOpenSearchWhitelistGroupResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
