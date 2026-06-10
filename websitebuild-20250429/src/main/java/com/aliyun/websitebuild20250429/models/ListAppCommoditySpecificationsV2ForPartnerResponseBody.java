// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppCommoditySpecificationsV2ForPartnerResponseBody extends TeaModel {
    /**
     * <p>permission denied information</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>is retry allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>App Name.</p>
     * 
     * <strong>example:</strong>
     * <p>or</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamic error message used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the provided request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>faulty parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Number of results per query.</p>
     * <p>Value range: 10–100. Default Value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule module;

    /**
     * <p>Token for the start of the next query. It is empty if there is no next query.</p>
     * 
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
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>is synchronous processing enabled</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppCommoditySpecificationsV2ForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppCommoditySpecificationsV2ForPartnerResponseBody self = new ListAppCommoditySpecificationsV2ForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setModule(ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppCommoditySpecificationsV2ForPartnerResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData extends TeaModel {
        /**
         * <p>API status or POP error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Default Value</p>
         */
        @NameInMap("Components")
        public java.util.Map<String, ModuleDataComponentsValue> components;

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>文件名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Duration.</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ModuleDataPropertiesValue> properties;

        public static ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData self = new ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData setComponents(java.util.Map<String, ModuleDataComponentsValue> components) {
            this.components = components;
            return this;
        }
        public java.util.Map<String, ModuleDataComponentsValue> getComponents() {
            return this.components;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData setProperties(java.util.Map<String, ModuleDataPropertiesValue> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ModuleDataPropertiesValue> getProperties() {
            return this.properties;
        }

    }

    public static class ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext extends TeaModel {
        /**
         * <p>API status or POP error code</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Default Value</p>
         */
        @NameInMap("Components")
        public java.util.Map<String, ModuleNextComponentsValue> components;

        /**
         * <p>Website Name</p>
         * 
         * <strong>example:</strong>
         * <p>docs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Frame rate.</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ModuleNextPropertiesValue> properties;

        public static ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext self = new ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext setComponents(java.util.Map<String, ModuleNextComponentsValue> components) {
            this.components = components;
            return this;
        }
        public java.util.Map<String, ModuleNextComponentsValue> getComponents() {
            return this.components;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext setProperties(java.util.Map<String, ModuleNextPropertiesValue> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ModuleNextPropertiesValue> getProperties() {
            return this.properties;
        }

    }

    public static class ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>Request result.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData> data;

        /**
         * <p>Next feature ID</p>
         */
        @NameInMap("Next")
        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext next;

        /**
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>Paging size.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Indicates whether there is a previous page.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <p>For the current query, aside from pagination limits, the server-side processes at most the latest 1 000 records. If the result exceeds 1 000 records, <strong>ResultLimit</strong> is <strong>true</strong>. You can narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
         */
        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        /**
         * <p>Total number of records.</p>
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

        public static ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule self = new ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setData(java.util.List<ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setNext(ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListAppCommoditySpecificationsV2ForPartnerResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
