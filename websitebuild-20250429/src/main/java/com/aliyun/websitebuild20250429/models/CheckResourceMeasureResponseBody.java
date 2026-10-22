// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CheckResourceMeasureResponseBody extends TeaModel {
    /**
     * <p>The detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Specifies whether retries are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The application name.</p>
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
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The application module.</p>
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
     * <p>The root error code.</p>
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
     * <p>The backup parameter.</p>
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
         * <p>The desired total returned only for APP_WORKSPACE. This is the target total for the current check, which is the sum of the existing usage in the saved configuration and ResourceValue. If the compatible DesiredTotal is provided, this total is used directly. The existing usage of issues is the sum of common and word-of-mouth issues in the saved configuration, and the existing usage of competitors is the number of competitors. This parameter is empty for APP and USER checks.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("DesiredTotal")
        public Long desiredTotal;

        /**
         * <p>The error code returned when the check fails. This parameter is null when the check passes.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the check fails. This parameter is null when the check passes.</p>
         * 
         * <strong>example:</strong>
         * <p>stream push failed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The limit returned only for APP_WORKSPACE quantity pre-checks. This is the maximum number of issues or competitors allowed by the current commodity edition, not the remaining quota. This parameter is empty for APP and USER checks or when the edition benefits cannot be determined.</p>
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
         * <p>The resource identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>TransitRouterVpcAttachment</p>
         */
        @NameInMap("ResourceCode")
        public String resourceCode;

        /**
         * <p>Indicates whether a purchasable higher edition that can accommodate the DesiredTotal exists. This parameter is true only when the capacity of the current edition is insufficient and a higher edition meets the requirements. Otherwise, this parameter is false. This parameter may be empty for APP and USER checks. This field does not indicate that an upgrade has been performed or an upgrade order has been created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UpgradeAvailable")
        public Boolean upgradeAvailable;

        public static CheckResourceMeasureResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckResourceMeasureResponseBodyModule self = new CheckResourceMeasureResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckResourceMeasureResponseBodyModule setDesiredTotal(Long desiredTotal) {
            this.desiredTotal = desiredTotal;
            return this;
        }
        public Long getDesiredTotal() {
            return this.desiredTotal;
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

        public CheckResourceMeasureResponseBodyModule setLimit(Long limit) {
            this.limit = limit;
            return this;
        }
        public Long getLimit() {
            return this.limit;
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

        public CheckResourceMeasureResponseBodyModule setUpgradeAvailable(Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }
        public Boolean getUpgradeAvailable() {
            return this.upgradeAvailable;
        }

    }

}
