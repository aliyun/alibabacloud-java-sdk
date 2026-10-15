// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListIsvPaymentPluginConfigsResponseBody extends TeaModel {
    /**
     * <p>The detailed reasons why access is denied.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Specifies whether retries are allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>The app name.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The dynamic code. This parameter is not used and can be ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace the <code>%s</code> placeholder in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The returned error parameters.</p>
     */
    @NameInMap("ErrorArgs")
    public java.util.List<?> errorArgs;

    /**
     * <p>The maximum number of results to return per query.</p>
     * <p>Valid values: 10 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Module")
    public java.util.List<ListIsvPaymentPluginConfigsResponseBodyModule> module;

    /**
     * <p>The token that is used to start the next query. If no more results are available, this value is empty.</p>
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

    public static ListIsvPaymentPluginConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIsvPaymentPluginConfigsResponseBody self = new ListIsvPaymentPluginConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIsvPaymentPluginConfigsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListIsvPaymentPluginConfigsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public ListIsvPaymentPluginConfigsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListIsvPaymentPluginConfigsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListIsvPaymentPluginConfigsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListIsvPaymentPluginConfigsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public ListIsvPaymentPluginConfigsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIsvPaymentPluginConfigsResponseBody setModule(java.util.List<ListIsvPaymentPluginConfigsResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<ListIsvPaymentPluginConfigsResponseBodyModule> getModule() {
        return this.module;
    }

    public ListIsvPaymentPluginConfigsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIsvPaymentPluginConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIsvPaymentPluginConfigsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public ListIsvPaymentPluginConfigsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public ListIsvPaymentPluginConfigsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class ListIsvPaymentPluginConfigsResponseBodyModule extends TeaModel {
        /**
         * <p>The business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250915163734000001</p>
         */
        @NameInMap("BizId")
        public String bizId;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("Extend")
        public java.util.Map<String, String> extend;

        /**
         * <p>The creation time. The value is a UNIX timestamp in seconds.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>1740479834</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The update time. The value is in the ISO 8601 format and the UTC time zone.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>16257</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The plugin configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PluginConfig")
        public String pluginConfig;

        /**
         * <p>The plugin description.</p>
         * 
         * <strong>example:</strong>
         * <p>a simple test plugin</p>
         */
        @NameInMap("PluginDesc")
        public String pluginDesc;

        /**
         * <p>The plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>tf_testaccapigatewayplugin29311</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>jugaocai.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListIsvPaymentPluginConfigsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ListIsvPaymentPluginConfigsResponseBodyModule self = new ListIsvPaymentPluginConfigsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setExtend(java.util.Map<String, String> extend) {
            this.extend = extend;
            return this;
        }
        public java.util.Map<String, String> getExtend() {
            return this.extend;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setPluginDesc(String pluginDesc) {
            this.pluginDesc = pluginDesc;
            return this;
        }
        public String getPluginDesc() {
            return this.pluginDesc;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListIsvPaymentPluginConfigsResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
