// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationBalanceResponseBody extends TeaModel {
    /**
     * <p>The detailed reason for the access denial.</p>
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
     * <p>The name of the application to query.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
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
     * <p>The dynamic error message used to replace <code>%s</code> in the error message of the <strong>ErrMessage</strong> response parameter. If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
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
     * <p>Specifies whether the request is processed synchronously.</p>
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
         * <p>The remaining quota, which is calculated by subtracting totalUsed from totalQuota.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        /**
         * <p>The string representation of the remaining quota.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("RemainingStr")
        public String remainingStr;

        /**
         * <p>The total quota, which is the sum of the initQuota values of all valid accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalQuota")
        public Long totalQuota;

        /**
         * <p>The string representation of the total quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalQuotaStr")
        public String totalQuotaStr;

        /**
         * <p>The used quota, which is the sum of the used values of all valid accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalUsed")
        public Long totalUsed;

        /**
         * <p>The string representation of the used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
