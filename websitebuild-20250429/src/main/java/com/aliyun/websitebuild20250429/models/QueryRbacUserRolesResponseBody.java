// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacUserRolesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    @NameInMap("Module")
    public QueryRbacUserRolesResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

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
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("RoleId")
        public String roleId;

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
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("RoleId")
        public String roleId;

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
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<QueryRbacUserRolesResponseBodyModuleData> data;

        @NameInMap("Next")
        public QueryRbacUserRolesResponseBodyModuleNext next;

        @NameInMap("NextPage")
        public Boolean nextPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PrePage")
        public Boolean prePage;

        @NameInMap("ResultLimit")
        public Boolean resultLimit;

        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

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
