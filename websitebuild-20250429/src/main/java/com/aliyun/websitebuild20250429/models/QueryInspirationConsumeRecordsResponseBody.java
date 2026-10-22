// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationConsumeRecordsResponseBody extends TeaModel {
    /**
     * <p>The detailed cause of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retries are allowed.</p>
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
     * <p>The dynamic message. This field is not in use and can be ignored.</p>
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
     * <p>Indicates whether the deletion is successful.</p>
     */
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
         * <p>The number of consumed inspiration points.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>The exact number of consumed inspiration points. The value is a string that supports decimal display.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("AmountStr")
        public String amountStr;

        /**
         * <p>The consumption time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01 12:00:00</p>
         */
        @NameInMap("ConsumeTime")
        public String consumeTime;

        /**
         * <p>The consumption type.</p>
         * 
         * <strong>example:</strong>
         * <p>1 round of conversation</p>
         */
        @NameInMap("ConsumeType")
        public String consumeType;

        /**
         * <p>The extended information in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;MD5\&quot;:\&quot;296f6c01e7fea2697ffe1cf41082b774\&quot;,\&quot;driver\&quot;:\&quot;vhd\&quot;,\&quot;flag\&quot;:\&quot;12845825\&quot;,\&quot;imds_support\&quot;:\&quot;v1\&quot;,\&quot;io_optimized\&quot;:true,\&quot;nvme_supported\&quot;:true,\&quot;uefi_preferred\&quot;:false}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>The unique identifier of the consumption record.</p>
         * 
         * <strong>example:</strong>
         * <p>RECORD_1</p>
         */
        @NameInMap("RecordKey")
        public String recordKey;

        /**
         * <p>The name of the consumption scenario, such as AI application development, AI creative image generation, AI video creation, and AI content creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Home improvement</p>
         */
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

        public QueryInspirationConsumeRecordsResponseBodyModuleData setAmountStr(String amountStr) {
            this.amountStr = amountStr;
            return this;
        }
        public String getAmountStr() {
            return this.amountStr;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setConsumeTime(String consumeTime) {
            this.consumeTime = consumeTime;
            return this;
        }
        public String getConsumeTime() {
            return this.consumeTime;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setMetaData(String metaData) {
            this.metaData = metaData;
            return this;
        }
        public String getMetaData() {
            return this.metaData;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleData setRecordKey(String recordKey) {
            this.recordKey = recordKey;
            return this;
        }
        public String getRecordKey() {
            return this.recordKey;
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
         * <p>The number of consumed inspiration points.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Amount")
        public Long amount;

        /**
         * <p>The exact number of consumed inspiration points. The value is a string that supports decimal display.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("AmountStr")
        public String amountStr;

        /**
         * <p>The consumption time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01 12:00:00</p>
         */
        @NameInMap("ConsumeTime")
        public String consumeTime;

        /**
         * <p>The consumption type.</p>
         * 
         * <strong>example:</strong>
         * <p>1 round of conversation</p>
         */
        @NameInMap("ConsumeType")
        public String consumeType;

        /**
         * <p>The extended information in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;MD5\&quot;:\&quot;1042e65a2b7cdd3059b6a873ee1a3260\&quot;,\&quot;driver\&quot;:\&quot;vhd\&quot;,\&quot;flag\&quot;:\&quot;12845825\&quot;,\&quot;imds_support\&quot;:\&quot;v1\&quot;,\&quot;io_optimized\&quot;:true,\&quot;nvme_supported\&quot;:true,\&quot;uefi_preferred\&quot;:false}</p>
         */
        @NameInMap("MetaData")
        public String metaData;

        /**
         * <p>The name of the consumption scenario, such as AI application development, AI creative image generation, AI video creation, and AI content creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Home improvement</p>
         */
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

        public QueryInspirationConsumeRecordsResponseBodyModuleNext setAmountStr(String amountStr) {
            this.amountStr = amountStr;
            return this;
        }
        public String getAmountStr() {
            return this.amountStr;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleNext setConsumeTime(String consumeTime) {
            this.consumeTime = consumeTime;
            return this;
        }
        public String getConsumeTime() {
            return this.consumeTime;
        }

        public QueryInspirationConsumeRecordsResponseBodyModuleNext setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>The request result.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryInspirationConsumeRecordsResponseBodyModuleData> data;

        /**
         * <p>The ID of the next feature.</p>
         */
        @NameInMap("Next")
        public QueryInspirationConsumeRecordsResponseBodyModuleNext next;

        /**
         * <p>Indicates whether a next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Indicates whether a previous page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <p>In addition to the pagination limit, the server processes a maximum of the latest 1,000 records for the current query. If the number of results exceeds 1,000, <strong>ResultLimit</strong> is <strong>true</strong>. Narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
         */
        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <p>The total number of pages.</p>
         * 
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
