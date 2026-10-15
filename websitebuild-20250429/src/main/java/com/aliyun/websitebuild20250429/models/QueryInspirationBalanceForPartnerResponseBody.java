// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationBalanceForPartnerResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
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
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>ish-intelligence-store-platform-admin-web</p>
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
     * <p>The dynamic message.</p>
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
    public QueryInspirationBalanceForPartnerResponseBodyModule module;

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
     * <p>The error message.</p>
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

    public static QueryInspirationBalanceForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationBalanceForPartnerResponseBody self = new QueryInspirationBalanceForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInspirationBalanceForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryInspirationBalanceForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryInspirationBalanceForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryInspirationBalanceForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryInspirationBalanceForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryInspirationBalanceForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryInspirationBalanceForPartnerResponseBody setModule(QueryInspirationBalanceForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryInspirationBalanceForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public QueryInspirationBalanceForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInspirationBalanceForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryInspirationBalanceForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryInspirationBalanceForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryInspirationBalanceForPartnerResponseBodyModule extends TeaModel {
        /**
         * <p>The remaining amount, calculated as totalQuota minus totalUsed.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Remaining")
        public Long remaining;

        /**
         * <p>The remaining amount as a precise value. This field is of the String type and supports decimal display.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainingStr")
        public String remainingStr;

        /**
         * <p>The total quota, which is the sum of initQuota for all valid accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalQuota")
        public Long totalQuota;

        /**
         * <p>The total quota as a precise value. This field is of the String type and supports decimal display.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalQuotaStr")
        public String totalQuotaStr;

        /**
         * <p>The total consumed amount, which is the sum of used for all valid accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalUsed")
        public Long totalUsed;

        /**
         * <p>The total consumed amount as a precise value. This field is of the String type and supports decimal display.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalUsedStr")
        public String totalUsedStr;

        public static QueryInspirationBalanceForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationBalanceForPartnerResponseBodyModule self = new QueryInspirationBalanceForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryInspirationBalanceForPartnerResponseBodyModule setRemaining(Long remaining) {
            this.remaining = remaining;
            return this;
        }
        public Long getRemaining() {
            return this.remaining;
        }

        public QueryInspirationBalanceForPartnerResponseBodyModule setRemainingStr(String remainingStr) {
            this.remainingStr = remainingStr;
            return this;
        }
        public String getRemainingStr() {
            return this.remainingStr;
        }

        public QueryInspirationBalanceForPartnerResponseBodyModule setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public QueryInspirationBalanceForPartnerResponseBodyModule setTotalQuotaStr(String totalQuotaStr) {
            this.totalQuotaStr = totalQuotaStr;
            return this;
        }
        public String getTotalQuotaStr() {
            return this.totalQuotaStr;
        }

        public QueryInspirationBalanceForPartnerResponseBodyModule setTotalUsed(Long totalUsed) {
            this.totalUsed = totalUsed;
            return this;
        }
        public Long getTotalUsed() {
            return this.totalUsed;
        }

        public QueryInspirationBalanceForPartnerResponseBodyModule setTotalUsedStr(String totalUsedStr) {
            this.totalUsedStr = totalUsedStr;
            return this;
        }
        public String getTotalUsedStr() {
            return this.totalUsedStr;
        }

    }

}
