// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RefreshAppInstanceTicketResponseBody extends TeaModel {
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
     * <p>mar</p>
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
     * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/uoa11auyf2565k6/uoa11auyf2565k6.sql.zip?Expires=1730520371&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=WIutxAQYbbwxX0aeKmdObduLnDg%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/uoa11auyf2565k6/uoa11auyf2565k6.sql.zip?Expires=1730520371&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=WIutxAQYbbwxX0aeKmdObduLnDg%3D</a></p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public RefreshAppInstanceTicketResponseBodyModule module;

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

    public static RefreshAppInstanceTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshAppInstanceTicketResponseBody self = new RefreshAppInstanceTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshAppInstanceTicketResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RefreshAppInstanceTicketResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public RefreshAppInstanceTicketResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RefreshAppInstanceTicketResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public RefreshAppInstanceTicketResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public RefreshAppInstanceTicketResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public RefreshAppInstanceTicketResponseBody setModule(RefreshAppInstanceTicketResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public RefreshAppInstanceTicketResponseBodyModule getModule() {
        return this.module;
    }

    public RefreshAppInstanceTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshAppInstanceTicketResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public RefreshAppInstanceTicketResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public RefreshAppInstanceTicketResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class RefreshAppInstanceTicketResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-18T22:30:00+08:00</p>
         */
        @NameInMap("AccessTokenExpiresAt")
        public String accessTokenExpiresAt;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T22:30:00+08:00</p>
         */
        @NameInMap("AccessTokenIssuedAt")
        public String accessTokenIssuedAt;

        /**
         * <strong>example:</strong>
         * <p>2108341e17661121129745384e79f9</p>
         */
        @NameInMap("AccessTokenValue")
        public String accessTokenValue;

        /**
         * <strong>example:</strong>
         * <p>1907880872137014</p>
         */
        @NameInMap("AliyunPk")
        public String aliyunPk;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
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
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <strong>example:</strong>
         * <p>1907880872137014</p>
         */
        @NameInMap("ParentPk")
        public String parentPk;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T22:30:00+08:00</p>
         */
        @NameInMap("RefreshTokenExpiresAt")
        public String refreshTokenExpiresAt;

        /**
         * <strong>example:</strong>
         * <p>2025-12-18T22:30:00+08:00</p>
         */
        @NameInMap("RefreshTokenIssuedAt")
        public String refreshTokenIssuedAt;

        /**
         * <strong>example:</strong>
         * <p>2108341e17661121129745384e79f9</p>
         */
        @NameInMap("RefreshTokenValue")
        public String refreshTokenValue;

        /**
         * <strong>example:</strong>
         * <p>357504C7F21FCAE502756332ECE8B533</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static RefreshAppInstanceTicketResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            RefreshAppInstanceTicketResponseBodyModule self = new RefreshAppInstanceTicketResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public RefreshAppInstanceTicketResponseBodyModule setAccessTokenExpiresAt(String accessTokenExpiresAt) {
            this.accessTokenExpiresAt = accessTokenExpiresAt;
            return this;
        }
        public String getAccessTokenExpiresAt() {
            return this.accessTokenExpiresAt;
        }

        public RefreshAppInstanceTicketResponseBodyModule setAccessTokenIssuedAt(String accessTokenIssuedAt) {
            this.accessTokenIssuedAt = accessTokenIssuedAt;
            return this;
        }
        public String getAccessTokenIssuedAt() {
            return this.accessTokenIssuedAt;
        }

        public RefreshAppInstanceTicketResponseBodyModule setAccessTokenValue(String accessTokenValue) {
            this.accessTokenValue = accessTokenValue;
            return this;
        }
        public String getAccessTokenValue() {
            return this.accessTokenValue;
        }

        public RefreshAppInstanceTicketResponseBodyModule setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public RefreshAppInstanceTicketResponseBodyModule setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public RefreshAppInstanceTicketResponseBodyModule setAuthorizationGrantType(String authorizationGrantType) {
            this.authorizationGrantType = authorizationGrantType;
            return this;
        }
        public String getAuthorizationGrantType() {
            return this.authorizationGrantType;
        }

        public RefreshAppInstanceTicketResponseBodyModule setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public RefreshAppInstanceTicketResponseBodyModule setParentPk(String parentPk) {
            this.parentPk = parentPk;
            return this;
        }
        public String getParentPk() {
            return this.parentPk;
        }

        public RefreshAppInstanceTicketResponseBodyModule setRefreshTokenExpiresAt(String refreshTokenExpiresAt) {
            this.refreshTokenExpiresAt = refreshTokenExpiresAt;
            return this;
        }
        public String getRefreshTokenExpiresAt() {
            return this.refreshTokenExpiresAt;
        }

        public RefreshAppInstanceTicketResponseBodyModule setRefreshTokenIssuedAt(String refreshTokenIssuedAt) {
            this.refreshTokenIssuedAt = refreshTokenIssuedAt;
            return this;
        }
        public String getRefreshTokenIssuedAt() {
            return this.refreshTokenIssuedAt;
        }

        public RefreshAppInstanceTicketResponseBodyModule setRefreshTokenValue(String refreshTokenValue) {
            this.refreshTokenValue = refreshTokenValue;
            return this;
        }
        public String getRefreshTokenValue() {
            return this.refreshTokenValue;
        }

        public RefreshAppInstanceTicketResponseBodyModule setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
