// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppDomainRedirectRecordsResponseBody extends TeaModel {
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
     * <p>Frontend application name.</p>
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
     * <p>Dynamic message, currently unused, please ignore</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Number of results per query.</p>
     * <p>Range: 10~100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("Module")
    public ListAppDomainRedirectRecordsResponseBodyModule module;

    /**
     * <p>下一个查询开始的Token。没有下一个查询时为空。</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>ID of the request</p>
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
     * <p>Exception message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Whether it is processed synchronously</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppDomainRedirectRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppDomainRedirectRecordsResponseBody self = new ListAppDomainRedirectRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppDomainRedirectRecordsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppDomainRedirectRecordsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppDomainRedirectRecordsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppDomainRedirectRecordsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppDomainRedirectRecordsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppDomainRedirectRecordsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppDomainRedirectRecordsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppDomainRedirectRecordsResponseBody setModule(ListAppDomainRedirectRecordsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppDomainRedirectRecordsResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppDomainRedirectRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppDomainRedirectRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppDomainRedirectRecordsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppDomainRedirectRecordsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppDomainRedirectRecordsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppDomainRedirectRecordsResponseBodyModuleData extends TeaModel {
        /**
         * <p>Redirect record ID</p>
         * 
         * <strong>example:</strong>
         * <p>f0379419-433d-410e-98d9-bf5c72f47227</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>Source domain</p>
         * 
         * <strong>example:</strong>
         * <p>abc.wanwang.xin</p>
         */
        @NameInMap("SourceDomain")
        public String sourceDomain;

        /**
         * <p>目标域名</p>
         * 
         * <strong>example:</strong>
         * <p>aliyuncs.com</p>
         */
        @NameInMap("TargetDomain")
        public String targetDomain;

        public static ListAppDomainRedirectRecordsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListAppDomainRedirectRecordsResponseBodyModuleData self = new ListAppDomainRedirectRecordsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListAppDomainRedirectRecordsResponseBodyModuleData setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListAppDomainRedirectRecordsResponseBodyModuleData setSourceDomain(String sourceDomain) {
            this.sourceDomain = sourceDomain;
            return this;
        }
        public String getSourceDomain() {
            return this.sourceDomain;
        }

        public ListAppDomainRedirectRecordsResponseBodyModuleData setTargetDomain(String targetDomain) {
            this.targetDomain = targetDomain;
            return this;
        }
        public String getTargetDomain() {
            return this.targetDomain;
        }

    }

    public static class ListAppDomainRedirectRecordsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>Redirect record ID</p>
         * 
         * <strong>example:</strong>
         * <p>936956504373539840</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <p>Source domain</p>
         * 
         * <strong>example:</strong>
         * <p>abc.wanwang.xin</p>
         */
        @NameInMap("SourceDomain")
        public String sourceDomain;

        /**
         * <p>Target domain</p>
         * 
         * <strong>example:</strong>
         * <p>aliyuncs.com</p>
         */
        @NameInMap("TargetDomain")
        public String targetDomain;

        public static ListAppDomainRedirectRecordsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListAppDomainRedirectRecordsResponseBodyModuleNext self = new ListAppDomainRedirectRecordsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListAppDomainRedirectRecordsResponseBodyModuleNext setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListAppDomainRedirectRecordsResponseBodyModuleNext setSourceDomain(String sourceDomain) {
            this.sourceDomain = sourceDomain;
            return this;
        }
        public String getSourceDomain() {
            return this.sourceDomain;
        }

        public ListAppDomainRedirectRecordsResponseBodyModuleNext setTargetDomain(String targetDomain) {
            this.targetDomain = targetDomain;
            return this;
        }
        public String getTargetDomain() {
            return this.targetDomain;
        }

    }

    public static class ListAppDomainRedirectRecordsResponseBodyModule extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>Member name.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAppDomainRedirectRecordsResponseBodyModuleData> data;

        /**
         * <p>Next feature ID</p>
         */
        @NameInMap("Next")
        public ListAppDomainRedirectRecordsResponseBodyModuleNext next;

        /**
         * <p>Whether there is a next page</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Whether there is a previous page.</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <p>Apart from pagination limits, the server processes up to the most recent 1000 records. If the result exceeds 1000, <strong>ResultLimit</strong> is <strong>true</strong>, please narrow down the time range and search again; otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
         */
        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static ListAppDomainRedirectRecordsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppDomainRedirectRecordsResponseBodyModule self = new ListAppDomainRedirectRecordsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setData(java.util.List<ListAppDomainRedirectRecordsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAppDomainRedirectRecordsResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setNext(ListAppDomainRedirectRecordsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListAppDomainRedirectRecordsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListAppDomainRedirectRecordsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
