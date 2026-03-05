// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationConsumeRecordsResponseBody extends TeaModel {
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
     * <p>ish-intelligence-store-platform-admin-web</p>
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
    public QueryInspirationConsumeRecordsResponseBodyModule module;

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

    public static QueryInspirationConsumeRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationConsumeRecordsResponseBody self = new QueryInspirationConsumeRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInspirationConsumeRecordsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryInspirationConsumeRecordsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryInspirationConsumeRecordsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryInspirationConsumeRecordsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryInspirationConsumeRecordsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryInspirationConsumeRecordsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryInspirationConsumeRecordsResponseBody setModule(QueryInspirationConsumeRecordsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryInspirationConsumeRecordsResponseBodyModule getModule() {
        return this.module;
    }

    public QueryInspirationConsumeRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInspirationConsumeRecordsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryInspirationConsumeRecordsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryInspirationConsumeRecordsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryInspirationConsumeRecordsResponseBodyModuleData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>2026-06-01 12:00:00</p>
         */
        @NameInMap("ConsumeTime")
        public String consumeTime;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;MD5\&quot;:\&quot;296f6c01e7fea2697ffe1cf41082b774\&quot;,\&quot;driver\&quot;:\&quot;vhd\&quot;,\&quot;flag\&quot;:\&quot;12845825\&quot;,\&quot;imds_support\&quot;:\&quot;v1\&quot;,\&quot;io_optimized\&quot;:true,\&quot;nvme_supported\&quot;:true,\&quot;uefi_preferred\&quot;:false}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("SceneName")
        public String sceneName;

        public static QueryInspirationConsumeRecordsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationConsumeRecordsResponseBodyModuleData self = new QueryInspirationConsumeRecordsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setConsumeTime(String consumeTime) {
            this.consumeTime = consumeTime;
            return this;
        }
        public String getConsumeTime() {
            return this.consumeTime;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

    public static class QueryInspirationConsumeRecordsResponseBodyModuleNext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <strong>example:</strong>
         * <p>2026-06-01 12:00:00</p>
         */
        @NameInMap("ConsumeTime")
        public String consumeTime;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;MD5\&quot;:\&quot;1042e65a2b7cdd3059b6a873ee1a3260\&quot;,\&quot;driver\&quot;:\&quot;vhd\&quot;,\&quot;flag\&quot;:\&quot;12845825\&quot;,\&quot;imds_support\&quot;:\&quot;v1\&quot;,\&quot;io_optimized\&quot;:true,\&quot;nvme_supported\&quot;:true,\&quot;uefi_preferred\&quot;:false}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        @NameInMap("SceneName")
        public String sceneName;

        public static QueryInspirationConsumeRecordsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationConsumeRecordsResponseBodyModuleNext self = new QueryInspirationConsumeRecordsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleNext setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleNext setConsumeTime(String consumeTime) {
            this.consumeTime = consumeTime;
            return this;
        }
        public String getConsumeTime() {
            return this.consumeTime;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleNext setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleNext setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

    }

    public static class QueryInspirationConsumeRecordsResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<QueryInspirationConsumeRecordsResponseBodyModuleData> data;

        @NameInMap("Next")
        public QueryInspirationConsumeRecordsResponseBodyModuleNext next;

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

        public static QueryInspirationConsumeRecordsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryInspirationConsumeRecordsResponseBodyModule self = new QueryInspirationConsumeRecordsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setData(java.util.List<QueryInspirationConsumeRecordsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryInspirationConsumeRecordsResponseBodyModuleData> getData() {
            return this.data;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setNext(QueryInspirationConsumeRecordsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public QueryInspirationConsumeRecordsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public QueryInspirationConsumeRecordsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
