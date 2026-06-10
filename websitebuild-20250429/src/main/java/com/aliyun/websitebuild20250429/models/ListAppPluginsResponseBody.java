// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginsResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether retry is allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>Application name. Query the application with this name.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.  </p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the provided request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM_ERROR</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>Returned error parameters</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>Number of results per query.  </p>
     * <p>Value range: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("Module")
    public java.util.List<ListAppPluginsResponseBodyModule> module;

    /**
     * <p>Token for starting the next query. It is empty if there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3BFw8paIJ7ylB6A7Qn9JjM</p>
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
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM.ERROR</p>
     */
    @NameInMap("RootErrorCode")
    public String rootErrorCode;

    /**
     * <p>Abnormal message</p>
     * 
     * <strong>example:</strong>
     * <p>系统异常</p>
     */
    @NameInMap("RootErrorMsg")
    public String rootErrorMsg;

    /**
     * <p>Reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static ListAppPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginsResponseBody self = new ListAppPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppPluginsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAppPluginsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListAppPluginsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppPluginsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAppPluginsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAppPluginsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListAppPluginsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAppPluginsResponseBody setModule(java.util.List<ListAppPluginsResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<ListAppPluginsResponseBodyModule> getModule() {
        return this.module;
    }

    public ListAppPluginsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAppPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppPluginsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListAppPluginsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListAppPluginsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListAppPluginsResponseBodyModule extends TeaModel {
        /**
         * <p>plugin code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Configuration form in React JSON Schema format</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ConfigItems")
        public String configItems;

        /**
         * <p>plugin Description</p>
         * 
         * <strong>example:</strong>
         * <p>fail to decode json</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Image display. Valid values:  </p>
         * <ul>
         * <li><strong>0</strong> (None): Do not display.  </li>
         * <li><strong>1</strong> (Always): Always display.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>always</p>
         */
        @NameInMap("Display")
        public Integer display;

        /**
         * <p>Indicates whether scheduled delivery of resource snapshots is enabled.  </p>
         * <p>Valid values:  </p>
         * <ul>
         * <li>true: Enabled.  </li>
         * <li>false: Shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Integer enabled;

        /**
         * <p>environment</p>
         * 
         * <strong>example:</strong>
         * <p>pre</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>Creation Time</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>Updated At</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>hook definitions</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Hooks")
        public String hooks;

        /**
         * <p>plugin Description</p>
         * 
         * <strong>example:</strong>
         * <p>@lALPM2AwTOg9IUHNAUDNAUA</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>primary key</p>
         * 
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the item has been deleted: 0—No, 1—Yes</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDeleted")
        public Integer isDeleted;

        /**
         * <p>plugin Name</p>
         * 
         * <strong>example:</strong>
         * <p>文件名</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>skill header, used by the model for selection</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("SkillHeader")
        public String skillHeader;

        /**
         * <p>Categorization label</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Key\&quot;: \&quot;kubernetes.io/cluster-id\&quot;, \&quot;Value\&quot;: \&quot;cc67198b13db948c9848599654da5586e\&quot;}, {\&quot;Key\&quot;: \&quot;created-by\&quot;, \&quot;Value\&quot;: \&quot;alibabacloud-imagecache-controller\&quot;}]</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static ListAppPluginsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListAppPluginsResponseBodyModule self = new ListAppPluginsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListAppPluginsResponseBodyModule setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListAppPluginsResponseBodyModule setConfigItems(String configItems) {
            this.configItems = configItems;
            return this;
        }
        public String getConfigItems() {
            return this.configItems;
        }

        public ListAppPluginsResponseBodyModule setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListAppPluginsResponseBodyModule setDisplay(Integer display) {
            this.display = display;
            return this;
        }
        public Integer getDisplay() {
            return this.display;
        }

        public ListAppPluginsResponseBodyModule setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

        public ListAppPluginsResponseBodyModule setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListAppPluginsResponseBodyModule setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListAppPluginsResponseBodyModule setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListAppPluginsResponseBodyModule setHooks(String hooks) {
            this.hooks = hooks;
            return this;
        }
        public String getHooks() {
            return this.hooks;
        }

        public ListAppPluginsResponseBodyModule setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAppPluginsResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppPluginsResponseBodyModule setIsDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        public ListAppPluginsResponseBodyModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppPluginsResponseBodyModule setSkillHeader(String skillHeader) {
            this.skillHeader = skillHeader;
            return this;
        }
        public String getSkillHeader() {
            return this.skillHeader;
        }

        public ListAppPluginsResponseBodyModule setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
