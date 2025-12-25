// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSingleConnDataResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetSingleConnDataResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("List")
    public java.util.List<GetSingleConnDataResponseBodyList> list;

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

    /**
     * <strong>example:</strong>
     * <p>2.1</p>
     */
    @NameInMap("Version")
    public String version;

    public static GetSingleConnDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSingleConnDataResponseBody self = new GetSingleConnDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSingleConnDataResponseBody setAccessDeniedDetail(GetSingleConnDataResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetSingleConnDataResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetSingleConnDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSingleConnDataResponseBody setList(java.util.List<GetSingleConnDataResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetSingleConnDataResponseBodyList> getList() {
        return this.list;
    }

    public GetSingleConnDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSingleConnDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSingleConnDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSingleConnDataResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetSingleConnDataResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static GetSingleConnDataResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSingleConnDataResponseBodyAccessDeniedDetail self = new GetSingleConnDataResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetSingleConnDataResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetSingleConnDataResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetSingleConnDataResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetSingleConnDataResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetSingleConnDataResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetSingleConnDataResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetSingleConnDataResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetSingleConnDataResponseBodyList extends TeaModel {
        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>1#234@abc</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1#567#def</p>
         */
        @NameInMap("MapId")
        public String mapId;

        /**
         * <strong>example:</strong>
         * <p>outer</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetSingleConnDataResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetSingleConnDataResponseBodyList self = new GetSingleConnDataResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetSingleConnDataResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSingleConnDataResponseBodyList setMapId(String mapId) {
            this.mapId = mapId;
            return this;
        }
        public String getMapId() {
            return this.mapId;
        }

        public GetSingleConnDataResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
