// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GrantPromotionOfferForPartnerResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name. The name can contain digits, letters, and hyphens (-). It must start with a letter and cannot end with a hyphen (-). The name cannot exceed 36 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic code. This parameter is not in use. Ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The returned error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public GrantPromotionOfferForPartnerResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The exception message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is processed synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GrantPromotionOfferForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantPromotionOfferForPartnerResponseBody self = new GrantPromotionOfferForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantPromotionOfferForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GrantPromotionOfferForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GrantPromotionOfferForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GrantPromotionOfferForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GrantPromotionOfferForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GrantPromotionOfferForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GrantPromotionOfferForPartnerResponseBody setModule(GrantPromotionOfferForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GrantPromotionOfferForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public GrantPromotionOfferForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantPromotionOfferForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GrantPromotionOfferForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GrantPromotionOfferForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GrantPromotionOfferForPartnerResponseBodyModule extends TeaModel {
        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>系统异常</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The benefit summary.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OfferSummary")
        public String offerSummary;

        /**
         * <p>The distribution record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5094</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GrantPromotionOfferForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GrantPromotionOfferForPartnerResponseBodyModule self = new GrantPromotionOfferForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GrantPromotionOfferForPartnerResponseBodyModule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GrantPromotionOfferForPartnerResponseBodyModule setOfferSummary(String offerSummary) {
            this.offerSummary = offerSummary;
            return this;
        }
        public String getOfferSummary() {
            return this.offerSummary;
        }

        public GrantPromotionOfferForPartnerResponseBodyModule setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public GrantPromotionOfferForPartnerResponseBodyModule setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
