// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewInfoResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetScenePreviewInfoResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>0：成功，其他：失败</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetScenePreviewInfoResponseBodyData data;

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
     * <p>4F882EA7-3A1D-0113-94E4-70162C4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetScenePreviewInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewInfoResponseBody self = new GetScenePreviewInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewInfoResponseBody setAccessDeniedDetail(GetScenePreviewInfoResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetScenePreviewInfoResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetScenePreviewInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetScenePreviewInfoResponseBody setData(GetScenePreviewInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScenePreviewInfoResponseBodyData getData() {
        return this.data;
    }

    public GetScenePreviewInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScenePreviewInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenePreviewInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScenePreviewInfoResponseBodyAccessDeniedDetail extends TeaModel {
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

        public static GetScenePreviewInfoResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewInfoResponseBodyAccessDeniedDetail self = new GetScenePreviewInfoResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewInfoResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetScenePreviewInfoResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetScenePreviewInfoResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetScenePreviewInfoResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetScenePreviewInfoResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetScenePreviewInfoResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetScenePreviewInfoResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetScenePreviewInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://www.aliyundoc.com/sgm/A.e.QRQRLWYEHIUEYLYW/A.e.QRQRLWYEHIUEYLYW****.sgm">https://www.aliyundoc.com/sgm/A.e.QRQRLWYEHIUEYLYW/A.e.QRQRLWYEHIUEYLYW****.sgm</a></p>
         */
        @NameInMap("ModelPath")
        public String modelPath;

        @NameInMap("PanoList")
        public String panoList;

        @NameInMap("TextureModelPath")
        public String textureModelPath;

        @NameInMap("TexturePanoPath")
        public String texturePanoPath;

        public static GetScenePreviewInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewInfoResponseBodyData self = new GetScenePreviewInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewInfoResponseBodyData setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public GetScenePreviewInfoResponseBodyData setPanoList(String panoList) {
            this.panoList = panoList;
            return this;
        }
        public String getPanoList() {
            return this.panoList;
        }

        public GetScenePreviewInfoResponseBodyData setTextureModelPath(String textureModelPath) {
            this.textureModelPath = textureModelPath;
            return this;
        }
        public String getTextureModelPath() {
            return this.textureModelPath;
        }

        public GetScenePreviewInfoResponseBodyData setTexturePanoPath(String texturePanoPath) {
            this.texturePanoPath = texturePanoPath;
            return this;
        }
        public String getTexturePanoPath() {
            return this.texturePanoPath;
        }

    }

}
