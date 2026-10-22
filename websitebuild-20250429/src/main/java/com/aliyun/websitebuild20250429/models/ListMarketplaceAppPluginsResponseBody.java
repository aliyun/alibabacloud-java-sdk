// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListMarketplaceAppPluginsResponseBody extends TeaModel {
    /**
     * <p>The detailed reason for the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retries are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The name of the application.</p>
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
     * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The returned error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public ListMarketplaceAppPluginsResponseBodyModule module;

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

    public static ListMarketplaceAppPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMarketplaceAppPluginsResponseBody self = new ListMarketplaceAppPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMarketplaceAppPluginsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListMarketplaceAppPluginsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListMarketplaceAppPluginsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListMarketplaceAppPluginsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMarketplaceAppPluginsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMarketplaceAppPluginsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListMarketplaceAppPluginsResponseBody setModule(ListMarketplaceAppPluginsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ListMarketplaceAppPluginsResponseBodyModule getModule() {
        return this.module;
    }

    public ListMarketplaceAppPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMarketplaceAppPluginsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListMarketplaceAppPluginsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListMarketplaceAppPluginsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListMarketplaceAppPluginsResponseBodyModuleData extends TeaModel {
        /**
         * <p>The category of the system cloud disk. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud: basic disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
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
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1756951455000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1556529068000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The popularity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HotCount")
        public Integer hotCount;

        /**
         * <p>The plug-in description.</p>
         * 
         * <strong>example:</strong>
         * <p>@lALPM2X6xumibpPNAgDNAgA</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>chat-ai</p>
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
         * <p>PRIVATE</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListMarketplaceAppPluginsResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            ListMarketplaceAppPluginsResponseBodyModuleData self = new ListMarketplaceAppPluginsResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setHotCount(Integer hotCount) {
            this.hotCount = hotCount;
            return this;
        }
        public Integer getHotCount() {
            return this.hotCount;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleData setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListMarketplaceAppPluginsResponseBodyModuleNext extends TeaModel {
        /**
         * <p>The category of data cloud disk N. Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: standard SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;: 0, \&quot;Name\&quot;: u\&quot;\u81ea\u52a8\u521b\u5efacom.alibaba.cloudrobot.apitest.resource.AbstractResource1773800213419\&quot;, \&quot;BizCode\&quot;: \&quot;\&quot;, \&quot;CategoryId\&quot;: 30000941833, \&quot;ParentCategoryId\&quot;: 30000941832}</p>
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
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-18T10:03:56+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The plug-in description.</p>
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
         * <p>tf_testaccapigatewayplugin68046</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The status. Valid values: unknown, init, testing, and online.</p>
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
         * <p>Indicates whether the bucket to which the uploaded file belongs is publicly accessible. Valid values: <strong>public</strong> and <strong>private</strong>. A value of public indicates that the file is uploaded to a public bucket. A value of private indicates that the file is uploaded to a private bucket and requires authorization for access.</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static ListMarketplaceAppPluginsResponseBodyModuleNext build(java.util.Map<String, ?> map) throws Exception {
            ListMarketplaceAppPluginsResponseBodyModuleNext self = new ListMarketplaceAppPluginsResponseBodyModuleNext();
            return TeaModel.build(map, self);
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListMarketplaceAppPluginsResponseBodyModuleNext setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class ListMarketplaceAppPluginsResponseBodyModule extends TeaModel {
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
        public java.util.List<ListMarketplaceAppPluginsResponseBodyModuleData> data;

        /**
         * <p>The next feature ID.</p>
         */
        @NameInMap("Next")
        public ListMarketplaceAppPluginsResponseBodyModuleNext next;

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
         * <p>In addition to the pagination limit, the server processes a maximum of the latest 1,000 records for the current query. If the number of results exceeds 1,000, <strong>ResultLimit</strong> is <strong>true</strong>. In this case, narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
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

        public static ListMarketplaceAppPluginsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListMarketplaceAppPluginsResponseBodyModule self = new ListMarketplaceAppPluginsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListMarketplaceAppPluginsResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setData(java.util.List<ListMarketplaceAppPluginsResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListMarketplaceAppPluginsResponseBodyModuleData> getData() {
            return this.data;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setNext(ListMarketplaceAppPluginsResponseBodyModuleNext next) {
            this.next = next;
            return this;
        }
        public ListMarketplaceAppPluginsResponseBodyModuleNext getNext() {
            return this.next;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setNextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }
        public Boolean getNextPage() {
            return this.nextPage;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setPrePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }
        public Boolean getPrePage() {
            return this.prePage;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setResultLimit(Boolean resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public ListMarketplaceAppPluginsResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
