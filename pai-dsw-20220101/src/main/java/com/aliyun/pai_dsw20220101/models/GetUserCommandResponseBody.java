// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetUserCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ValidationError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("OnStart")
    public GetUserCommandResponseBodyOnStart onStart;

    /**
     * <strong>example:</strong>
     * <p>BEBDF2EE-642E-5992-8907-D2011A7ACEFE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1900</p>
     */
    @NameInMap("UserCommandId")
    public String userCommandId;

    /**
     * <strong>example:</strong>
     * <p>&quot;AccessDeniedDetail&quot;: {
     *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAA....bwhg==&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,
     *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
     *     &quot;AuthAction&quot;: &quot;ram:GetUserCommand&quot;
     *   }</p>
     */
    @NameInMap("accessDeniedDetail")
    public java.util.Map<String, ?> accessDeniedDetail;

    public static GetUserCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserCommandResponseBody self = new GetUserCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserCommandResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserCommandResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserCommandResponseBody setOnStart(GetUserCommandResponseBodyOnStart onStart) {
        this.onStart = onStart;
        return this;
    }
    public GetUserCommandResponseBodyOnStart getOnStart() {
        return this.onStart;
    }

    public GetUserCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserCommandResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserCommandResponseBody setUserCommandId(String userCommandId) {
        this.userCommandId = userCommandId;
        return this;
    }
    public String getUserCommandId() {
        return this.userCommandId;
    }

    public GetUserCommandResponseBody setAccessDeniedDetail(java.util.Map<String, ?> accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public java.util.Map<String, ?> getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public static class GetUserCommandResponseBodyOnStart extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>apt update</p>
         */
        @NameInMap("Content")
        public String content;

        public static GetUserCommandResponseBodyOnStart build(java.util.Map<String, ?> map) throws Exception {
            GetUserCommandResponseBodyOnStart self = new GetUserCommandResponseBodyOnStart();
            return TeaModel.build(map, self);
        }

        public GetUserCommandResponseBodyOnStart setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
