// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestResponseBody extends TeaModel {
    /**
     * <p>The diagnostic details for access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public ExecuteRequestResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response data, which includes fields such as tags, score, and extend.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;score&quot;: 80.4, &quot;tags&quot;: &quot;ra0601,rnk0002,rn0312&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The result message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5F41DC6-2070-5CE7-8B2D-7A23D882932D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestResponseBody self = new ExecuteRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestResponseBody setAccessDeniedDetail(ExecuteRequestResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public ExecuteRequestResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ExecuteRequestResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteRequestResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ExecuteRequestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExecuteRequestResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The specific action that the caller attempted to perform, such as s3:PutObject or ec2:DescribeInstances.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun-saf:Execute</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The human-readable display name of the request principal, such as the username or role name.</p>
         * 
         * <strong>example:</strong>
         * <p>29918048924096****</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The UID of the Alibaba Cloud account to which the request principal belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>178059440630****</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type of the request principal. Valid values:</p>
         * <ul>
         * <li>SubUser: RAM user created by an Alibaba Cloud account.</li>
         * <li>AssumedRoleUser: Temporary identity obtained by assuming a role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The Base64-encoded permission diagnostic log used for troubleshooting and automated analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>AQIBIAAAA...r+ow==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The specific denial type for the access denied scenario. Valid values:</p>
         * <ul>
         * <li>ImplicitDeny: Implicit deny due to the lack of explicit authorization.</li>
         * <li>ExplicitDeny: Explicit deny where the operation is explicitly denied in the policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The scope and type of the policy in the access denied scenario. Valid values:</p>
         * <ul>
         * <li>AccountLevelIdentityBasedPolicy: Account-level identity-based policy that applies to the entire Alibaba Cloud account.</li>
         * <li>ResourceGroupLevelIdentityBasedPolicy: Resource group-level identity-based policy that applies to a specific resource group.</li>
         * <li>SessionPolicy: Session policy that applies to a temporary session.</li>
         * <li>ControlPolicy: Control policy used for core permission control.</li>
         * <li>AssumeRolePolicy: Trust policy that defines which entities can assume the role.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AccountLevelIdentityBasedPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static ExecuteRequestResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            ExecuteRequestResponseBodyAccessDeniedDetail self = new ExecuteRequestResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public ExecuteRequestResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public ExecuteRequestResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public ExecuteRequestResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public ExecuteRequestResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public ExecuteRequestResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public ExecuteRequestResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public ExecuteRequestResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
