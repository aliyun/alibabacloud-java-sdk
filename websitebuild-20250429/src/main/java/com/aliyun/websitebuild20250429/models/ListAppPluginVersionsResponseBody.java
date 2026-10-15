// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginVersionsResponseBody extends TeaModel {
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
     * <p>The dynamic message. Currently not in use. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error parameters returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListAppPluginVersionsResponseBodyModule module;

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
     * <p>System exception.</p>
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

    public static ListAppPluginVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginVersionsResponseBody self = new ListAppPluginVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppPluginVersionsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppPluginVersionsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppPluginVersionsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppPluginVersionsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppPluginVersionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppPluginVersionsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppPluginVersionsResponseBody setModule(ListAppPluginVersionsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListAppPluginVersionsResponseBodyModule getModule() {
        return this.module;
    }

    public ListAppPluginVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppPluginVersionsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppPluginVersionsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppPluginVersionsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppPluginVersionsResponseBodyModuleData extends TeaModel {
        /**
         * <p>The version changelog.</p>
         * 
         * <strong>example:</strong>
         * <p>x x x</p>
         */
        @NameInMap("Changelog")
        public String changelog;

        /**
         * <p>The commit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CommitSha")
        public String commitSha;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>yinr</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The current number of files in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FileCount")
        public Integer fileCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-24T02:29:03.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The file status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The application instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>V2.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAppPluginVersionsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListAppPluginVersionsResponseBodyModuleData self = new ListAppPluginVersionsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListAppPluginVersionsResponseBodyModuleData setChangelog(String changelog) {
            this.changelog = changelog;
            return this;
        }
        public String getChangelog() {
            return this.changelog;
        }

        public ListAppPluginVersionsResponseBodyModuleData setCommitSha(String commitSha) {
            this.commitSha = commitSha;
            return this;
        }
        public String getCommitSha() {
            return this.commitSha;
        }

        public ListAppPluginVersionsResponseBodyModuleData setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListAppPluginVersionsResponseBodyModuleData setFileCount(Integer fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Integer getFileCount() {
            return this.fileCount;
        }

        public ListAppPluginVersionsResponseBodyModuleData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppPluginVersionsResponseBodyModuleData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppPluginVersionsResponseBodyModuleData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAppPluginVersionsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The version changelog.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Changelog")
        public String changelog;

        /**
         * <p>The commit ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CommitSha")
        public String commitSha;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>adminSubuser(264859988988056208)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The current number of files in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FileCount")
        public Integer fileCount;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-17 20:43:21</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Valid values: unknown, init, testing, online.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The application instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>V2.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListAppPluginVersionsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListAppPluginVersionsResponseBodyModuleNext self = new ListAppPluginVersionsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListAppPluginVersionsResponseBodyModuleNext setChangelog(String changelog) {
            this.changelog = changelog;
            return this;
        }
        public String getChangelog() {
            return this.changelog;
        }

        public ListAppPluginVersionsResponseBodyModuleNext setCommitSha(String commitSha) {
            this.commitSha = commitSha;
            return this;
        }
        public String getCommitSha() {
            return this.commitSha;
        }

        public ListAppPluginVersionsResponseBodyModuleNext setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public ListAppPluginVersionsResponseBodyModuleNext setFileCount(Integer fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Integer getFileCount() {
            return this.fileCount;
        }

        public ListAppPluginVersionsResponseBodyModuleNext setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppPluginVersionsResponseBodyModuleNext setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppPluginVersionsResponseBodyModuleNext setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAppPluginVersionsResponseBodyModule extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>The query results.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListAppPluginVersionsResponseBodyModuleData> data;

        /**
         * <p>The decision weight.</p>
         */
        @NameInMap("Next")
        public ListAppPluginVersionsResponseBodyModuleNext next;

        /**
         * <p>Indicates whether a next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("NextPage")
        public Boolean nextPage;

        /**
         * <p>The number of entries per page.</p>
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
         * <p>Apart from pagination limits, the server processes a maximum of 1000 recent records for the current query. If the results exceed 1000 records, <strong>ResultLimit</strong> is <strong>true</strong>, and you need to narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static ListAppPluginVersionsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppPluginVersionsResponseBodyModule self = new ListAppPluginVersionsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppPluginVersionsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListAppPluginVersionsResponseBodyModule setData(java.util.List<ListAppPluginVersionsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListAppPluginVersionsResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListAppPluginVersionsResponseBodyModule setNext(ListAppPluginVersionsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListAppPluginVersionsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListAppPluginVersionsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListAppPluginVersionsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAppPluginVersionsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListAppPluginVersionsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListAppPluginVersionsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListAppPluginVersionsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
