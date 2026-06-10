// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationBalanceResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Whether retry is allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>Application name; query the application with this name</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
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
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Fault parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public QueryInspirationBalanceResponseBodyModule module;

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
     * <p>Whether processing is synchronous</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static QueryInspirationBalanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationBalanceResponseBody self = new QueryInspirationBalanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInspirationBalanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryInspirationBalanceResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryInspirationBalanceResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryInspirationBalanceResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryInspirationBalanceResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryInspirationBalanceResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryInspirationBalanceResponseBody setModule(QueryInspirationBalanceResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryInspirationBalanceResponseBodyModule getModule() {
        return this.module;
    }

    public QueryInspirationBalanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInspirationBalanceResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryInspirationBalanceResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryInspirationBalanceResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryInspirationBalanceResponseBodyModule extends TeaModel {
        /**
         * <p>Remaining (totalQuota - totalUsed)</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        @NameInMap("RemainingStr")
        public String remainingStr;

        /**
         * <p>Total quota (sum of initQuota from all valid accounts)</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalQuota")
        public Long totalQuota;

        @NameInMap("TotalQuotaStr")
        public String totalQuotaStr;

        /**
         * <p>Consumed amount (sum of used from all valid accounts)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalUsed")
        public Long totalUsed;

        @NameInMap("TotalUsedStr")
        public String totalUsedStr;

        public static QueryInspirationBalanceResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationBalanceResponseBodyModule self = new QueryInspirationBalanceResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryInspirationBalanceResponseBodyModule setRemaining(Long remaining) {
            this.remaining = remaining;
            return this;
        }
        public Long getRemaining() {
            return this.remaining;
        }

        public QueryInspirationBalanceResponseBodyModule setRemainingStr(String remainingStr) {
            this.remainingStr = remainingStr;
            return this;
        }
        public String getRemainingStr() {
            return this.remainingStr;
        }

        public QueryInspirationBalanceResponseBodyModule setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public QueryInspirationBalanceResponseBodyModule setTotalQuotaStr(String totalQuotaStr) {
            this.totalQuotaStr = totalQuotaStr;
            return this;
        }
        public String getTotalQuotaStr() {
            return this.totalQuotaStr;
        }

        public QueryInspirationBalanceResponseBodyModule setTotalUsed(Long totalUsed) {
            this.totalUsed = totalUsed;
            return this;
        }
        public Long getTotalUsed() {
            return this.totalUsed;
        }

        public QueryInspirationBalanceResponseBodyModule setTotalUsedStr(String totalUsedStr) {
            this.totalUsedStr = totalUsedStr;
            return this;
        }
        public String getTotalUsedStr() {
            return this.totalUsedStr;
        }

    }

}
