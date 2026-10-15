// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacUserRolesResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
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
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public QueryRbacUserRolesResponseBodyModule module;

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
     * <p>System exception</p>
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

    public static QueryRbacUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRbacUserRolesResponseBody self = new QueryRbacUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRbacUserRolesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryRbacUserRolesResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryRbacUserRolesResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryRbacUserRolesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryRbacUserRolesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryRbacUserRolesResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public QueryRbacUserRolesResponseBody setModule(QueryRbacUserRolesResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryRbacUserRolesResponseBodyModule getModule() {
        return this.module;
    }

    public QueryRbacUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRbacUserRolesResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public QueryRbacUserRolesResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public QueryRbacUserRolesResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class QueryRbacUserRolesResponseBodyModuleData extends TeaModel {
        /**
         * <p>The creation time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
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
         * <p>9953352</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The enterprise identifier, also known as the enterprise ID, in string format. You can obtain it from the Yunxiao access URL, such as <a href="https://devops.aliyun.com/organization/%E3%80%90OrgId%E3%80%91">https://devops.aliyun.com/organization/【OrgId】</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>5ffd468b1e45db3c1cc26ad6</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The preset workspace role ID. Existing roles are overwritten. Valid values:</p>
         * <ul>
         * <li>25: workspace administrator</li>
         * <li>26: workspace developer</li>
         * <li>27: workspace analyst</li>
         * <li>30: workspace viewer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>111111112</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The site end-user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryRbacUserRolesResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            QueryRbacUserRolesResponseBodyModuleData self = new QueryRbacUserRolesResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public QueryRbacUserRolesResponseBodyModuleData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryRbacUserRolesResponseBodyModuleData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRbacUserRolesResponseBodyModuleData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public QueryRbacUserRolesResponseBodyModuleData setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public QueryRbacUserRolesResponseBodyModuleData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryRbacUserRolesResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The creation time. The time is in the ISO 8601 format in UTC (Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-05T02:10:20Z</p>
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
         * <p>The enterprise organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org_f93535f3d7a94e6093276bcfb35d4801</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The role ID. This is a unique identifier automatically generated by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>2113b424-8164-482f-a7a6-ccd0a2ffcb38</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        /**
         * <p>The site end-user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryRbacUserRolesResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            QueryRbacUserRolesResponseBodyModuleNext self = new QueryRbacUserRolesResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public QueryRbacUserRolesResponseBodyModuleNext setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryRbacUserRolesResponseBodyModuleNext setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRbacUserRolesResponseBodyModuleNext setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public QueryRbacUserRolesResponseBodyModuleNext setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

        public QueryRbacUserRolesResponseBodyModuleNext setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryRbacUserRolesResponseBodyModule extends TeaModel {
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
        public java.util.List<QueryRbacUserRolesResponseBodyModuleData> data;

        /**
         * <p>The next feature ID.</p>
         */
        @NameInMap("Next")
        public QueryRbacUserRolesResponseBodyModuleNext next;

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
         * <p>Apart from the pagination limit, the server processes up to 1,000 recent records for the current query. If the results exceed 1,000 records, <strong>ResultLimit</strong> is <strong>true</strong>. Narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static QueryRbacUserRolesResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryRbacUserRolesResponseBodyModule self = new QueryRbacUserRolesResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryRbacUserRolesResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public QueryRbacUserRolesResponseBodyModule setData(java.util.List<QueryRbacUserRolesResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRbacUserRolesResponseBodyModuleData> getData() {
            return this.data;
        }

        public QueryRbacUserRolesResponseBodyModule setNext(QueryRbacUserRolesResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public QueryRbacUserRolesResponseBodyModuleNext getNext() {
            return this.next;
        }

        public QueryRbacUserRolesResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public QueryRbacUserRolesResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRbacUserRolesResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public QueryRbacUserRolesResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public QueryRbacUserRolesResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public QueryRbacUserRolesResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
