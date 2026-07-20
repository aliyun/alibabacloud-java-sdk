// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacPermissionsResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access was denied.</p>
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
     * <p>The dynamic message.</p>
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
     * <p>The number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response object.</p>
     */
    @NameInMap("Module")
    public ListRbacPermissionsResponseBodyModule module;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
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
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.EROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>The exception message.</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
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

    public static ListRbacPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRbacPermissionsResponseBody self = new ListRbacPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRbacPermissionsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListRbacPermissionsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListRbacPermissionsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListRbacPermissionsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListRbacPermissionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListRbacPermissionsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListRbacPermissionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRbacPermissionsResponseBody setModule(ListRbacPermissionsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListRbacPermissionsResponseBodyModule getModule() {
        return this.module;
    }

    public ListRbacPermissionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRbacPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRbacPermissionsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListRbacPermissionsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListRbacPermissionsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListRbacPermissionsResponseBodyModuleData extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to <strong>GetDISyncInstanceInfo</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>monitor</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The scenario description.</p>
         * 
         * <strong>example:</strong>
         * <p>lshm-mysql-coypt</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9953352</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The allocated log storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>sjapi-h5.aihuishou.com-waf</p>
         */
        @NameInMap("Resource")
        public String resource;

        public static ListRbacPermissionsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListRbacPermissionsResponseBodyModuleData self = new ListRbacPermissionsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListRbacPermissionsResponseBodyModuleData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListRbacPermissionsResponseBodyModuleData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRbacPermissionsResponseBodyModuleData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacPermissionsResponseBodyModuleData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class ListRbacPermissionsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to <strong>GetRemind</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The scenario description.</p>
         * 
         * <strong>example:</strong>
         * <p>lx_supabase_test_02</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000039405002</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The resource metadata declaration.</p>
         * <p><strong>Note</strong>: The metadata is constrained by <a href="https://www.alibabacloud.com/help/en/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema</a>.resources. A valid resource declaration must include the full-path metadata declaration from level 0 to the validLeaf level.</p>
         * <p>Appendix: <a href="https://www.alibabacloud.com/help/zh/dataworks/developer-reference/resourceschema-template-instructions">ResourceSchema documentation on the international site</a></p>
         * 
         * <strong>example:</strong>
         * <p>buy</p>
         */
        @NameInMap("Resource")
        public String resource;

        public static ListRbacPermissionsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListRbacPermissionsResponseBodyModuleNext self = new ListRbacPermissionsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListRbacPermissionsResponseBodyModuleNext setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListRbacPermissionsResponseBodyModuleNext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRbacPermissionsResponseBodyModuleNext setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacPermissionsResponseBodyModuleNext setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class ListRbacPermissionsResponseBodyModule extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>The query results.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListRbacPermissionsResponseBodyModuleData> data;

        /**
         * <p>The next feature ID.</p>
         */
        @NameInMap("Next")
        public ListRbacPermissionsResponseBodyModuleNext next;

        /**
         * <p>Indicates whether a next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>The page size.</p>
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
         * <p>Apart from pagination limits, the server processes up to 1000 recent records for the current query. If the results exceed 1000 entries, <strong>ResultLimit</strong> is <strong>true</strong>. Narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
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

        public static ListRbacPermissionsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListRbacPermissionsResponseBodyModule self = new ListRbacPermissionsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListRbacPermissionsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListRbacPermissionsResponseBodyModule setData(java.util.List<ListRbacPermissionsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRbacPermissionsResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListRbacPermissionsResponseBodyModule setNext(ListRbacPermissionsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListRbacPermissionsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListRbacPermissionsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListRbacPermissionsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRbacPermissionsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListRbacPermissionsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListRbacPermissionsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListRbacPermissionsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
