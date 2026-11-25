// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckUserResourceMeasureResponseBody extends TeaModel {
    /**
     * <p>The detailed reasons for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Specifies whether retries are allowed. Valid values:</p>
     * <ul>
     * <li>false: Retries are not allowed.</li>
     * <li>true: Retries are allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name, which is used to query the application.</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace <code>%s</code> in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
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
     * <p>The returned object.</p>
     */
    @NameInMap("Module")
    public CheckUserResourceMeasureResponseBodyModule module;

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
     * <p>System exception</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static CheckUserResourceMeasureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserResourceMeasureResponseBody self = new CheckUserResourceMeasureResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserResourceMeasureResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckUserResourceMeasureResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public CheckUserResourceMeasureResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CheckUserResourceMeasureResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public CheckUserResourceMeasureResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public CheckUserResourceMeasureResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public CheckUserResourceMeasureResponseBody setModule(CheckUserResourceMeasureResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CheckUserResourceMeasureResponseBodyModule getModule() {
        return this.module;
    }

    public CheckUserResourceMeasureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUserResourceMeasureResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public CheckUserResourceMeasureResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public CheckUserResourceMeasureResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class CheckUserResourceMeasureResponseBodyModule extends TeaModel {
        /**
         * <p>The target total for the current check. This parameter is returned only for APP_WORKSPACE. It is the sum of the used quota in the saved configuration and ResourceValue. If the compatible DesiredTotal is provided, this total is used directly. The used quota for questions is the sum of common and word-of-mouth questions in the saved configuration, and the used quota for competitors is the number of competitors. This parameter is empty for APP or USER checks.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("DesiredTotal")
        public Long desiredTotal;

        /**
         * <p>The error code returned when the check fails. This parameter is null when the check is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the check fails. This parameter is null when the check is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>stream push failed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The maximum number of questions or competitors allowed by the current commodity version. This parameter is returned only for APP_WORKSPACE quantity dry runs and does not represent the remaining quota. This parameter is empty for APP or USER checks, or when the version benefits cannot be determined.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Limit")
        public Long limit;

        /**
         * <p>Indicates whether the check is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Passed")
        public Boolean passed;

        /**
         * <p>The resource code.</p>
         * 
         * <strong>example:</strong>
         * <p>TransitRouterVpcAttachment</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>Indicates whether a purchasable higher version exists that can accommodate the DesiredTotal. This parameter is true only when the current version capacity is insufficient and a higher version meets the requirements. Otherwise, it is false. This parameter may be empty for APP or USER checks. This field does not indicate that an upgrade has been performed or an upgrade order has been created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UpgradeAvailable")
        public Boolean upgradeAvailable;

        public static CheckUserResourceMeasureResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckUserResourceMeasureResponseBodyModule self = new CheckUserResourceMeasureResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckUserResourceMeasureResponseBodyModule setDesiredTotal(Long desiredTotal) {
            this.desiredTotal = desiredTotal;
            return this;
        }
        public Long getDesiredTotal() {
            return this.desiredTotal;
        }

        public CheckUserResourceMeasureResponseBodyModule setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CheckUserResourceMeasureResponseBodyModule setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CheckUserResourceMeasureResponseBodyModule setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
        }

        public CheckUserResourceMeasureResponseBodyModule setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public CheckUserResourceMeasureResponseBodyModule setResourceCode(String resourceCode) {
            this.resourceCode = resourceCode;
            return this;
        }
        public String getResourceCode() {
            return this.resourceCode;
        }

        public CheckUserResourceMeasureResponseBodyModule setUpgradeAvailable(Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }
        public Boolean getUpgradeAvailable() {
            return this.upgradeAvailable;
        }

    }

}
