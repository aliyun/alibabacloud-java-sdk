// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppInstanceTicketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/u6qw3gxzu3b7sbj/u6qw3gxzu3b7sbj.diff.zip?Expires=1740975709&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=FP7dDnkrLlOZHmRRORVqbLOtv9c%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/u6qw3gxzu3b7sbj/u6qw3gxzu3b7sbj.diff.zip?Expires=1740975709&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=FP7dDnkrLlOZHmRRORVqbLOtv9c%3D</a></p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public CreateAppInstanceTicketResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static CreateAppInstanceTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceTicketResponseBody self = new CreateAppInstanceTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceTicketResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateAppInstanceTicketResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CreateAppInstanceTicketResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppInstanceTicketResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CreateAppInstanceTicketResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CreateAppInstanceTicketResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public CreateAppInstanceTicketResponseBody setModule(CreateAppInstanceTicketResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateAppInstanceTicketResponseBodyModule getModule() {
        return this.module;
    }

    public CreateAppInstanceTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppInstanceTicketResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public CreateAppInstanceTicketResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public CreateAppInstanceTicketResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class CreateAppInstanceTicketResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1768619049924</p>
         */
        @NameInMap("AccessTokenExpiresAt")
        public String accessTokenExpiresAt;

        /**
         * <strong>example:</strong>
         * <p>1768619049924</p>
         */
        @NameInMap("AccessTokenIssuedAt")
        public String accessTokenIssuedAt;

        /**
         * <strong>example:</strong>
         * <p>be9750d595b6cd7c93a80b46</p>
         */
        @NameInMap("AccessTokenValue")
        public String accessTokenValue;

        /**
         * <strong>example:</strong>
         * <p>12343131221311</p>
         */
        @NameInMap("AliyunPk")
        public String aliyunPk;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;resourceGroupId\&quot;:\&quot;\&quot;,\&quot;page\&quot;:1,\&quot;size\&quot;:10,\&quot;selected\&quot;:\&quot;[\\\&quot;kvstore\\\&quot;]\&quot;}</p>
         */
        @NameInMap("Attributes")
        public String attributes;

        /**
         * <strong>example:</strong>
         * <p>authorization_code</p>
         */
        @NameInMap("AuthorizationGrantType")
        public String authorizationGrantType;

        /**
         * <p>bid</p>
         * 
         * <strong>example:</strong>
         * <p>123131</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <strong>example:</strong>
         * <p>12343131221311</p>
         */
        @NameInMap("ParentPk")
        public String parentPk;

        /**
         * <strong>example:</strong>
         * <p>1768619049924</p>
         */
        @NameInMap("RefreshTokenExpiresAt")
        public String refreshTokenExpiresAt;

        /**
         * <strong>example:</strong>
         * <p>1768619049924</p>
         */
        @NameInMap("RefreshTokenIssuedAt")
        public String refreshTokenIssuedAt;

        /**
         * <strong>example:</strong>
         * <p>be9750d595b6cd7c93a80b46</p>
         */
        @NameInMap("RefreshTokenValue")
        public String refreshTokenValue;

        /**
         * <strong>example:</strong>
         * <p>hdm_33be9750d595b6cd7c93a80b46734b22</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static CreateAppInstanceTicketResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateAppInstanceTicketResponseBodyModule self = new CreateAppInstanceTicketResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateAppInstanceTicketResponseBodyModule setAccessTokenExpiresAt(String accessTokenExpiresAt) {
            this.accessTokenExpiresAt = accessTokenExpiresAt;
            return this;
        }
        public String getAccessTokenExpiresAt() {
            return this.accessTokenExpiresAt;
        }

        public CreateAppInstanceTicketResponseBodyModule setAccessTokenIssuedAt(String accessTokenIssuedAt) {
            this.accessTokenIssuedAt = accessTokenIssuedAt;
            return this;
        }
        public String getAccessTokenIssuedAt() {
            return this.accessTokenIssuedAt;
        }

        public CreateAppInstanceTicketResponseBodyModule setAccessTokenValue(String accessTokenValue) {
            this.accessTokenValue = accessTokenValue;
            return this;
        }
        public String getAccessTokenValue() {
            return this.accessTokenValue;
        }

        public CreateAppInstanceTicketResponseBodyModule setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public CreateAppInstanceTicketResponseBodyModule setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public CreateAppInstanceTicketResponseBodyModule setAuthorizationGrantType(String authorizationGrantType) {
            this.authorizationGrantType = authorizationGrantType;
            return this;
        }
        public String getAuthorizationGrantType() {
            return this.authorizationGrantType;
        }

        public CreateAppInstanceTicketResponseBodyModule setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public CreateAppInstanceTicketResponseBodyModule setParentPk(String parentPk) {
            this.parentPk = parentPk;
            return this;
        }
        public String getParentPk() {
            return this.parentPk;
        }

        public CreateAppInstanceTicketResponseBodyModule setRefreshTokenExpiresAt(String refreshTokenExpiresAt) {
            this.refreshTokenExpiresAt = refreshTokenExpiresAt;
            return this;
        }
        public String getRefreshTokenExpiresAt() {
            return this.refreshTokenExpiresAt;
        }

        public CreateAppInstanceTicketResponseBodyModule setRefreshTokenIssuedAt(String refreshTokenIssuedAt) {
            this.refreshTokenIssuedAt = refreshTokenIssuedAt;
            return this;
        }
        public String getRefreshTokenIssuedAt() {
            return this.refreshTokenIssuedAt;
        }

        public CreateAppInstanceTicketResponseBodyModule setRefreshTokenValue(String refreshTokenValue) {
            this.refreshTokenValue = refreshTokenValue;
            return this;
        }
        public String getRefreshTokenValue() {
            return this.refreshTokenValue;
        }

        public CreateAppInstanceTicketResponseBodyModule setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
