// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckResourceMeasureResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Is retry allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App Name.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message used to replace <code>%s</code> in the <strong>ErrMessage</strong> error message.  </p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the provided request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Application module</p>
     */
    @NameInMap("Module")
    public CheckResourceMeasureResponseBodyModule module;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>Abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static CheckResourceMeasureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceMeasureResponseBody self = new CheckResourceMeasureResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckResourceMeasureResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckResourceMeasureResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CheckResourceMeasureResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CheckResourceMeasureResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CheckResourceMeasureResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CheckResourceMeasureResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public CheckResourceMeasureResponseBody setModule(CheckResourceMeasureResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CheckResourceMeasureResponseBodyModule getModule() {
        return this.module;
    }

    public CheckResourceMeasureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckResourceMeasureResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public CheckResourceMeasureResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public CheckResourceMeasureResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class CheckResourceMeasureResponseBodyModule extends TeaModel {
        /**
         * <p>Error code when failed; null when passed</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Error message when failed; null when passed</p>
         * 
         * <strong>example:</strong>
         * <p>stream push failed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Is the check passed</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Passed")
        public Boolean passed;

        /**
         * <p>Resource identity</p>
         * 
         * <strong>example:</strong>
         * <p>TransitRouterVpcAttachment</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        public static CheckResourceMeasureResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckResourceMeasureResponseBodyModule self = new CheckResourceMeasureResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckResourceMeasureResponseBodyModule setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CheckResourceMeasureResponseBodyModule setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CheckResourceMeasureResponseBodyModule setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public CheckResourceMeasureResponseBodyModule setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

    }

}
