// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListMyAppPluginsResponseBody extends TeaModel {
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
     * <p>The application name. The name must start with a letter and can contain digits, letters, underscores (_), and hyphens (-). The name can be up to 36 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ish-intelligence-store-platform-admin-web</p>
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
     * <p>The error parameters returned.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The task object.</p>
     */
    @NameInMap("Module")
    public ListMyAppPluginsResponseBodyModule module;

    /**
     * <p>The request ID.</p>
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
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListMyAppPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyAppPluginsResponseBody self = new ListMyAppPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyAppPluginsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListMyAppPluginsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListMyAppPluginsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMyAppPluginsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMyAppPluginsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMyAppPluginsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListMyAppPluginsResponseBody setModule(ListMyAppPluginsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListMyAppPluginsResponseBodyModule getModule() {
        return this.module;
    }

    public ListMyAppPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMyAppPluginsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListMyAppPluginsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListMyAppPluginsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListMyAppPluginsResponseBodyModuleData extends TeaModel {
        /**
         * <p>The plug-in category.</p>
         * 
         * <strong>example:</strong>
         * <p>NormalMultimaster</p>
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
         * <p>2026-06-26T10:12:18.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1556529068000</p>
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
         * <p>-1</p>
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
         * <p>transformer</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The file status.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
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
         * <p>The visibility. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: public.</li>
         * <li><strong>PRIVATE</strong>: private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>visible</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListMyAppPluginsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListMyAppPluginsResponseBodyModuleData self = new ListMyAppPluginsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListMyAppPluginsResponseBodyModuleData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMyAppPluginsResponseBodyModuleData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMyAppPluginsResponseBodyModuleData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMyAppPluginsResponseBodyModuleData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMyAppPluginsResponseBodyModuleData setHotCount(Integer hotCount) {
            this.hotCount = hotCount;
            return this;
        }
        public Integer getHotCount() {
            return this.hotCount;
        }

        public ListMyAppPluginsResponseBodyModuleData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListMyAppPluginsResponseBodyModuleData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListMyAppPluginsResponseBodyModuleData setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListMyAppPluginsResponseBodyModuleData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMyAppPluginsResponseBodyModuleData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListMyAppPluginsResponseBodyModuleData setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListMyAppPluginsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>Converts controlType based on the associated public category.</p>
         * 
         * <strong>example:</strong>
         * <p>CRAC</p>
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
         * <p>@lADPDetfgMsFFUvNAkjNAkg</p>
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
         * <p>trafficControl</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The status. Valid values: unknown, init, testing, online.</p>
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
         * <p>The visibility. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC</strong>: public.</li>
         * <li><strong>PRIVATE</strong>: private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListMyAppPluginsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListMyAppPluginsResponseBodyModuleNext self = new ListMyAppPluginsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListMyAppPluginsResponseBodyModuleNext setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMyAppPluginsResponseBodyModuleNext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMyAppPluginsResponseBodyModuleNext setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMyAppPluginsResponseBodyModuleNext setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMyAppPluginsResponseBodyModuleNext setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListMyAppPluginsResponseBodyModuleNext setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListMyAppPluginsResponseBodyModuleNext setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListMyAppPluginsResponseBodyModuleNext setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMyAppPluginsResponseBodyModuleNext setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListMyAppPluginsResponseBodyModuleNext setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListMyAppPluginsResponseBodyModule extends TeaModel {
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
        public java.util.List<ListMyAppPluginsResponseBodyModuleData> data;

        /**
         * <p>The decision weight.</p>
         */
        @NameInMap("Next")
        public ListMyAppPluginsResponseBodyModuleNext next;

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
         * <p>In addition to pagination limits, the server processes a maximum of 1000 recent records for the current query. If the results exceed 1000 entries, <strong>ResultLimit</strong> is <strong>true</strong>. Narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static ListMyAppPluginsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListMyAppPluginsResponseBodyModule self = new ListMyAppPluginsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListMyAppPluginsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListMyAppPluginsResponseBodyModule setData(java.util.List<ListMyAppPluginsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListMyAppPluginsResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListMyAppPluginsResponseBodyModule setNext(ListMyAppPluginsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListMyAppPluginsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListMyAppPluginsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListMyAppPluginsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMyAppPluginsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListMyAppPluginsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListMyAppPluginsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListMyAppPluginsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
