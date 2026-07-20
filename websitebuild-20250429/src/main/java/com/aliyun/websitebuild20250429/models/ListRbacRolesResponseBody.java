// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacRolesResponseBody extends TeaModel {
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
     * <p>The application name.</p>
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
     * <p>The dynamic message. This parameter is not in use. Ignore this parameter.</p>
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
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListRbacRolesResponseBodyModule module;

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
     * <p>The error message.</p>
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

    public static ListRbacRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRbacRolesResponseBody self = new ListRbacRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRbacRolesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListRbacRolesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListRbacRolesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListRbacRolesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListRbacRolesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListRbacRolesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListRbacRolesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRbacRolesResponseBody setModule(ListRbacRolesResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListRbacRolesResponseBodyModule getModule() {
        return this.module;
    }

    public ListRbacRolesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRbacRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRbacRolesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListRbacRolesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListRbacRolesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListRbacRolesResponseBodyModuleData extends TeaModel {
        /**
         * <p>The creation date.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>9953352</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether this is the default report. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not the default report.</li>
         * <li><strong>1</strong>: The default report.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>Indicates whether this is a system-defined approval template. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         */
        @NameInMap("IsSystem")
        public Boolean isSystem;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun:dnm329@cn-shanghai+dir-8452400651</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>文件名</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListRbacRolesResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListRbacRolesResponseBodyModuleData self = new ListRbacRolesResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListRbacRolesResponseBodyModuleData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRbacRolesResponseBodyModuleData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacRolesResponseBodyModuleData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListRbacRolesResponseBodyModuleData setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        public ListRbacRolesResponseBodyModuleData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListRbacRolesResponseBodyModuleData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRbacRolesResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-27 16:02:28</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>1000039405002</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether this is the default private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>Indicates whether this is a system-defined approval template. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No.</li>
         * </ul>
         */
        @NameInMap("IsSystem")
        public Boolean isSystem;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>label-03\&quot;&amp;$(curl D93PCxNZ.popscan.xaliyun.com)%3B</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>docs</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListRbacRolesResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListRbacRolesResponseBodyModuleNext self = new ListRbacRolesResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListRbacRolesResponseBodyModuleNext setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRbacRolesResponseBodyModuleNext setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRbacRolesResponseBodyModuleNext setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListRbacRolesResponseBodyModuleNext setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        public ListRbacRolesResponseBodyModuleNext setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListRbacRolesResponseBodyModuleNext setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRbacRolesResponseBodyModule extends TeaModel {
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
        public java.util.List<ListRbacRolesResponseBodyModuleData> data;

        /**
         * <p>The decision weight.</p>
         */
        @NameInMap("Next")
        public ListRbacRolesResponseBodyModuleNext next;

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
         * <p>50</p>
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
         * <p>Indicates whether the query results exceed the server-side limit of 1,000 records (excluding pagination limits). If the results exceed 1,000 entries, <strong>ResultLimit</strong> is <strong>true</strong>. Narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static ListRbacRolesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListRbacRolesResponseBodyModule self = new ListRbacRolesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListRbacRolesResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListRbacRolesResponseBodyModule setData(java.util.List<ListRbacRolesResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListRbacRolesResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListRbacRolesResponseBodyModule setNext(ListRbacRolesResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListRbacRolesResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListRbacRolesResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListRbacRolesResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRbacRolesResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListRbacRolesResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListRbacRolesResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListRbacRolesResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
