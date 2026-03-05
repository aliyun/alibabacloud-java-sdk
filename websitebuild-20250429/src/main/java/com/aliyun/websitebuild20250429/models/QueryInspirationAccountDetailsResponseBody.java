// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationAccountDetailsResponseBody extends TeaModel {
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
     * <p>or</p>
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
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public QueryInspirationAccountDetailsResponseBodyModule module;

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

    public static QueryInspirationAccountDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationAccountDetailsResponseBody self = new QueryInspirationAccountDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInspirationAccountDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryInspirationAccountDetailsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryInspirationAccountDetailsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryInspirationAccountDetailsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryInspirationAccountDetailsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryInspirationAccountDetailsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryInspirationAccountDetailsResponseBody setModule(QueryInspirationAccountDetailsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryInspirationAccountDetailsResponseBodyModule getModule() {
        return this.module;
    }

    public QueryInspirationAccountDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInspirationAccountDetailsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryInspirationAccountDetailsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryInspirationAccountDetailsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryInspirationAccountDetailsResponseBodyModuleData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-03-03 12:00:00</p>
         */
        @NameInMap("AcquisitionTime")
        public String acquisitionTime;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Balance")
        public Long balance;

        /**
         * <strong>example:</strong>
         * <p>2025-04-11 10:26:27 +0800</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("InitQuota")
        public Long initQuota;

        /**
         * <strong>example:</strong>
         * <p>MARKET_CLOUD_DREAM</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>FREE_TRIAL_GIFT</p>
         */
        @NameInMap("SourceTypeName")
        public String sourceTypeName;

        public static QueryInspirationAccountDetailsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationAccountDetailsResponseBodyModuleData self = new QueryInspirationAccountDetailsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public QueryInspirationAccountDetailsResponseBodyModuleData setAcquisitionTime(String acquisitionTime) {
            this.acquisitionTime = acquisitionTime;
            return this;
        }
        public String getAcquisitionTime() {
            return this.acquisitionTime;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleData setBalance(Long balance) {
            this.balance = balance;
            return this;
        }
        public Long getBalance() {
            return this.balance;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleData setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleData setInitQuota(Long initQuota) {
            this.initQuota = initQuota;
            return this;
        }
        public Long getInitQuota() {
            return this.initQuota;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleData setSourceTypeName(String sourceTypeName) {
            this.sourceTypeName = sourceTypeName;
            return this;
        }
        public String getSourceTypeName() {
            return this.sourceTypeName;
        }

    }

    public static class QueryInspirationAccountDetailsResponseBodyModuleNext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-03-03 12:00:00</p>
         */
        @NameInMap("AcquisitionTime")
        public String acquisitionTime;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Balance")
        public Long balance;

        /**
         * <strong>example:</strong>
         * <p>2026-02-25 10:11:25</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Expired")
        public Boolean expired;

        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("InitQuota")
        public Long initQuota;

        /**
         * <strong>example:</strong>
         * <p>MARKET_CLOUD_DREAM</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>FREE_TRIAL_GIFT</p>
         */
        @NameInMap("SourceTypeName")
        public String sourceTypeName;

        public static QueryInspirationAccountDetailsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationAccountDetailsResponseBodyModuleNext self = new QueryInspirationAccountDetailsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public QueryInspirationAccountDetailsResponseBodyModuleNext setAcquisitionTime(String acquisitionTime) {
            this.acquisitionTime = acquisitionTime;
            return this;
        }
        public String getAcquisitionTime() {
            return this.acquisitionTime;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleNext setBalance(Long balance) {
            this.balance = balance;
            return this;
        }
        public Long getBalance() {
            return this.balance;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleNext setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleNext setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleNext setInitQuota(Long initQuota) {
            this.initQuota = initQuota;
            return this;
        }
        public Long getInitQuota() {
            return this.initQuota;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleNext setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryInspirationAccountDetailsResponseBodyModuleNext setSourceTypeName(String sourceTypeName) {
            this.sourceTypeName = sourceTypeName;
            return this;
        }
        public String getSourceTypeName() {
            return this.sourceTypeName;
        }

    }

    public static class QueryInspirationAccountDetailsResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<QueryInspirationAccountDetailsResponseBodyModuleData> data;

        @NameInMap("Next")
        public QueryInspirationAccountDetailsResponseBodyModuleNext next;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static QueryInspirationAccountDetailsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationAccountDetailsResponseBodyModule self = new QueryInspirationAccountDetailsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryInspirationAccountDetailsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setData(java.util.List<QueryInspirationAccountDetailsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryInspirationAccountDetailsResponseBodyModuleData> getData() {
            return this.data;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setNext(QueryInspirationAccountDetailsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public QueryInspirationAccountDetailsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public QueryInspirationAccountDetailsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
