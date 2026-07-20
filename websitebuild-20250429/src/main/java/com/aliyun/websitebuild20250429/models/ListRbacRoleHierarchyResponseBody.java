// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacRoleHierarchyResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether a retry is allowed. Valid values:</p>
     * <ul>
     * <li>false: No retry is allowed.</li>
     * <li>true: A retry is allowed.</li>
     * </ul>
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
     * <p>The dynamic error message, which is used to replace the <code>%s</code> variable in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the value of the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
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
    public ListRbacRoleHierarchyResponseBodyModule module;

    /**
     * <p>The token for the next query. This parameter is empty if no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
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
     * <p>SYSTEM.ERROR</p>
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
     * <p>Indicates whether the request is synchronously processed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListRbacRoleHierarchyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRbacRoleHierarchyResponseBody self = new ListRbacRoleHierarchyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRbacRoleHierarchyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListRbacRoleHierarchyResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListRbacRoleHierarchyResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListRbacRoleHierarchyResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListRbacRoleHierarchyResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListRbacRoleHierarchyResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListRbacRoleHierarchyResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRbacRoleHierarchyResponseBody setModule(ListRbacRoleHierarchyResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListRbacRoleHierarchyResponseBodyModule getModule() {
        return this.module;
    }

    public ListRbacRoleHierarchyResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRbacRoleHierarchyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRbacRoleHierarchyResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListRbacRoleHierarchyResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListRbacRoleHierarchyResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListRbacRoleHierarchyResponseBodyModuleData extends TeaModel {
        /**
         * <p>The child role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fc94cc51-310f-4485-adb2-ed8c706aff3b</p>
         */
        @NameInMap("ChildRoleId")
        public String childRoleId;

        /**
         * <p>The parent role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71e07711-9a17-49f4-9f83-387a60ee5b64</p>
         */
        @NameInMap("ParentRoleId")
        public String parentRoleId;

        public static ListRbacRoleHierarchyResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListRbacRoleHierarchyResponseBodyModuleData self = new ListRbacRoleHierarchyResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListRbacRoleHierarchyResponseBodyModuleData setChildRoleId(String childRoleId) {
            this.childRoleId = childRoleId;
            return this;
        }
        public String getChildRoleId() {
            return this.childRoleId;
        }

        public ListRbacRoleHierarchyResponseBodyModuleData setParentRoleId(String parentRoleId) {
            this.parentRoleId = parentRoleId;
            return this;
        }
        public String getParentRoleId() {
            return this.parentRoleId;
        }

    }

    public static class ListRbacRoleHierarchyResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The child role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fc94cc51-310f-4485-adb2-ed8c706aff3b</p>
         */
        @NameInMap("ChildRoleId")
        public String childRoleId;

        /**
         * <p>The parent role ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71e07711-9a17-49f4-9f83-387a60ee5b64</p>
         */
        @NameInMap("ParentRoleId")
        public String parentRoleId;

        public static ListRbacRoleHierarchyResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListRbacRoleHierarchyResponseBodyModuleNext self = new ListRbacRoleHierarchyResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListRbacRoleHierarchyResponseBodyModuleNext setChildRoleId(String childRoleId) {
            this.childRoleId = childRoleId;
            return this;
        }
        public String getChildRoleId() {
            return this.childRoleId;
        }

        public ListRbacRoleHierarchyResponseBodyModuleNext setParentRoleId(String parentRoleId) {
            this.parentRoleId = parentRoleId;
            return this;
        }
        public String getParentRoleId() {
            return this.parentRoleId;
        }

    }

    public static class ListRbacRoleHierarchyResponseBodyModule extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>The request results.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListRbacRoleHierarchyResponseBodyModuleData> data;

        /**
         * <p>The decision weight.</p>
         */
        @NameInMap("Next")
        public ListRbacRoleHierarchyResponseBodyModuleNext next;

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
         * <p>The server processes up to 1,000 most recent records beyond the pagination limit. If the results exceed 1,000 records, <strong>ResultLimit</strong> is <strong>true</strong>. In this case, narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static ListRbacRoleHierarchyResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListRbacRoleHierarchyResponseBodyModule self = new ListRbacRoleHierarchyResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListRbacRoleHierarchyResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListRbacRoleHierarchyResponseBodyModule setData(java.util.List<ListRbacRoleHierarchyResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRbacRoleHierarchyResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListRbacRoleHierarchyResponseBodyModule setNext(ListRbacRoleHierarchyResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListRbacRoleHierarchyResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListRbacRoleHierarchyResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListRbacRoleHierarchyResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRbacRoleHierarchyResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListRbacRoleHierarchyResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListRbacRoleHierarchyResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListRbacRoleHierarchyResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
