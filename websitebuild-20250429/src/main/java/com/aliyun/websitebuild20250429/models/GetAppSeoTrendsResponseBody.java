// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSeoTrendsResponseBody extends TeaModel {
    /**
     * <p>Detailed reason for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Is retry allowed</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>Application name</p>
     * 
     * <strong>example:</strong>
     * <p>spring-cloud-b</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Dynamic error code</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR-oo1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>Dynamic error message.</p>
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
     * <p>Response data</p>
     */
    @NameInMap("Module")
    public GetAppSeoTrendsResponseBodyModule module;

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
     * <p>Backup parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Synchro")
    public Boolean synchro;

    public static GetAppSeoTrendsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppSeoTrendsResponseBody self = new GetAppSeoTrendsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppSeoTrendsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetAppSeoTrendsResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public GetAppSeoTrendsResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetAppSeoTrendsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetAppSeoTrendsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetAppSeoTrendsResponseBody setErrorArgs(java.util.List<?> errorArgs) {
        this.errorArgs = errorArgs;
        return this;
    }
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    public GetAppSeoTrendsResponseBody setModule(GetAppSeoTrendsResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetAppSeoTrendsResponseBodyModule getModule() {
        return this.module;
    }

    public GetAppSeoTrendsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppSeoTrendsResponseBody setRootErrorCode(String rootErrorCode) {
        this.rootErrorCode = rootErrorCode;
        return this;
    }
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    public GetAppSeoTrendsResponseBody setRootErrorMsg(String rootErrorMsg) {
        this.rootErrorMsg = rootErrorMsg;
        return this;
    }
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    public GetAppSeoTrendsResponseBody setSynchro(Boolean synchro) {
        this.synchro = synchro;
        return this;
    }
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static class GetAppSeoTrendsResponseBodyModule extends TeaModel {
        /**
         * <p>Baidu</p>
         * 
         * <strong>example:</strong>
         * <p>baiduIndexTrends</p>
         */
        @NameInMap("BaiduIndexTrends")
        public String baiduIndexTrends;

        /**
         * <p>Bing</p>
         * 
         * <strong>example:</strong>
         * <p>bingIndexTrends</p>
         */
        @NameInMap("BingIndexTrends")
        public String bingIndexTrends;

        /**
         * <p>Google</p>
         * 
         * <strong>example:</strong>
         * <p>googleIndexTrends</p>
         */
        @NameInMap("GoogleIndexTrends")
        public String googleIndexTrends;

        public static GetAppSeoTrendsResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetAppSeoTrendsResponseBodyModule self = new GetAppSeoTrendsResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetAppSeoTrendsResponseBodyModule setBaiduIndexTrends(String baiduIndexTrends) {
            this.baiduIndexTrends = baiduIndexTrends;
            return this;
        }
        public String getBaiduIndexTrends() {
            return this.baiduIndexTrends;
        }

        public GetAppSeoTrendsResponseBodyModule setBingIndexTrends(String bingIndexTrends) {
            this.bingIndexTrends = bingIndexTrends;
            return this;
        }
        public String getBingIndexTrends() {
            return this.bingIndexTrends;
        }

        public GetAppSeoTrendsResponseBodyModule setGoogleIndexTrends(String googleIndexTrends) {
            this.googleIndexTrends = googleIndexTrends;
            return this;
        }
        public String getGoogleIndexTrends() {
            return this.googleIndexTrends;
        }

    }

}
