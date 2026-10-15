// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListMyInstalledAppPluginsResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why access is denied.</p>
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
     * <p>dewuApp</p>
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
     * <p>The dynamic error message, which is used to replace the <code>%s</code> in the <strong>ErrMessage</strong> return parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
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
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListMyInstalledAppPluginsResponseBodyModule module;

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
     * <p>Indicates whether the request is processed synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListMyInstalledAppPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyInstalledAppPluginsResponseBody self = new ListMyInstalledAppPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyInstalledAppPluginsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListMyInstalledAppPluginsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListMyInstalledAppPluginsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMyInstalledAppPluginsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMyInstalledAppPluginsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMyInstalledAppPluginsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListMyInstalledAppPluginsResponseBody setModule(ListMyInstalledAppPluginsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListMyInstalledAppPluginsResponseBodyModule getModule() {
        return this.module;
    }

    public ListMyInstalledAppPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMyInstalledAppPluginsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListMyInstalledAppPluginsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListMyInstalledAppPluginsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListMyInstalledAppPluginsResponseBodyModuleData extends TeaModel {
        /**
         * <p>The Ray cluster type. Valid values:</p>
         * <ul>
         * <li><p>BASIC: basic type, non-high-availability.</p>
         * </li>
         * <li><p>HIGH_AVAILABILITY: high-availability type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high_performance</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The scenario description.</p>
         * 
         * <strong>example:</strong>
         * <p>lshm-mysql-coypt</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1763605196000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-11 16:05:43</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The popularity count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HotCount")
        public Integer hotCount;

        /**
         * <p>The plug-in icon.</p>
         * 
         * <strong>example:</strong>
         * <p>@lALPM2AwTOg9IUHNAUDNAUA</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alipay-isv</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The plug-in name.</p>
         * 
         * <strong>example:</strong>
         * <p>wx*</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The file status.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The API version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-29</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The visibility. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: Public.</li>
         * <li><strong>PRIVATE</strong>: Private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListMyInstalledAppPluginsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListMyInstalledAppPluginsResponseBodyModuleData self = new ListMyInstalledAppPluginsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setHotCount(Integer hotCount) {
            this.hotCount = hotCount;
            return this;
        }
        public Integer getHotCount() {
            return this.hotCount;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleData setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListMyInstalledAppPluginsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The category.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Depth\&quot;: 2, \&quot;ParentCategoryId\&quot;: 5260, \&quot;Name\&quot;: \&quot;2\&quot;, \&quot;CategoryId\&quot;: 5280, \&quot;CreateTime\&quot;: \&quot;2025-08-26 10:20:37\&quot;}</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The scenario description.</p>
         * 
         * <strong>example:</strong>
         * <p>lx_supabase_test_02</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-17 20:43:21</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-18T10:03:56+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The plug-in icon.</p>
         * 
         * <strong>example:</strong>
         * <p>@lADPD0-jULc8yJ3NC9DNC9A</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The bound API Gateway plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alipay-isv</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The plug-in name.</p>
         * 
         * <strong>example:</strong>
         * <p>errorMapping</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>Valid values: unknown, init, testing, online.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The API version number.</p>
         * 
         * <strong>example:</strong>
         * <p>V2.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>Filters by visibility level. Multiple values can be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListMyInstalledAppPluginsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListMyInstalledAppPluginsResponseBodyModuleNext self = new ListMyInstalledAppPluginsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListMyInstalledAppPluginsResponseBodyModuleNext setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListMyInstalledAppPluginsResponseBodyModule extends TeaModel {
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
        public java.util.List<ListMyInstalledAppPluginsResponseBodyModuleData> data;

        /**
         * <p>The decision weight.</p>
         */
        @NameInMap("Next")
        public ListMyInstalledAppPluginsResponseBodyModuleNext next;

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
         * <p>Apart from pagination limits, the server processes a maximum of 1000 recent records for the current query. If the results exceed 1000 entries, <strong>ResultLimit</strong> is <strong>true</strong>. Narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static ListMyInstalledAppPluginsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListMyInstalledAppPluginsResponseBodyModule self = new ListMyInstalledAppPluginsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListMyInstalledAppPluginsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setData(java.util.List<ListMyInstalledAppPluginsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListMyInstalledAppPluginsResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setNext(ListMyInstalledAppPluginsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListMyInstalledAppPluginsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListMyInstalledAppPluginsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
