// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetHotspotSceneDataResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetHotspotSceneDataResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetHotspotSceneDataResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A8CD0AD9-8A92-455A-A984-A7E4B76****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetHotspotSceneDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotspotSceneDataResponseBody self = new GetHotspotSceneDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotspotSceneDataResponseBody setAccessDeniedDetail(GetHotspotSceneDataResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetHotspotSceneDataResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetHotspotSceneDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetHotspotSceneDataResponseBody setData(GetHotspotSceneDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotspotSceneDataResponseBodyData getData() {
        return this.data;
    }

    public GetHotspotSceneDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotspotSceneDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotspotSceneDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHotspotSceneDataResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static GetHotspotSceneDataResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotSceneDataResponseBodyAccessDeniedDetail self = new GetHotspotSceneDataResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetHotspotSceneDataResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetHotspotSceneDataResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetHotspotSceneDataResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetHotspotSceneDataResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetHotspotSceneDataResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetHotspotSceneDataResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetHotspotSceneDataResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetHotspotSceneDataResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>A.e.QRQRLWYEHIUE****</p>
         */
        @NameInMap("ModelToken")
        public String modelToken;

        @NameInMap("PreviewData")
        public String previewData;

        /**
         * <strong>example:</strong>
         * <p>344794c32937474a9c59eb130936****</p>
         */
        @NameInMap("PreviewToken")
        public String previewToken;

        /**
         * <strong>example:</strong>
         * <p>MODEL_3D</p>
         */
        @NameInMap("SceneType")
        public String sceneType;

        public static GetHotspotSceneDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotspotSceneDataResponseBodyData self = new GetHotspotSceneDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotspotSceneDataResponseBodyData setModelToken(String modelToken) {
            this.modelToken = modelToken;
            return this;
        }
        public String getModelToken() {
            return this.modelToken;
        }

        public GetHotspotSceneDataResponseBodyData setPreviewData(String previewData) {
            this.previewData = previewData;
            return this;
        }
        public String getPreviewData() {
            return this.previewData;
        }

        public GetHotspotSceneDataResponseBodyData setPreviewToken(String previewToken) {
            this.previewToken = previewToken;
            return this;
        }
        public String getPreviewToken() {
            return this.previewToken;
        }

        public GetHotspotSceneDataResponseBodyData setSceneType(String sceneType) {
            this.sceneType = sceneType;
            return this;
        }
        public String getSceneType() {
            return this.sceneType;
        }

    }

}
