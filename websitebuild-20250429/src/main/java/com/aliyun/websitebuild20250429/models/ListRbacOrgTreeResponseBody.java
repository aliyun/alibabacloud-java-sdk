// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacOrgTreeResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether a retry is allowed.</p>
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
     * <p>or</p>
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
     * <p>The dynamic error message, which is used to replace the <code>%s</code> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p>For example, if <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the <strong>DtsJobId</strong> request parameter is invalid.</p>
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
     * <p>The maximum number of entries per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The task object.</p>
     */
    @NameInMap("Module")
    public ListRbacOrgTreeResponseBodyModule module;

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
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListRbacOrgTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRbacOrgTreeResponseBody self = new ListRbacOrgTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRbacOrgTreeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListRbacOrgTreeResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListRbacOrgTreeResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListRbacOrgTreeResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListRbacOrgTreeResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListRbacOrgTreeResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListRbacOrgTreeResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRbacOrgTreeResponseBody setModule(ListRbacOrgTreeResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListRbacOrgTreeResponseBodyModule getModule() {
        return this.module;
    }

    public ListRbacOrgTreeResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRbacOrgTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRbacOrgTreeResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListRbacOrgTreeResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListRbacOrgTreeResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListRbacOrgTreeResponseBodyModuleData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-08T02:28:26Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The directory level.</p>
         * 
         * <strong>example:</strong>
         * <p>FirstChildDepth</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>9953352</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>文件名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The script path.</p>
         */
        @NameInMap("Path")
        public String path;

        public static ListRbacOrgTreeResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListRbacOrgTreeResponseBodyModuleData self = new ListRbacOrgTreeResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListRbacOrgTreeResponseBodyModuleData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRbacOrgTreeResponseBodyModuleData setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ListRbacOrgTreeResponseBodyModuleData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacOrgTreeResponseBodyModuleData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRbacOrgTreeResponseBodyModuleData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListRbacOrgTreeResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The creation date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-15T02:29:22Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The category level. The root category is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>1000039405002</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>docs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The request path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/h6sRMdP&amp;LTdQz/44ImvD/JtjSeUza/wVcp1i/dsxnl0FlL0/bvL/d+0~V6Fi5+R/P8ebktwGxe/l&amp;AqBD_/Y+TstdpTo06U_Q/4i4:EDPGo/7.fIVgd.//AOJtXP5/X</p>
         */
        @NameInMap("Path")
        public String path;

        public static ListRbacOrgTreeResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListRbacOrgTreeResponseBodyModuleNext self = new ListRbacOrgTreeResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListRbacOrgTreeResponseBodyModuleNext setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRbacOrgTreeResponseBodyModuleNext setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListRbacOrgTreeResponseBodyModule extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>The request results.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListRbacOrgTreeResponseBodyModuleData> data;

        /**
         * <p>The next feature ID.</p>
         */
        @NameInMap("Next")
        public ListRbacOrgTreeResponseBodyModuleNext next;

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
         * <p>Indicates whether the server processes a maximum of 1,000 most recent records beyond the pagination limit. If the results exceed 1,000 entries, <strong>ResultLimit</strong> is <strong>true</strong>, and you must narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static ListRbacOrgTreeResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListRbacOrgTreeResponseBodyModule self = new ListRbacOrgTreeResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListRbacOrgTreeResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListRbacOrgTreeResponseBodyModule setData(java.util.List<ListRbacOrgTreeResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRbacOrgTreeResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListRbacOrgTreeResponseBodyModule setNext(ListRbacOrgTreeResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListRbacOrgTreeResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListRbacOrgTreeResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListRbacOrgTreeResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRbacOrgTreeResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListRbacOrgTreeResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListRbacOrgTreeResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListRbacOrgTreeResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
