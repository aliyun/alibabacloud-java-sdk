// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSubSceneTaskStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("List")
    public java.util.List<GetSubSceneTaskStatusResponseBodyList> list;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4F882EA7-3A1D-0113-94E4-70162C4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSubSceneTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubSceneTaskStatusResponseBody self = new GetSubSceneTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubSceneTaskStatusResponseBody setAccessDeniedDetail(GetSubSceneTaskStatusResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetSubSceneTaskStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSubSceneTaskStatusResponseBody setList(java.util.List<GetSubSceneTaskStatusResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetSubSceneTaskStatusResponseBodyList> getList() {
        return this.list;
    }

    public GetSubSceneTaskStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubSceneTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubSceneTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubSceneTaskStatusResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static GetSubSceneTaskStatusResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSubSceneTaskStatusResponseBodyAccessDeniedDetail self = new GetSubSceneTaskStatusResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetSubSceneTaskStatusResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetSubSceneTaskStatusResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>4638****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>2345****</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>init</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>3456***</p>
         */
        @NameInMap("SubSceneId")
        public String subSceneId;

        /**
         * <strong>example:</strong>
         * <p>cutimage</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetSubSceneTaskStatusResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetSubSceneTaskStatusResponseBodyList self = new GetSubSceneTaskStatusResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetSubSceneTaskStatusResponseBodyList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetSubSceneTaskStatusResponseBodyList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetSubSceneTaskStatusResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSubSceneTaskStatusResponseBodyList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public GetSubSceneTaskStatusResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSubSceneTaskStatusResponseBodyList setSubSceneId(String subSceneId) {
            this.subSceneId = subSceneId;
            return this;
        }
        public String getSubSceneId() {
            return this.subSceneId;
        }

        public GetSubSceneTaskStatusResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
