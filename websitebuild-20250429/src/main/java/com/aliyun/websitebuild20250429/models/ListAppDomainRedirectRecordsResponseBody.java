// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppDomainRedirectRecordsResponseBody extends TeaModel {
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
     * <p>spring-cloud-b</p>
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
     * <p><a href="https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/u6qw3gxzu3b7sbj/u6qw3gxzu3b7sbj.diff.zip?Expires=1740975709&OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&Signature=FP7dDnkrLlOZHmRRORVqbLOtv9c%3D">https://check-result-file-sh.oss-cn-shanghai.aliyuncs.com/u6qw3gxzu3b7sbj/u6qw3gxzu3b7sbj.diff.zip?Expires=1740975709&amp;OSSAccessKeyId=LTAI5tKUErVCETM4ev9SELNb&amp;Signature=FP7dDnkrLlOZHmRRORVqbLOtv9c%3D</a></p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Module")
    public ListAppDomainRedirectRecordsResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
         * <strong>example:</strong>
         * <p>f0379419-433d-410e-98d9-bf5c72f47227</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <strong>example:</strong>
         * <p>abc.wanwang.xin</p>
         */
        @NameInMap("SourceDomain")
        public String sourceDomain;

        /**
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
         * <strong>example:</strong>
         * <p>936956504373539840</p>
         */
        @NameInMap("RecordId")
        public String recordId;

        /**
         * <strong>example:</strong>
         * <p>abc.wanwang.xin</p>
         */
        @NameInMap("SourceDomain")
        public String sourceDomain;

        /**
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
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<ListAppDomainRedirectRecordsResponseBodyModuleData> data;

        @NameInMap("Next")
        public ListAppDomainRedirectRecordsResponseBodyModuleNext next;

        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

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
