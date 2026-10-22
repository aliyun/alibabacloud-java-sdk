// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPluginResponseBody extends TeaModel {
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
     * <p>The dynamic error message, which is used to replace <code>%s</code> in the error message returned by the <strong>ErrMessage</strong> parameter.</p>
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
     * <p>The returned error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The application module.</p>
     */
    @NameInMap("Module")
    public GetAppPluginResponseBodyModule module;

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

    public static GetAppPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppPluginResponseBody self = new GetAppPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppPluginResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppPluginResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppPluginResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppPluginResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppPluginResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppPluginResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppPluginResponseBody setModule(GetAppPluginResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppPluginResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppPluginResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppPluginResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppPluginResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppPluginResponseBodyModule extends TeaModel {
        /**
         * <p>The category.</p>
         * 
         * <strong>example:</strong>
         * <p>Archive</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The configuration form in React JSON Schema format.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ConfigItems")
        public String configItems;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>adminSubuser(264859988988056208)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>/bak-&gt;serverless.handler(2020091300200279)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image display mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (None): The image is not displayed.</li>
         * <li><strong>1</strong> (Always): The image is always displayed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>always</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <p>Indicates whether scheduled delivery of resource snapshots is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;deliveryNodeName&quot;:&quot;Bind domain name and publish&quot;,&quot;deliveryNodeStatus&quot;:&quot;Finish&quot;,&quot;deliveryOperatorRole&quot;:&quot;Provider&quot;}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.1.0</p>
         */
        @NameInMap("GitRef")
        public String gitRef;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The hook definitions.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Hooks")
        public String hooks;

        /**
         * <p>The popularity.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HotCount")
        public Integer hotCount;

        /**
         * <p>The plugin description.</p>
         * 
         * <strong>example:</strong>
         * <p>@lALPM2AwTOg9IUHNAUDNAUA</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The ID of the associated API gateway plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The name of the plugin. The name must be 4 to 50 characters in length and can contain uppercase and lowercase letters, Chinese characters, digits, and underscores (_). It cannot start with an underscore.</p>
         * 
         * <strong>example:</strong>
         * <p>tf_testaccapigatewayplugin29311</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The URL of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RepositoryUrl")
        public String repositoryUrl;

        /**
         * <p>The skill header information for model selection.</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("SkillHeader")
        public String skillHeader;

        /**
         * <p>trial,draft,live,refunded,expired,released</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The category tags.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Key\&quot;: \&quot;kubernetes.io/cluster-id\&quot;, \&quot;Value\&quot;: \&quot;cc67198b13db948c9848599654da5586e\&quot;}, {\&quot;Key\&quot;: \&quot;created-by\&quot;, \&quot;Value\&quot;: \&quot;alibabacloud-imagecache-controller\&quot;}]</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The version of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-02</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p><strong>The visibility level.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        @NameInMap("Visibility")
        public String visibility;

        public static GetAppPluginResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppPluginResponseBodyModule self = new GetAppPluginResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppPluginResponseBodyModule setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetAppPluginResponseBodyModule setConfigItems(String configItems) {
            this.configItems = configItems;
            return this;
        }
        public String getConfigItems() {
            return this.configItems;
        }

        public GetAppPluginResponseBodyModule setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetAppPluginResponseBodyModule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAppPluginResponseBodyModule setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public GetAppPluginResponseBodyModule setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public GetAppPluginResponseBodyModule setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetAppPluginResponseBodyModule setGitRef(String gitRef) {
            this.gitRef = gitRef;
            return this;
        }
        public String getGitRef() {
            return this.gitRef;
        }

        public GetAppPluginResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAppPluginResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAppPluginResponseBodyModule setHooks(String hooks) {
            this.hooks = hooks;
            return this;
        }
        public String getHooks() {
            return this.hooks;
        }

        public GetAppPluginResponseBodyModule setHotCount(Integer hotCount) {
            this.hotCount = hotCount;
            return this;
        }
        public Integer getHotCount() {
            return this.hotCount;
        }

        public GetAppPluginResponseBodyModule setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetAppPluginResponseBodyModule setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetAppPluginResponseBodyModule setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public GetAppPluginResponseBodyModule setRepositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            return this;
        }
        public String getRepositoryUrl() {
            return this.repositoryUrl;
        }

        public GetAppPluginResponseBodyModule setSkillHeader(String skillHeader) {
            this.skillHeader = skillHeader;
            return this;
        }
        public String getSkillHeader() {
            return this.skillHeader;
        }

        public GetAppPluginResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAppPluginResponseBodyModule setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetAppPluginResponseBodyModule setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAppPluginResponseBodyModule setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

}
