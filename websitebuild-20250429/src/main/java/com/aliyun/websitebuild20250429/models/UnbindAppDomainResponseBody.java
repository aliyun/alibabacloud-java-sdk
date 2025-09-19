// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UnbindAppDomainResponseBody extends TeaModel {
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
     * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/wlr10v1g25549kq/wlr10v1g25549kq.diff.zip?Expires=1730174953&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=F93JAFEuVN63YzNQyUy2xOaOtKs%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/wlr10v1g25549kq/wlr10v1g25549kq.diff.zip?Expires=1730174953&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=F93JAFEuVN63YzNQyUy2xOaOtKs%3D</a></p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public UnbindAppDomainResponseBodyModule module;

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

    public static UnbindAppDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAppDomainResponseBody self = new UnbindAppDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAppDomainResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UnbindAppDomainResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public UnbindAppDomainResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UnbindAppDomainResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public UnbindAppDomainResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public UnbindAppDomainResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public UnbindAppDomainResponseBody setModule(UnbindAppDomainResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public UnbindAppDomainResponseBodyModule getModule() {
        return this.module;
    }

    public UnbindAppDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindAppDomainResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public UnbindAppDomainResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public UnbindAppDomainResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class UnbindAppDomainResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UnbindAppDomainResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            UnbindAppDomainResponseBodyModule self = new UnbindAppDomainResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public UnbindAppDomainResponseBodyModule setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
