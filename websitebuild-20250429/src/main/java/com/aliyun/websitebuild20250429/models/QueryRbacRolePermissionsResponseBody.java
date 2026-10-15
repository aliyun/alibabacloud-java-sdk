// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRolePermissionsResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
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
     * <p>The application name. The application with this name is queried.</p>
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
     * <p>The dynamic message. This parameter is not in use. Ignore this parameter.</p>
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
     * <p>Indicates whether the operation is successful.</p>
     */
    @NameInMap("Module")
    public QueryRbacRolePermissionsResponseBodyModule module;

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
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Indicates whether the request is synchronously processed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static QueryRbacRolePermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacRolePermissionsResponseBody self = new QueryRbacRolePermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRbacRolePermissionsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryRbacRolePermissionsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryRbacRolePermissionsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryRbacRolePermissionsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryRbacRolePermissionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryRbacRolePermissionsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryRbacRolePermissionsResponseBody setModule(QueryRbacRolePermissionsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryRbacRolePermissionsResponseBodyModule getModule() {
        return this.module;
    }

    public QueryRbacRolePermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRbacRolePermissionsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryRbacRolePermissionsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryRbacRolePermissionsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryRbacRolePermissionsResponseBodyModuleData extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to <strong>DeleteIntegration</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>js</p>
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
         * <p>The alert rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6wxzsjwavr2kyq92slf-80-clb4</p>
         */
        @NameInMap("Resource")
        public String resource;

        public static QueryRbacRolePermissionsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            QueryRbacRolePermissionsResponseBodyModuleData self = new QueryRbacRolePermissionsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public QueryRbacRolePermissionsResponseBodyModuleData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryRbacRolePermissionsResponseBodyModuleData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryRbacRolePermissionsResponseBodyModuleData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRbacRolePermissionsResponseBodyModuleData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class QueryRbacRolePermissionsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to <strong>GetCreateCustomerInfomation</strong>.</p>
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
         * <p>The statistical method for the Warn level.</p>
         * <p>The value of <code>Statistics</code> varies by cloud service. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Cloud service monitoring items</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mwaf-apisec0629.wafqax.top-waf</p>
         */
        @NameInMap("Resource")
        public String resource;

        public static QueryRbacRolePermissionsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            QueryRbacRolePermissionsResponseBodyModuleNext self = new QueryRbacRolePermissionsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public QueryRbacRolePermissionsResponseBodyModuleNext setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryRbacRolePermissionsResponseBodyModuleNext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryRbacRolePermissionsResponseBodyModuleNext setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRbacRolePermissionsResponseBodyModuleNext setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class QueryRbacRolePermissionsResponseBodyModule extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>The request result.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryRbacRolePermissionsResponseBodyModuleData> data;

        /**
         * <p>The next feature ID.</p>
         */
        @NameInMap("Next")
        public QueryRbacRolePermissionsResponseBodyModuleNext next;

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
         * <p>The server processes up to 1,000 recent records beyond the pagination limit for the current query. If the results exceed 1,000 records, <strong>ResultLimit</strong> is <strong>true</strong>. In this case, narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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
         * <p>0</p>
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

        public static QueryRbacRolePermissionsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryRbacRolePermissionsResponseBodyModule self = new QueryRbacRolePermissionsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryRbacRolePermissionsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public QueryRbacRolePermissionsResponseBodyModule setData(java.util.List<QueryRbacRolePermissionsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRbacRolePermissionsResponseBodyModuleData> getData() {
            return this.data;
        }

        public QueryRbacRolePermissionsResponseBodyModule setNext(QueryRbacRolePermissionsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public QueryRbacRolePermissionsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public QueryRbacRolePermissionsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public QueryRbacRolePermissionsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRbacRolePermissionsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public QueryRbacRolePermissionsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public QueryRbacRolePermissionsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public QueryRbacRolePermissionsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
