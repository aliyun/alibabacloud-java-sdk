// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryRbacRolePermissionsResponseBody extends TeaModel {
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
    public QueryRbacRolePermissionsResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

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
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<QueryRbacRolePermissionsResponseBodyModuleData> data;

        @NameInMap("Next")
        public QueryRbacRolePermissionsResponseBodyModuleNext next;

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
